package cn.com.xcsa.api.exception;

/**
 * 文件存储异常.
 */
public class FileStorageException extends RuntimeException {

    /**
     * 文件存储异常构造方法.
     * @param msg
     */
    public FileStorageException(String msg) {
        super(msg);
    }
}
