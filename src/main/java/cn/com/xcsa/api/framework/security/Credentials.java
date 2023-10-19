package cn.com.xcsa.api.framework.security;

import lombok.Getter;
import lombok.ToString;

/**
 * 认证信息.
 *
 * @author wuhui
 */
@Getter
@ToString
public class Credentials {

    private String secretKey;

    private String qrcode;

    /**
     * 构建认证信息，包括密钥，二维码.
     *
     * @param sk
     * @param qc
     */
    public Credentials(String sk, String qc) {
        this.secretKey = sk;
        this.qrcode = qc;
    }
}
