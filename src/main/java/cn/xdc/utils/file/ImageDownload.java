package cn.xdc.utils.file;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class ImageDownload {

    public final static String sate = "http://www.baidu.com/img/bd_logo1.png";//本题所下载的文件是一个百度图标

    public static void main(String[] args) {
        try {
            //创建一个URL对象
            URL url = new URL(sate);
            //建立一个链接
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            //制定相应方式
            conn.setRequestMethod("GET");
            //进行连接
            conn.connect();
            //获得响应码
            int code = conn.getResponseCode();
            //获得文件名字
            int position = sate.lastIndexOf("/");
            String fileName = sate.substring(position+1);
            System.out.println("服务器响应码："+code);
            //如果响应码是200 则链接下载。。。
            if(code == HttpURLConnection.HTTP_OK){
                //获得文件长度
                int contentLength = conn.getContentLength();
                System.out.println("文件总长度："+contentLength);
                //设定想要启动下载线程，用于把文件分成多少分进行下载
                RandomAccessFile raf = new RandomAccessFile(new File(fileName), "rwd");
                raf.setLength(contentLength);
                raf.close();

                //假定每个线程负责下载的长度为1k
                int blockSize = 1024*2;
                //如果能除尽指定线程数  否则线程数+1
                int size = contentLength%blockSize==0 ? contentLength/blockSize : (contentLength/blockSize)+1;

                for(int i = 0;i<size;i++){
                    if(i==(size-1)){
                        new DownLoadThread(i, (contentLength-(blockSize*i)), fileName,contentLength).start();
                        System.out.println("启动了第："+i+"  线程---------------------"+(contentLength-(blockSize*i)));
                        return;
                    }
                    new DownLoadThread(i, blockSize, fileName,(i+1)*blockSize).start();
                    System.out.println("启动了第："+i+"  线程---------------------"+blockSize);
                }
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class DownLoadThread extends Thread{
    private int fileCount;
    private int blockSize;
    private String fileName;
    private int TotalLength;

    public DownLoadThread(int fileCount,int blockSize,String fileName,int TotalLength){
        this.fileCount = fileCount;
        this.blockSize = blockSize;
        this.fileName = fileName;
        this.TotalLength= TotalLength;
    }
    @Override
    public void run() {
        try {
            URL url = new URL(ImageDownload.sate);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Range", "bytes="+(TotalLength-blockSize)+"-"+(TotalLength));
            conn.connect();
            System.out.println(fileCount+"开始:"+(TotalLength-blockSize)+",结束:"+TotalLength);

            //多线程同时下载文件，因此要使用随机访问文件流，即同时写入读取，seek(int index)制定存放的位置
            RandomAccessFile raf = new RandomAccessFile(new File(fileName), "rwd");
            raf.seek(TotalLength-blockSize);
            int code = conn.getResponseCode();
            System.out.println(fileCount+">>>Code>>>"+code);
            if(code == HttpURLConnection.HTTP_OK || code == 206){
                BufferedInputStream bis = new BufferedInputStream(conn.getInputStream());
                int len = 0;
                byte[]buf = new byte[1024];
                while((len = bis.read(buf,0,buf.length))!=-1){
                    raf.write(buf, 0, len);
                    System.out.println(fileCount+"下载长度："+len);
                }
                //回收资源
                raf.close();
                System.out.println("第"+fileCount+"段下载完毕!!!");
                return;
            }
            System.out.println("第"+fileCount+"段下载失败！！！");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

