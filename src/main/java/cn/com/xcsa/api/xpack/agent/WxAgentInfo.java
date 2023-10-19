package cn.com.xcsa.api.xpack.agent;

import lombok.Getter;

/**
 * 企业微信需要有应用ID.
 * @author wuhui
 */
@Getter
public class WxAgentInfo extends AgentInfo {

    private String appid;


    /**
     * 企业微信参数构建.
     * @param ak
     * @param as
     * @param ai
     */
    public WxAgentInfo(String ak, String as, String ai) {
        super(ak, as);
        this.appid = ai;
    }
}
