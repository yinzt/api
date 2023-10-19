package cn.com.xcsa.api.storage;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 存储配置信息.
 */
@Data
public class StorageInfo implements Serializable {

    /**
     * 存储方式.
     */
    private String engine;
    /**
     * 文件块大小，单位为MB 默认为20MB.
     */
    private String blockSize = "20MB";
    /**
     * 单个文件最大限制，默认为1G.
     */
    private String maxFileSize = "1GB";
    /**
     * 单次文件最大限制，默认为10GB.
     */
    private String maxRequestSize = "10GB";

    /**
     * 文件加密算法.
     */
    private String algorithm;


    /**
     * 文件保存路径，engine=DISK时有效.
     */
    private List<PathInfo> pathInfos;

    /**
     * 保存版本数量.
     */
    private Integer versions;
}
