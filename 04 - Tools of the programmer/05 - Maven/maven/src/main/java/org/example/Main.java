package org.example;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Creating excel file");
        Workbook workbook = new XSSFWorkbook();

//create a sheet in the workbook(you can give it a name)
        Sheet sheet = workbook.createSheet("excel-sheet");

//create a row in the sheet
        Row row = sheet.createRow(0);

//add cells in the sheet
        Cell cell = row.createCell(0);

//set a value to the cell
        cell.setCellValue("something");

        try {
            FileOutputStream out = new FileOutputStream(
                    new File("excel.xlsx"));
            workbook.write(out);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}