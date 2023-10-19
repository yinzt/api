package cn.com.xcsa.api.storage;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 文件信息.
 */
@Data
public class FileInfo implements Serializable {


    private String id;

    /**
     * 存储目录ID.
     * 如：1@/d/data/,2@/d/opt.
     */
    private String pathNo;

    /**
     * 文件名.
     */
    private String fileName;

    /**
     * 当前索引值.
     */
    private Integer currentIndex;

    /**
     * 引擎类型.
     */
    private String storageType;

    /**
     * 服务名称.
     */
    private String serverName;

    /**
     * 文件总大小.
     */
    private long fileSize;

    /**
     * 文件块大小.
     */
    private long blockSize;

    /**
     * 分割文件块数量.
     */
    private long blockNum;

    /**
     * 加密算法.
     */
    private String algorithm;

    /**
     * 文件存储相对路径.
     */
    private String path;

    /**
     * 文件扩展名.
     */
    private String ext;

    /**
     * MIME 类型.
     */
    private String contentType;

    /**
     * 文件状态 0未完成 ， 1：完成.
     */
    private Integer status;


    /**
     * 创建时间.
     */
    private Date createTime;

    /**
     * 当前最新版本.
     */
    private Integer version;

}
