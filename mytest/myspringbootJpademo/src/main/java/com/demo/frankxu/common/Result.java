package com.demo.frankxu.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value="接口返回对象", description="接口返回对象")
public class Result<T> {
    private static final long serialVersionUID = 1L;

    /**
     * 成功标志
     */
    @ApiModelProperty(value = "成功标志")
    private boolean success = true;

    /**
     * 返回处理消息
     */
    @ApiModelProperty(value = "返回处理消息")
    private String message = "操作成功！";

    /**
     * 返回代码
     */
    @ApiModelProperty(value = "返回代码")
    private Integer code = 0;

    /**
     * 返回数据对象 data
     */
    @ApiModelProperty(value = "返回数据对象")
    private T result;
    /**
     * 返回数据对象 data
     */
    @ApiModelProperty(value = "返回数据对象")
    private T jobj;
    /**
     * 时间戳
     */
    @ApiModelProperty(value = "时间戳")
    private long timestamp = System.currentTimeMillis();

    public Result() {

    }

    public Result<T> error500(String message) {
        this.message = message;
        this.code = 500;
        this.success = false;
        return this;
    }

    public Result<T> success(String message) {
        this.message = message;
        this.code = 200;
        this.success = true;
        return this;
    }


    public static Result<Object> ok() {
        Result<Object> r = new Result<Object>();
        r.setSuccess(true);
        r.setCode(200);
        r.setMessage("成功");
        return r;
    }

    public static Result<Object> ok(String msg) {
        Result<Object> r = new Result<Object>();
        r.setSuccess(true);
        r.setCode(200);
        r.setMessage(msg);
        return r;
    }

    public static Result<Object> ok(Object data) {
        Result<Object> r = new Result<Object>();
        r.setSuccess(true);
        r.setCode(200);
        r.setResult(data);
        return r;
    }

    public static Result<Object> error(String msg) {
        return error(500, msg);
    }

    public static Result<Object> error(int code, String msg) {
        Result<Object> r = new Result<Object>();
        r.setCode(code);
        r.setMessage(msg);
        r.setSuccess(false);
        return r;
    }
}
