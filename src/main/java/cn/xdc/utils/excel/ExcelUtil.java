package cn.xdc.utils.excel;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFHyperlink;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;

import java.io.File;
import java.io.FileOutputStream;

public class ExcelUtil {

    public static void main(String[] args) {
        try {
            Test_Excel();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void Test_Excel() throws Exception{
        //如何设置超链接
        HSSFWorkbook wb = new HSSFWorkbook();

        //超链接的单元格风格
        //超链接默认的是蓝色底边框
        HSSFCellStyle hlink_style = wb.createCellStyle();

        HSSFFont hlink_font = wb.createFont();

        hlink_font.setUnderline(HSSFFont.U_SINGLE);
        hlink_font.setColor(HSSFColor.BLUE.index);
        hlink_style.setFont(hlink_font);

        HSSFCell cell;

        // 创建 sheet页对象
        HSSFSheet sheet = wb.createSheet("Hyperlinks");

        //URL

        cell = sheet.createRow(0).createCell((short)0);
        cell.setCellValue("URL Link");

        HSSFHyperlink link = new HSSFHyperlink(HSSFHyperlink.LINK_URL);

        link.setAddress("aaa\\966b85d2317be2f8.jpg");

        cell.setHyperlink(link);
        cell.setCellStyle(hlink_style);


        //链接到当前路径的一个文件

        cell = sheet.createRow(1).createCell((short)0);
        cell.setCellValue("File Link");

        link = new HSSFHyperlink(HSSFHyperlink.LINK_FILE);
        link.setAddress("link1.xls");

        cell.setHyperlink(link);
        cell.setCellStyle(hlink_style);


        //链接到e-mail

        cell = sheet.createRow(2).createCell((short)0);
        cell.setCellValue("Email Link");

        link = new HSSFHyperlink(HSSFHyperlink.LINK_EMAIL);
        //note, if subject contains white spaces, make sure they are url-encoded
        link.setAddress("mailto:poi@apache.org?subject=Hyperlinks");

        cell.setHyperlink(link);
        cell.setCellStyle(hlink_style);

        File file = new File("D://aa//hssf-links.xls");
        if (!file.exists()){
            file.getParentFile().mkdirs();
        }

        FileOutputStream out = new FileOutputStream(file);

        wb.write(out);
        out.close();

    }

}
