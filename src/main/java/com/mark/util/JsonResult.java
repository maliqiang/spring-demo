package com.mark.util;

/**
 * 操作结果
 * Created by maliqiang on 2017/2/7.
 */
public class JsonResult {
    private String msg;
    private Integer code;
    private boolean isSuccess;
    private Object data;

    public JsonResult(){
        this.code = 0;
        this.isSuccess = true;
    }

    public JsonResult(boolean isSuccess,String msg){
        this.code = 0;
        this.msg = msg;
        this.isSuccess = true;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
