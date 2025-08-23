package Testng_package;


import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.*;

public class ExcelFile {

    public static Object[][] getExcelData(String filePath, String sheetName) {
        Object[][] data = null;
        try {
            FileInputStream fis = new FileInputStream(filePath);
            Workbook wb = WorkbookFactory.create(fis);// Excel file(object)
            Sheet sheet = wb.getSheet(sheetName);// Sheet(Object)

            int rowCount = sheet.getPhysicalNumberOfRows();
            int colCount = sheet.getRow(0).getLastCellNum();

            data = new Object[rowCount - 1][colCount];

            for (int i = 1; i < rowCount; i++) { // Start from row 1 (skip header)
                Row row = sheet.getRow(i);
                for (int j = 0; j < colCount; j++) {
                    Cell cell = row.getCell(j);
                    data[i - 1][j] = (cell == null) ? "" : cell.toString();
                }
            }

            wb.close();
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return data;
    }
}


