package cn.com.xcsa.api.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class TenantSettingsDto implements Serializable {

    private Long id;

    private Long tenantId;

    private String paramName;

    private String paramKey;

    private String paramValue;

    /**
     * sys:系统内置，custom:自定义.
     */
    private String paramType;

    private LocalDateTime createAt;

    private String remark;
}
