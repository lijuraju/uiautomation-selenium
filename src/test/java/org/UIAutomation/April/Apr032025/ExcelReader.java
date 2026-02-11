package org.UIAutomation.April.Apr032025;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

import java.io.IOException;

public class ExcelReader {

    public static void main(String[] args) throws IOException {

        String Filepath = "C:\\Users\\320025295\\Downloads\\Book1.xlsx";

        FileInputStream fis = new FileInputStream(Filepath);

        Workbook wk = new XSSFWorkbook(fis);

        Sheet sht = wk.getSheet("Sheet1");

        int rows = sht.getPhysicalNumberOfRows();

        for (int i = 0; i <= rows; i++) {
            Row rw = sht.getRow(i);

            int cellCount = rw.getPhysicalNumberOfCells();

            for (int j = 0; j < cellCount; j++) {
                Cell cell = rw.getCell(j);


                switch (cell.getCellType()) {
                    case STRING:
                        System.out.print(cell.getStringCellValue() + "\t");
                        break;
                    case NUMERIC:
                        System.out.print(cell.getNumericCellValue() + "\t");
                        break;
                    case BOOLEAN:
                        System.out.print(cell.getBooleanCellValue() + "\t");
                        break;
                    default:
                        System.out.print(" \t");
                }
            }
            System.out.println(); // Move to next line after each row


            // Close workbook and stream
            wk.close();
            fis.close();


        }
    }
}
