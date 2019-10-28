package com.ykx.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CodeUtil {
    public static String code(){
        // Math.random();
        //年月日+时分秒
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        return  sdf.format(new Date());
    }
}
