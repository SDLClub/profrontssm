package com.ykx.wxpay;

import java.io.InputStream;

/**
 * 商户 配置
 */
public class MyConfig extends WXPayConfig {

     String getAppID(){
         return "wx632c8f211f8122c6";
    }


     String getMchID(){
         return "1497984412";
    }


     IWXPayDomain getWXPayDomain(){
        return  new MyWXPayDomain();
    }


    /**
     * 获取 API 密钥
     *
     * @return API密钥
     */
     String getKey(){
         return "sbNCm1JnevqI36LrEaxFwcaT0hkGxFnC";
    }


    /**
     * 获取商户证书内容
     *
     * @return 商户证书内容
     */
     InputStream getCertStream(){
        return null;
    }
}
