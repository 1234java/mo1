package com.zking.ssm.base.model;

import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author mi
 * @create 2019-05-02 10:03
 */

@Data
@ToString
@Component

public class ResponseResult<T> implements Serializable {

    //状态
    private Integer status;

    //状态信息
    private String message;

    //数据信息
    private T data;

    public ResponseResult() {
    }

    public ResponseResult(Integer status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public ResponseResult(Integer status, String message) {
        this.status = status;
        this.message = message;
    }

    public ResponseResult(Integer status, T data) {
        this.status = status;
        this.data = data;
    }

    public ResponseResult(String message, T data) {
        this.message = message;
        this.data = data;
    }



}
