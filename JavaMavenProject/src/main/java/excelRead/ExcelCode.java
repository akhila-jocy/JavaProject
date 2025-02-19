package excelRead;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelCode {
	static FileInputStream f;
	static XSSFWorkbook w;
	static XSSFSheet sh;
	
	public static String getStringData(int a,int b) throws IOException
	{
		f=new FileInputStream("C:\\Users\\Admin\\Desktop\\Book1.xlsx"); //to acess the file path and open it
		w=new XSSFWorkbook(f); //to acess the workbook
		sh=w.getSheet("Sheet1");
		XSSFRow r=sh.getRow(a);//to get the row value from the sheet
		XSSFCell c=r.getCell(b);
		return c.getStringCellValue(); //to retrieve string value from a cell
	}
	public static String getIntegerData(int a,int b) throws IOException
	{
		f=new FileInputStream("C:\\Users\\Admin\\Desktop\\Book1.xlsx");
		w=new XSSFWorkbook(f);
		sh=w.getSheet("Sheet1");
		XSSFRow r=sh.getRow(a);
		XSSFCell c=r.getCell(b);
		int x=(int) c.getNumericCellValue();
		return String.valueOf(x);
	}
}
