package excelread;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelFile {
	static FileInputStream f;
	static XSSFWorkbook wb;
	static XSSFSheet sh;
public static String readStringData(int row,int col) throws IOException
{
	f=new FileInputStream("C:\\Users\\SHEHARBAN\\OneDrive\\Desktop\\Age.xlsx");
	wb= new XSSFWorkbook(f);
	sh=wb.getSheet("Sheet1");
	XSSFRow r=sh.getRow(row);
	XSSFCell c=r.getCell(col);
	return c.getStringCellValue();
}

public static String readIntData(int row,int col) throws IOException
{
	f=new FileInputStream("C:\\Users\\SHEHARBAN\\OneDrive\\Desktop\\Age.xlsx");
	wb= new XSSFWorkbook(f);
	sh=wb.getSheet("Sheet1");
	XSSFRow r=sh.getRow(row);
	XSSFCell c=r.getCell(col);
	int v=(int) c.getNumericCellValue();
	return String.valueOf(v);
}
}
