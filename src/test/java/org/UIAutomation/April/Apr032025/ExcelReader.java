package org.UIAutomation.April.Apr032025;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

import java.io.IOException;

public class ExcelReader {

    public static void main(String[] args) throws IOException {

        String Filepath = "C:\\Users\\320025295\\Downloads\\Book1.xlsx";

        FileInputStream fis = new FileInputStream(Filepath);
        Workbook wk = new XSSFWorkbook(fis);
        Sheet sht = wk.getSheet("Sheet1");
        
        DataFormatter formatter = new DataFormatter();

        for (Row row : sht) {
            for (Cell cell : row) {
                System.out.print(formatter.formatCellValue(cell) + "\t");
            }
            System.out.println();
        }

        wk.close();
        fis.close();
    }
}
