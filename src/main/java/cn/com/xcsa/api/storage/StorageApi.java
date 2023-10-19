package cn.com.xcsa.api.storage;


import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/**
 * 文件存储服务.
 */
public interface StorageApi {

    /**
     * 查询文件信息.
     * @param fileId
     * @return 返回文件信息.
     */

    FileInfo getFileInfo(String fileId);


    /**
     * 上传文件,支持块级别的续传.
     * @param fileId  文件ID是文件的sha256签名值.
     * @param fileName 上传第一个块时，文件名是必须的.
     * @param fileSize 文件总大小
     * @param blockNum
     * @param files
     * @return 返回对应的文件信息
     */
    FileInfo upload(String fileId, String fileName, Long fileSize,
                    Integer blockNum, byte[] files);

    /**
     * 查询存储配置信息.
     * @return 存储配置信息
     */
    StorageInfo getStorageInfo();



    /**
     * 删除文件，包括所有版本数据.
     * @param fileId
     * @return 删除状态
     */
    boolean deleteFile(String fileId);

    /**
     * 删除指定文件.
     * @param fileId
     * @param version
     * @return 删除状态
     */
    boolean deleteFile(String fileId, Integer version);

    /**
     * 探测文件类型.
     * @param file
     * @return 文件类型
     * @throws IOException
     */
    String detect(File file) throws IOException;

    /**
     * 探测文件类型，bytes至少需要包含文件的开头部分.
     * @param bytes
     * @return 文件类型
     * @throws IOException
     */
    String detect(byte[] bytes);

    /**
     * 探测文件类型，bytes至少需要包含文件的开头部分.
     * @param bytes
     * @param filename 文件名称
     * @return 文件类型
     * @throws IOException
     */
    String detect(byte[] bytes, String filename);

    /**
     * 探测文件类型.
     * @param in
     * @param filename 文件名称
     * @return 文件类型
     * @throws IOException
     */
    String detect(InputStream in, String filename) throws IOException;

}
