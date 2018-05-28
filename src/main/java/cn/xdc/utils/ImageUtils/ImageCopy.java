package cn.xdc.utils.ImageUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;

public class ImageCopy {
    public static void copyFileImage(String dirPath) throws Exception{
        File dirFile = new File(dirPath);
        System.out.println(dirFile.getName());

        File[] files = dirFile.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
//                if (name.indexOf("QQ") != -1){
//                    return true;
//                }
                return true;
            }
        });

        for (File file : files){
            System.out.println(file.getName());

            // 封装数据源
            FileInputStream in = new FileInputStream(file);

            File newFile = new File(dirPath+"_new/" + file.getName());
            if (!newFile.exists()){
                newFile.getParentFile().mkdirs();
            }
            // 封装目的地
            FileOutputStream out = new FileOutputStream(newFile);

            // 流的对接
            byte[] bys = new byte[1024];
            int len = 0;
            while ( (len = in.read(bys)) != -1 ){
                out.write(bys , 0 , len);
            }

            // 释放资源
            in.close();
            out.close();

        }

    }

    public static void main(String[] args) {
        try {
            copyFileImage("E:\\image");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
