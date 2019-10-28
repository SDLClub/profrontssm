package com.ykx.entity;

public class R {
    private Integer code;
    private boolean success;
    private String massage;
    private Object data;

    public static R ok(){
        R r = new R();
        r.setCode(100001);
        r.setSuccess(true);
        return r;
    }

    public static R ok(Object obj){
        R r = new R();
        r.setCode(100001);
        r.setSuccess(true);
        r.setData(obj);
        return r;
    }

    public static R error(String massage){
        R r = new R();
        r.setCode(100001);
        r.setSuccess(false);
        r.setMassage(massage);
        return r;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "R{" +
                "code=" + code +
                ", success=" + success +
                ", massage='" + massage + '\'' +
                ", data=" + data +
                '}';
    }
}
