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
		FileInputStream Pathfis = new FileInputStream("Properties\\data.properties");
		prop.load(Pathfis);
		String BureauXlsxPath = prop.getProperty("BureauXlsxPath");
		String BusinessLoanXlsxPath = prop.getProperty("BusinessLoanXlsxPath");
		String CreditCardXlsxPath = prop.getProperty("CreditCardXlsxPath");
		String DigitalGoldXlsxPath = prop.getProperty("DigitalGoldXlsxPath");
		String HomeLoanXlsxPath = prop.getProperty("HomeLoanXlsxPath");
		String HomePageXlsxPath = prop.getProperty("HomePageXlsxPath");
		String InsuranceXlsxPath = prop.getProperty("InsuranceXlsxPath");
		String MutualFundXlsxPath = prop.getProperty("MutualFundXlsxPath");
		String PersonalLoanXlsxPath = prop.getProperty("PersonalLoanXlsxPath");
		String PersonalLoanFiftyKXlsxPath = prop.getProperty("PersonalLoanFiftyKXlsxPath");
		String SavingAccountXlsxPath = prop.getProperty("SavingAccountXlsxPath");
		String CellData = "";  
		  
		if(productName== "Bureau")
		{
			if(DataType=="Numeric")
			   {
				   FileInputStream fis = new FileInputStream(BureauXlsxPath);
				   @SuppressWarnings("resource")
					XSSFWorkbook workbook = new XSSFWorkbook(fis);
			        XSSFSheet sheet = workbook.getSheet(SheetName);
			        XSSFRow row = sheet.getRow(rowNum);
			        XSSFCell cell = row.getCell(colNum);
			        CellData = NumberToTextConverter.toText(cell.getNumericCellValue());	
			   }
			   
			   else if( DataType=="String")
			   {
				   FileInputStream fis = new FileInputStream(BureauXlsxPath);
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
		
		else if(productName== "BusinessLoan")
		{
			if(DataType=="Numeric")
			   {
				   FileInputStream fis = new FileInputStream(BusinessLoanXlsxPath);
				   @SuppressWarnings("resource")
					XSSFWorkbook workbook = new XSSFWorkbook(fis);
			        XSSFSheet sheet = workbook.getSheet(SheetName);
			        XSSFRow row = sheet.getRow(rowNum);
			        XSSFCell cell = row.getCell(colNum);
			        CellData = NumberToTextConverter.toText(cell.getNumericCellValue());	
			   }
			   
			   else if( DataType=="String")
			   {
				   FileInputStream fis = new FileInputStream(BusinessLoanXlsxPath);
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
		
		else if(productName== "CreditCard")
		{
			if(DataType=="Numeric")
			   {
				   FileInputStream fis = new FileInputStream(CreditCardXlsxPath);
				   @SuppressWarnings("resource")
					XSSFWorkbook workbook = new XSSFWorkbook(fis);
			        XSSFSheet sheet = workbook.getSheet(SheetName);
			        XSSFRow row = sheet.getRow(rowNum);
			        XSSFCell cell = row.getCell(colNum);
			        CellData = NumberToTextConverter.toText(cell.getNumericCellValue());	
			   }
			   
			   else if( DataType=="String")
			   {
				   FileInputStream fis = new FileInputStream(CreditCardXlsxPath);
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
		else if(productName== "DigitalGold")
		{
			if(DataType=="Numeric")
			   {
				   FileInputStream fis = new FileInputStream(DigitalGoldXlsxPath);
				   @SuppressWarnings("resource")
					XSSFWorkbook workbook = new XSSFWorkbook(fis);
			        XSSFSheet sheet = workbook.getSheet(SheetName);
			        XSSFRow row = sheet.getRow(rowNum);
			        XSSFCell cell = row.getCell(colNum);
			        CellData = NumberToTextConverter.toText(cell.getNumericCellValue());	
			   }
			   
			   else if( DataType=="String")
			   {
				   FileInputStream fis = new FileInputStream(DigitalGoldXlsxPath);
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
		else if(productName== "HomeLoan")
		{
			if(DataType=="Numeric")
			   {
				   FileInputStream fis = new FileInputStream(HomeLoanXlsxPath);
				   @SuppressWarnings("resource")
					XSSFWorkbook workbook = new XSSFWorkbook(fis);
			        XSSFSheet sheet = workbook.getSheet(SheetName);
			        XSSFRow row = sheet.getRow(rowNum);
			        XSSFCell cell = row.getCell(colNum);
			        CellData = NumberToTextConverter.toText(cell.getNumericCellValue());	
			   }
			   
			   else if( DataType=="String")
			   {
				   FileInputStream fis = new FileInputStream(HomeLoanXlsxPath);
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
		else if(productName== "HomePage")
		{
			if(DataType=="Numeric")
			   {
				   FileInputStream fis = new FileInputStream(HomePageXlsxPath);
				   @SuppressWarnings("resource")
					XSSFWorkbook workbook = new XSSFWorkbook(fis);
			        XSSFSheet sheet = workbook.getSheet(SheetName);
			        XSSFRow row = sheet.getRow(rowNum);
			        XSSFCell cell = row.getCell(colNum);
			        CellData = NumberToTextConverter.toText(cell.getNumericCellValue());	
			   }
			   
			   else if( DataType=="String")
			   {
				   FileInputStream fis = new FileInputStream(HomePageXlsxPath);
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
		else if(productName== "Insurance")
		{
			if(DataType=="Numeric")
			   {
				   FileInputStream fis = new FileInputStream(InsuranceXlsxPath);
				   @SuppressWarnings("resource")
					XSSFWorkbook workbook = new XSSFWorkbook(fis);
			        XSSFSheet sheet = workbook.getSheet(SheetName);
			        XSSFRow row = sheet.getRow(rowNum);
			        XSSFCell cell = row.getCell(colNum);
			        CellData = NumberToTextConverter.toText(cell.getNumericCellValue());	
			   }
			   
			   else if( DataType=="String")
			   {
				   FileInputStream fis = new FileInputStream(InsuranceXlsxPath);
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
		else if(productName== "MutualFund")
		{
			if(DataType=="Numeric")
			   {
				   FileInputStream fis = new FileInputStream(MutualFundXlsxPath);
				   @SuppressWarnings("resource")
					XSSFWorkbook workbook = new XSSFWorkbook(fis);
			        XSSFSheet sheet = workbook.getSheet(SheetName);
			        XSSFRow row = sheet.getRow(rowNum);
			        XSSFCell cell = row.getCell(colNum);
			        CellData = NumberToTextConverter.toText(cell.getNumericCellValue());	
			   }
			   
			   else if( DataType=="String")
			   {
				   FileInputStream fis = new FileInputStream(MutualFundXlsxPath);
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
		else if(productName== "PersonalLoan")
		{
			if(DataType=="Numeric")
			   {
				   FileInputStream fis = new FileInputStream(PersonalLoanXlsxPath);
				   @SuppressWarnings("resource")
					XSSFWorkbook workbook = new XSSFWorkbook(fis);
			        XSSFSheet sheet = workbook.getSheet(SheetName);
			        XSSFRow row = sheet.getRow(rowNum);
			        XSSFCell cell = row.getCell(colNum);
			        CellData = NumberToTextConverter.toText(cell.getNumericCellValue());	
			   }
			   
			   else if( DataType=="String")
			   {
				   FileInputStream fis = new FileInputStream(PersonalLoanXlsxPath);
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
		else if(productName== "PersonalLoanFiftyK")
		{
			if(DataType=="Numeric")
			   {
				   FileInputStream fis = new FileInputStream(PersonalLoanFiftyKXlsxPath);
				   @SuppressWarnings("resource")
					XSSFWorkbook workbook = new XSSFWorkbook(fis);
			        XSSFSheet sheet = workbook.getSheet(SheetName);
			        XSSFRow row = sheet.getRow(rowNum);
			        XSSFCell cell = row.getCell(colNum);
			        CellData = NumberToTextConverter.toText(cell.getNumericCellValue());	
			   }
			   
			   else if( DataType=="String")
			   {
				   FileInputStream fis = new FileInputStream(PersonalLoanFiftyKXlsxPath);
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
		else if(productName== "SavingAccount")
		{
			if(DataType=="Numeric")
			   {
				   FileInputStream fis = new FileInputStream(SavingAccountXlsxPath);
				   @SuppressWarnings("resource")
					XSSFWorkbook workbook = new XSSFWorkbook(fis);
			        XSSFSheet sheet = workbook.getSheet(SheetName);
			        XSSFRow row = sheet.getRow(rowNum);
			        XSSFCell cell = row.getCell(colNum);
			        CellData = NumberToTextConverter.toText(cell.getNumericCellValue());	
			   }
			   
			   else if( DataType=="String")
			   {
				   FileInputStream fis = new FileInputStream(SavingAccountXlsxPath);
				   @SuppressWarnings("resource")
					XSSFWorkbook workbook = new XSSFWorkbook(fis);
			        XSSFSheet sheet = workbook.getSheet(SheetName);
			        XSSFRow row = sheet.getRow(rowNum);
			        XSSFCell cell = row.getCell(colNum);
			        CellData = String.valueOf(cell.getStringCellValue());   
			   }  
			   else 
			   {
			    System.out.println("Invalid Value, Valid Values are- String/Numeric");
			   }
		}
		else 
		{
		    System.out.println("Invalid Product Name, Valid Values are- Bureau/BusinessLoan/CreditCard/DigitalGold/HomeLoan/HomePage/Insurance/MutualFund/PersonalLoan/PersonalLoanFiftyK/SavingAccout");
		}
		   
		    
		return CellData;
	    }
}
