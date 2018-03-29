package cn.xdc.controller;

import cn.xdc.utils.file.localZip.FileBean;
import cn.xdc.utils.file.localZip.ZipUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipOutputStream;

@RequestMapping(value = "/file")
@Controller
public class FileController {
    private static Logger log = Logger.getLogger(Object.class);
    /**
     * 打包压缩下载文件
     */
    @RequestMapping(value = "/downLoadZipFile.do")
    public void downLoadZipFile(HttpServletResponse response) throws IOException {
        String zipName = "myfile.zip";
//        List<FileBean> fileList = fileService.getFileList();//查询数据库中记录
        List<FileBean> fileList = new ArrayList<>();

        FileBean fileBean2 = new FileBean();
        fileBean2.setFileId(1);
        fileBean2.setFileName("bd_logo1.png");
        fileBean2.setFilePath("https://www.baidu.com/img/");

//        http://101.200.166.221:8082/data/res/static/img/gy/11/4/201803/81/2988D38860A795F4DD67C7D8751727A3.mp3
//        https://www.baidu.com/img/bd_logo1.png

//        fileList.add(fileBean);
        fileList.add(fileBean2);
//        fileList.add(fileBean3);

        response.setContentType("APPLICATION/OCTET-STREAM");
        response.setHeader("Content-Disposition","attachment; filename="+zipName);
        ZipOutputStream out = new ZipOutputStream(response.getOutputStream());
        try {
            for(Iterator<FileBean> it = fileList.iterator(); it.hasNext();){
                FileBean file = it.next();
                ZipUtils.doCompress(file.getFilePath()+file.getFileName(), out);
                response.flushBuffer();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            out.close();
        }
    }

    @RequestMapping(value = "/downLoadZip.do")
    public void downLoadZip(HttpServletResponse response, HttpServletRequest request) throws IOException{
        String zipName = "1000.zip";

        response.setContentType("APPLICATION/OCTET-STREAM");
        response.setHeader("Content-Disposition","attachment; filename="+zipName);
        // 创建相对路径
        String relativePath = "/../data/res/static";

        String realPath = request.getSession().getServletContext().getRealPath(relativePath);
        if (realPath == null) {
            realPath = request.getSession().getClass().getClassLoader().getResource(relativePath).getPath();
        }

        System.out.println("=======================>> 获取文件的路径 ... realPath : "+realPath);

        // 创建文件夹
        File resFile = new File(realPath);

        System.out.println("======================>> 要下载的源文件是否存在 , resFile.exists() : "+resFile.exists());

        ZipOutputStream out = new ZipOutputStream(response.getOutputStream());

        try {
            ZipUtils.doCompress(resFile, out);
            response.flushBuffer();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            out.close();
        }

    }

}
