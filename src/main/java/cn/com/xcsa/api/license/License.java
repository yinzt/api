package cn.com.xcsa.api.license;


import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.time.LocalDateTime;

/**
 * 许可证信息.
 *
 * @author wuhui
 */
@Getter
@Builder
@ToString
public class License {

    private String id;

    /**
     * 到期时间.
     */
    private LocalDateTime expire;

    /**
     * 名称.
     */
    private String name;

    /**
     * 数量.
     */
    private int num;



    /**
     * 支持的限制类型.
     */
    private LicenseType licenseType;


}
