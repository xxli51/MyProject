package com.example.demo.result;

/**
 * @author "LiXunXun"
 * @date 2020/1/14 0014
 */
public class Result {

    //响应码
    private int code;
    private Object data;
    private String message;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Result(int code,Object data,String message) {
        this.code = code;
        this.data = data;
        this.message = message;
    }
}
