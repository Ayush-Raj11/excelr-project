package keydriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class readexcel {

	static List<String> keywordlist =new ArrayList<String>();
	@Test	
public static void readtheexcel() throws IOException {
	//excel
	FileInputStream file=new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\maven\\src\\test\\resources\\TestData1.xlsx");
	//workbook--workbook is present in the file object
	XSSFWorkbook workbook=new XSSFWorkbook(file);
	//to get the sheet from the work book
	XSSFSheet sheet=workbook.getSheet("Sheet2");//providing sheet name
	//XSSFSheet sheet=workbook.getSheetAt(0);//providing index for the sheets present
	
	//no.of rows
	int rowcnt=sheet.getLastRowNum();
	System.out.println(rowcnt);
	
	//to focus on row inorder to get the column numbers
	int colcnt=sheet.getRow(0).getLastCellNum();
	System.out.println(colcnt);
	
	//to read the values from excel sheet
	for (int i=0;i<=rowcnt;i++){
		
		String keywords=sheet.getRow(i).getCell(0).toString();
		keywordlist.add(keywords);
		}
	System.out.println(keywordlist);
	if(keywordlist.get(0).equalsIgnoreCase("openurl")) {
		keywords.openurl();
	}
	if(keywordlist.get(1).equalsIgnoreCase("username")) {
		keywords.username();
	}
	if(keywordlist.get(2).equalsIgnoreCase("password")) {
		keywords.password();
	}
	if(keywordlist.get(3).equalsIgnoreCase("login")) {
		keywords.login();
	}
	
}
	public static void main(String[] args) throws IOException {
		readtheexcel();
		
	}

}
