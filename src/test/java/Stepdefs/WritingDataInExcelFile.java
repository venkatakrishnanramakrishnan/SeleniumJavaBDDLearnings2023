package Stepdefs;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritingDataInExcelFile {
    static String filepath = "C:\\Users\\welcome\\Desktop\\Orange\\src\\main\\java\\TestData\\FVTestDat.xls";

    public static void main(String[]args) throws IOException, NullPointerException{


        String testTitle = "Srilanka";
        int paymentRef=2623;

        FileInputStream fileInputStream = new FileInputStream(filepath);
        HSSFWorkbook workbook = new HSSFWorkbook(fileInputStream);

        HSSFSheet sheet = workbook.getSheet("Sheet1"); ///Using HSSFSheet here is crucial

        int rowsCount = sheet.getLastRowNum();
        int colsCount = sheet.getRow(0).getLastCellNum();

        System.out.println("row count =  :"+rowsCount);
        System.out.println("col count =  :"+colsCount);


        for(int i=1;i<=rowsCount;i++){
            if(sheet.getRow(i).getCell(0).getStringCellValue().trim().equals(testTitle)){
                System.out.println("Inside the write use case.");
                HSSFRow dataRow = sheet.getRow(i);
                HSSFCell cell = dataRow.createCell(1);
                cell.setCellValue((Integer)paymentRef);
                break;
            }
        }
        fileInputStream.close();

        FileOutputStream fileOutputStream = new FileOutputStream(filepath);

        workbook.write(fileOutputStream);
        workbook.close();
        fileOutputStream.close();
    }
}
