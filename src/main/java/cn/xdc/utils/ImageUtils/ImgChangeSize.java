package cn.xdc.utils.ImageUtils;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;

public class ImgChangeSize {
    /**
     * 改变图片的大小到宽为size，然后高随着宽等比例变化
     * @param is 上传的图片的输入流
     * @param os 改变了图片的大小后，把图片的流输出到目标 OutputStream
     * @param size 新图片的宽
     * @param format 新图片的格式
     * @throws IOException
     */
    public static void resizeImage(InputStream is, OutputStream os, int size, String format) throws IOException{
        BufferedImage prevImage = null;
        try {
            prevImage = ImageIO.read(is);
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (prevImage != null){
            double width = prevImage.getWidth();
            double height = prevImage.getHeight();

            System.out.println("-----width :"+width +" , height :"+height);

            double percent = size/width;
            int newWidth = (int)(width * percent);
            int newHeight = (int)(height * percent);

            System.out.println("-------newWidth :"+newWidth +" , newHeight :"+newHeight);

            BufferedImage image = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_BGR);

            Graphics graphics = image.createGraphics();
            graphics.drawImage(prevImage, 0, 0, newWidth, newHeight, null);

            try {
                ImageIO.write(image, format, os);
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                os.flush();
                is.close();
                os.close();
            }
        }
    }

    // 获取文件目录下所有文件 并修改像素尺寸  int pixels 像素值
    public static void getDirFile(String dirPath, int pixels, HttpServletRequest request) throws Exception{

        // 创建相对路径
        String realPath = request.getSession().getServletContext().getRealPath(dirPath);
        if (realPath == null) {
            realPath = request.getSession().getClass().getClassLoader().getResource(dirPath).getPath();
        }

        File dirFile = new File(realPath);

        System.out.println("------------- dirFile name :"+dirFile.getName());
        System.out.println("------------- dirFile path :"+dirFile.getPath());

        File[] files = dirFile.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return true;
            }
        });

        System.out.println(" files length : "+files);

        for (File file : files){
            FileInputStream in = new FileInputStream(file);
            String fileName = file.getName();
            String suffix = fileName.substring(fileName.lastIndexOf(".") + 1);

            // 目标文件
            File newFile = new File(realPath+"_new/" + fileName);
            if (!newFile.exists()){
                newFile.getParentFile().mkdirs();
            }

            FileOutputStream out = new FileOutputStream(newFile);

            resizeImage(in, out, pixels , suffix);
        }

    }

}
