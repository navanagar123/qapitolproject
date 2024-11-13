package com.qapitol.util;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelData {

public  static Object[][] getDta() throws IOException {
    String sheetName = "Sheet1";

    FileInputStream fis = new FileInputStream("C:\\Users\\Qapitol QA\\Downloads\\Book - Copy.xlsx");

    XSSFWorkbook workbook = new XSSFWorkbook(fis);
    XSSFSheet sheet = workbook.getSheet(sheetName);
    Object[][] data = null;
     int lastrows = sheet.getLastRowNum();


    int lastcol = sheet.getRow(1).getLastCellNum();

    
    
    for(int r=1;r<=lastrows;r++){
        XSSFRow currentrow = sheet.getRow(r);

        for(int c=0;c<lastcol;c++){
            XSSFCell cell = currentrow.getCell(c);
            data[r][c] = cell.getStringCellValue();

        }

    }
    return data;

}


}
