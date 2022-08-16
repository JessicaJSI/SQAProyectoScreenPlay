package com.dafiti.Utils;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class DatosExcel {

    private XSSFWorkbook libro;
    private FileInputStream file;

    public String leerDatosExcel (String ruta, String hoja, int rowValor, int cellValor) throws IOException {
        String valor = null;
        file = new FileInputStream(new File(ruta));
        libro = new XSSFWorkbook(file);
        Sheet sheet = libro.getSheet(hoja);
        Row row = sheet.getRow(rowValor);
        Cell cell = row.getCell(cellValor);
        valor = cell.getStringCellValue();
        libro.close();
        return valor;
    }

}
