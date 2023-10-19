package cn.com.xcsa.api.framework.security;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

/**
 * @author wuhui
 */
@Data
@ToString
@AllArgsConstructor
public class ClaimInfo {

    private Long tenantId;

    private Long uid;

    private String userName;

    /**
     * web,client,h5,app.
     */
    private String src;
}
