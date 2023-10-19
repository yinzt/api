package cn.com.xcsa.api.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author wuhui
 */
@Data
public class ThirdUserDto implements Serializable {

    /**
     * 企业微信登录时，userId为用户名.
     */
    private String userId;

    private String loginName;

    private String name;

    private List<String> departments;

    private String phone;

    private String email;
}
