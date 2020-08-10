package com.liusx.common.lang;

import lombok.Data;

import java.io.Serializable;

/**
 * description: Result <br>
 * date: 2020/8/10 14:16 <br>
 * author: liusx <br>
 * version: 1.0 <br>
 */
@Data
public class Result implements Serializable {

    private int code;//消息代码，200代表请求成功400代表请求失败
    private String msg;//消息内容
    private Object data;//返回信息

    public static Result success(Object data){

        return success(200,"请求成功",data);
    }

    public static Result success(int code,String msg,Object data){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(data);
        return result;
    }


    public static Result fail(String msg){

        return fail(400,msg,null);
    }

    public static Result fail(int code,String msg,String data){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(data);
        return result;
    }
}
