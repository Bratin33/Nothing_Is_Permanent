package Project;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel2 
{
static String fetchData(String s, int r, int c) throws Exception
{
	
	FileInputStream fis =new FileInputStream("./excel/advsel.xlsx");
	Workbook book = WorkbookFactory.create(fis);
	 Sheet sheet = book.getSheet("sheet1");
	 Row row = sheet.getRow(0);
	 Cell cell = row.getCell(0);
	 String data = cell.toString();
	 return data;
	
	
	
	
	
	
}
}
