package ac.rca.oop.Exercises;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

public class ExcelManager {

    private final String filePath;

    public ExcelManager(String filePath) {
        this.filePath = filePath;
    }

    // ---------- READ: print every row of the first sheet ----------
    public void readAll() throws IOException {
        try (FileInputStream in = new FileInputStream(filePath);
             Workbook wb = new XSSFWorkbook(in)) {
            Sheet sheet = wb.getSheetAt(0);
            DataFormatter fmt = new DataFormatter(); // turns any cell type into text
            for (Row row : sheet) {
                StringBuilder line = new StringBuilder();
                for (Cell cell : row) {
                    line.append(fmt.formatCellValue(cell)).append(" | ");
                }
                System.out.println(line);
            }
        }
    }

    // ---------- WRITE: append a new row at the end ----------
    public void appendRow(String... values) throws IOException {
        try (FileInputStream in = new FileInputStream(filePath);
             Workbook wb = new XSSFWorkbook(in)) {
            Sheet sheet = wb.getSheetAt(0);
            Row row = sheet.createRow(sheet.getLastRowNum() + 1);
            for (int i = 0; i < values.length; i++) {
                row.createCell(i).setCellValue(values[i]);
            }
            save(wb);
        }
    }

    // ---------- EDIT: find a row by a key and change one column ----------
    // Looks in column `keyCol` for `key`, then sets column `targetCol` to `newValue`.
    public boolean editCell(int keyCol, String key, int targetCol, String newValue) throws IOException {
        try (FileInputStream in = new FileInputStream(filePath);
             Workbook wb = new XSSFWorkbook(in)) {
            Sheet sheet = wb.getSheetAt(0);
            DataFormatter fmt = new DataFormatter();
            for (Row row : sheet) {
                Cell keyCell = row.getCell(keyCol);
                if (keyCell != null && fmt.formatCellValue(keyCell).equals(key)) {
                    Cell target = row.getCell(targetCol);
                    if (target == null) target = row.createCell(targetCol);
                    target.setCellValue(newValue);
                    save(wb);
                    return true;
                }
            }
            return false; // key not found
        }
    }

    private void save(Workbook wb) throws IOException {
        try (FileOutputStream out = new FileOutputStream(filePath)) {
            wb.write(out);
        }
    }

    // ---------- Demo ----------
    public static void main(String[] args) throws IOException {
        ExcelManager manager = new ExcelManager("data.xlsx");

        manager.readAll();
        manager.appendRow("101", "Alice", "Kigali");
        boolean ok = manager.editCell(0, "101", 2, "Huye");
        System.out.println(ok ? "Edited." : "Row not found.");
        manager.readAll();
    }
}