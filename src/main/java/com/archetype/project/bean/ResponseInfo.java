package com.archetype.project.bean;

import com.archetype.project.common.BizCode;

/**
 * 接口返回类型
 *
 * @author: Think
 * @date: 2021/8/8
 */
public class ResponseInfo {

    /**
     * 返回编码
     */
    private String retCode;

    /**
     * 返回Msg
     */
    private String retMsg;

    /**
     * 返回data
     */
    private Object data;

    public ResponseInfo() {
        setRetCode(BizCode.SUCCESS.getCode());
        setRetMsg(BizCode.SUCCESS.getMessage());
    }

    public ResponseInfo(String retCode, String retMsg, Object data) {
        this.retCode = retCode;
        this.retMsg = retMsg;
        this.data = data;
    }

    public String getRetCode() {
        return retCode;
    }

    public void setRetCode(String retCode) {
        this.retCode = retCode;
    }

    public String getRetMsg() {
        return retMsg;
    }

    public void setRetMsg(String retMsg) {
        this.retMsg = retMsg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
