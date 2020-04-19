package utility;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetCellDataFromXlsx {
	
	public static String GetCellData(String productName,String DataType,String SheetName,int colNum,int rowNum) throws Exception
	    {  
		Properties prop = new Properties();
		FileInputStream Pathfis = new FileInputStream("properties\\data.properties");
		prop.load(Pathfis);
		String MeraPooraaXlsxPath = prop.getProperty("MerapooraaXlsx");
		String CellData = "";  
		  
		if(productName== "merapooraa")
		{
			if(DataType=="Numeric")
			   {
				   FileInputStream fis = new FileInputStream(MeraPooraaXlsxPath);
				   @SuppressWarnings("resource")
					XSSFWorkbook workbook = new XSSFWorkbook(fis);
			        XSSFSheet sheet = workbook.getSheet(SheetName);
			        XSSFRow row = sheet.getRow(rowNum);
			        XSSFCell cell = row.getCell(colNum);
			        CellData = NumberToTextConverter.toText(cell.getNumericCellValue());	
			   }
			   
			   else if( DataType=="String")
			   {
				   FileInputStream fis = new FileInputStream(MeraPooraaXlsxPath);
				   @SuppressWarnings("resource")
					XSSFWorkbook workbook = new XSSFWorkbook(fis);
			        XSSFSheet sheet = workbook.getSheet(SheetName);
			        XSSFRow row = sheet.getRow(rowNum);
			        XSSFCell cell = row.getCell(colNum);
			        CellData = String.valueOf(cell.getStringCellValue());   
			   }  
			   else 
			   {
			    System.out.println("Invalid Value, Value should be 'String' or 'Numeric' only.");
			   }
		
		}
		else 
		{
		    System.out.println("Invalid Product Name, Valid Values are- merapooraa");
		}
		   
		    
		return CellData;
	    }
}
