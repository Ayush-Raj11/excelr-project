package maven_datadriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class write_execl {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//excel
				FileInputStream file=new FileInputStream("C:\\Users\\DELL\\Desktop\\AYUSH's PROMPT\\Excelr working platform\\materials_gen_by_eclipse\\writeexecl.xlsx");
				//workbook--workbook is present in the file object
				XSSFWorkbook workbook=new XSSFWorkbook(file);
				//to get the sheet from the work book
				XSSFSheet sheet=workbook.getSheet("Sheet1");//providing sheet name
				//XSSFSheet sheet=workbook.getSheetAt(0);//providing index for the sheets present
				
				
				XSSFRow row=sheet.getRow(0);
				XSSFCell cell=row.createCell(2);
				cell.setCellValue("hello");
				FileOutputStream out= new FileOutputStream("C:\\Users\\DELL\\Desktop\\AYUSH's PROMPT\\Excelr working platform\\materials_gen_by_eclipse\\writeexecl.xlsx");
				workbook.write(out);
				workbook.close();
				
}
}
