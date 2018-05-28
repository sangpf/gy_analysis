package cn.xdc.utils.file.zip;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.zip.ZipOutputStream;

public class DownZipUtils {

    /**
     * 根据调查 invId 查询当前调查所有的资料 , 打包下载
     *  所以, 这并不是一个通用的接口
     */
    public static void downLoad_invRes_zip(HttpServletResponse response, HttpServletRequest request,Integer invId) throws IOException{
        String zipName = invId+".zip";

        response.setContentType("APPLICATION/OCTET-STREAM");
        response.setHeader("Content-Disposition","attachment; filename="+zipName);
        // 创建相对路径
        String relativePath = "/../data/res/static/gy/"+invId;

        String realPath = request.getSession().getServletContext().getRealPath(relativePath);
        if (realPath == null) {
            realPath = request.getSession().getClass().getClassLoader().getResource(relativePath).getPath();
        }

        System.out.println("=======================>> 获取文件的路径 ... realPath : "+realPath);

        // 创建文件夹
        File resFile = new File(realPath);

        System.out.println("======================>> 要下载的源文件是否存在 , resFile.exists() : "+resFile.exists());

        if (resFile.exists()){
            ZipOutputStream out = new ZipOutputStream(response.getOutputStream());
            try {
                cn.xdc.utils.file.localZip.ZipUtils.doCompress(resFile, out);
                response.flushBuffer();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                out.close();
            }
        }

    }
}
