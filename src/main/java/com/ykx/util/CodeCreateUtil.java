package com.ykx.util;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;

public class CodeCreateUtil {

    public static void qrcode(String uri,HttpServletResponse response) throws URISyntaxException , IOException {

        //uri = "http://www.baidu.com";
        HashMap<EncodeHintType,Object> hits = new HashMap<>();
        hits.put(EncodeHintType.CHARACTER_SET,"UTF-8");
        hits.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.M);
        hits.put(EncodeHintType.MARGIN,2);
        BitMatrix bitMatrix = null;
        try {
            bitMatrix = new MultiFormatWriter().encode(uri, BarcodeFormat.QR_CODE,200,
                    200,hits);
            MatrixToImageWriter.writeToStream(bitMatrix,"PNG",response.getOutputStream());
            System.out.println("创建二维码完成");
        } catch (WriterException e) {
            e.printStackTrace();
        }

    }

}
