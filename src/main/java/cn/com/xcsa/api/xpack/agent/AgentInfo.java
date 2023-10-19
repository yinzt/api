package cn.com.xcsa.api.xpack.agent;

import lombok.Getter;

import java.io.Serializable;

/**
 * 第三方应用的配置信息，如微信，钉钉等.
 * @author wuhui
 */
@Getter
public class AgentInfo implements Serializable {

    private String appKey;

    private String appSecret;

    /**
     * AgentInfo构造方法.
     * @param ak
     * @param as
     */
    public AgentInfo(String ak, String as) {
        this.appKey = ak;
        this.appSecret = as;
    }
}
