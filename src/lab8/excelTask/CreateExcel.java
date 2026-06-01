package lab8.excelTask;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class CreateExcel {
    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();

        XSSFSheet sheet = workbook.createSheet("Продукты");

        Row headerRow = sheet.createRow(0);
        headerRow.createCell(0).setCellValue("Название");
        headerRow.createCell(1).setCellValue("Количество");
        headerRow.createCell(2).setCellValue("Цена");

        Row dataRow1 = sheet.createRow(1);
        dataRow1.createCell(0).setCellValue("Ноутбук");
        dataRow1.createCell(1).setCellValue(10);
        dataRow1.createCell(2).setCellValue(75000);

        Row dataRow2 = sheet.createRow(2);
        dataRow2.createCell(0).setCellValue("Мышь беспроводная");
        dataRow2.createCell(1).setCellValue(15);
        dataRow2.createCell(2).setCellValue(2300);

        String filePath = "src/lab8/excelTask/products.xlsx";
        FileOutputStream outputStream = new FileOutputStream(filePath);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();

        System.out.println("Данные записаны в файл: " + filePath);
    }
}