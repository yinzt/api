package cn.com.xcsa.api.util;

import com.alibaba.fastjson.annotation.JSONType;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * 封装返回对象.
 * @author wuhui
 */
@Data
@ToString
@JSONType(orders = {"code", "msg", "time", "data"})
public class RestResp implements Serializable {

    private static final long serialVersionUID = -3197616652643404121L;

    private int code;

    private String msg;

    private Long time = System.currentTimeMillis();

    private Object data;

    /**
     * 构造器.
     */
    public RestResp() {
    }

    /**
     * 构造器.
     * @param d
     * @param ic
     *
     */
    public RestResp(InfoCode ic, Object d) {
        if (ic != null) {
            this.code = ic.getStatus();
            this.msg = ic.getMsg();
        }
        this.data = d;
    }

    /**
     * 构造参数.
     * @param data
     * @param infoCode
     * @return RestResp
     */
    public static RestResp build(InfoCode infoCode, Object data) {
        return new RestResp(infoCode, data);
    }

    /**
     * 构造参数.
     * @param infoCode
     * @return RestResp
     */
    public static RestResp build(InfoCode infoCode) {
        return new RestResp(infoCode, null);
    }

    /**
     * 构造参数.
     * @param status
     * @param message
     * @param data
     * @return RestResp
     */
    public static RestResp build(int status, String message, Object data) {
        RestResp resp = new RestResp();
        resp.setData(data);
        resp.setMsg(message);
        resp.setCode(status);
        return resp;
    }

    /**
     * 构造参数.
     * @param status
     * @param message
     * @return RestResp
     */
    public static RestResp build(int status, String message) {
        RestResp resp = new RestResp();
        resp.setMsg(message);
        resp.setCode(status);
        return resp;
    }
}
