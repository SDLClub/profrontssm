package com.ykx.controller;

import com.ykx.util.CodeCreateUtil;
import com.ykx.wxpay.MyConfig;
import com.ykx.wxpay.WXPay;
import io.goeasy.GoEasy;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/api/code")
public class PayController {

    @RequestMapping("{orderCode}")
    public void createCode(@PathVariable String orderCode, HttpServletResponse response) throws Exception {
        /*微信支付*/
        MyConfig config = new MyConfig();
        WXPay wxpay = new WXPay(config);

        Map<String, String> data = new HashMap<String, String>();
        data.put("body", "拼夕夕商品-支付");
        data.put("out_trade_no", orderCode);
        data.put("device_info", "");
        data.put("fee_type", "CNY");
        data.put("total_fee", "1");
        data.put("spbill_create_ip", "123.12.12.123");
        data.put("notify_url", "http://awgc2k.natappfree.cc/api/code/notify");
        data.put("trade_type", "NATIVE");
        data.put("product_id", "12");

        Map<String, String> resp = wxpay.unifiedOrder(data);
        System.out.println(resp);
        //支付url的地址
        String codeUrl = resp.get("code_url");
        //url   --> zxing ---->生成二维码
        CodeCreateUtil.qrcode(codeUrl,response);

    }


    @RequestMapping("/notify")
    public void notifyUrl(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("====微信回信内容===");
        InputStream inputStream =  request.getInputStream();
        byte[] bytes = new byte[1024];
        int length = 0;
        StringBuffer sb = new StringBuffer();
        while( (length=inputStream.read()) ==-1 ){
            sb.append(new String(bytes,0,length));
        }
        System.out.println("回信内容");
        System.out.println(sb.toString());

        response.getWriter().write("<xml><return_code><![CDATA[SUCCESS]]></return_code><return_msg><![CDATA[OK]]></return_msg></xml>");

        // 通知前台 消息已经成功，跳转页面
        GoEasy goEasy = new GoEasy("http://rest-hangzhou.goeasy.io", "BC-0ebe24422c2b428ca2394cf55a021846");
        goEasy.publish("channel", "success");
    }

}
