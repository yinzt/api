package cn.com.xcsa.api.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author wuhui
 */
@Data
public class ThirdDeptDto  implements Serializable {

    private String deptId;

    private String name;

    private String enName;

    private List<String> leaders;

    private String parentId;

    private Integer order;
}
