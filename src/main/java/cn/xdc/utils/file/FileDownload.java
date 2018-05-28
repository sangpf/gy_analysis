package cn.xdc.utils.file;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 * 单个文件的下载
 */
public class FileDownload {

    public static void main(String[] args) {

//        download("http://www.baidu.com/img/bd_logo1.png","E:/pic", "baidu_logo.png");
//        download("http://101.200.166.221:8080/data/res/static/img/","E:/pic", "aaa");

//        downloadByNIO2("http://www.baidu.com/img/bd_logo1.png", "E:/pic", "baidu_logo.png");
        downloadByNIO2("http://101.200.166.221:8080/data/res/static/img/", "E:/pic", "baidu_logo.png");

        System.out.println("done...");
    }

    /**
     * 使用传统io stream 下载文件
     * @param url (官网：www.fhadmin.org)
     * @param saveDir
     * @param fileName
     */
    public static void download(String url, String saveDir, String fileName) {

        BufferedOutputStream bos = null;
        InputStream inputStream = null;
        try {
            byte[] buff = new byte[8192];
            // 从url中读取字节输入流
            inputStream = new URL(url).openStream();
            // 创建目标存储目录
            File file = new File(saveDir, fileName);
            file.getParentFile().mkdirs();
            // 创建字节缓冲输出流
            bos = new BufferedOutputStream(new FileOutputStream(file));
            int count = 0;
            // 完成流的对接
            while ( (count = inputStream.read(buff)) != -1) {
                bos.write(buff, 0, count);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 使用NIO下载文件， 需要 jdk 1.4+ (官网：www.fhadmin.org)
     * @param url
     * @param saveDir
     * @param fileName
     */
    public static void downloadByNIO(String url, String saveDir, String fileName) {
        ReadableByteChannel rbc = null;
        FileOutputStream fos = null;
        FileChannel foutc = null;
        try {
            rbc = Channels.newChannel(new URL(url).openStream());
            File file = new File(saveDir, fileName);
            file.getParentFile().mkdirs();
            fos = new FileOutputStream(file);
            foutc = fos.getChannel();
            foutc.transferFrom(rbc, 0, Long.MAX_VALUE);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (rbc != null) {
                try {
                    rbc.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (foutc != null) {
                try {
                    foutc.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    /**
     * 使用NIO下载文件， 需要 jdk 1.7+
     * @param url
     * @param saveDir
     * @param fileName
     */
    public static void downloadByNIO2(String url, String saveDir, String fileName) {
        try (InputStream ins = new URL(url).openStream()) {
            Path target = Paths.get(saveDir, fileName);
            Files.createDirectories(target.getParent());
            Files.copy(ins, target, StandardCopyOption.REPLACE_EXISTING);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
