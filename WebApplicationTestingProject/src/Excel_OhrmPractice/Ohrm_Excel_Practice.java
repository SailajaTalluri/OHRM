package Excel_OhrmPractice;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
public class Ohrm_Excel_Practice extends BaseTest {
FileOutputStream dataFile;
@Test(priority=1,description="Validating OrangeHRM Application HomePage Loginpanel Text")
public void LoginPanelTest() throws IOException 
{
FileInputStream testdata=new FileInputStream("./src/com/OrangeHRMApplicationValid_InvalidDataExcelDetails/OrangeHRMApplicationValid_InvalidDataExcelFile.xlsx");
XSSFWorkbook workbook=new XSSFWorkbook(testdata);
XSSFSheet sheet=workbook.getSheet("Sheet1");
FileInputStream ExcelOrangeHrmApplicationpropertiesFile=new FileInputStream("C:\\Users\\dell\\Desktop\\OHRMAutomation\\WebApplicationTestingProject\\src\\Excel_OhrmPractice\\ExcelOrangeHrmApplication.properties");
Properties properties=new Properties();
properties.load(ExcelOrangeHrmApplicationpropertiesFile);
XSSFRow row=sheet.getRow(1);
XSSFCell cell=row.getCell(0);

String Expected_Orangehrmloginpaneltext=cell.getStringCellValue();
System.out.println("The Expected orangehrm application loginpanel text is "+Expected_Orangehrmloginpaneltext);
By loginpaneltextproperty=By.id(properties.getProperty("OrangeHRMHomePageLoginPanelTextProperty"));
WebElement loginpaneltext=driver.findElement(loginpaneltextproperty);
String Actual_Orangehrmloginpaneltext=loginpaneltext.getText();
System.out.println("The Actual orangehrm application loginpanel text is "+Actual_Orangehrmloginpaneltext);

XSSFCell actualloginpaneltextcell=row.createCell(1);
actualloginpaneltextcell.setCellValue(Actual_Orangehrmloginpaneltext);
dataFile =new FileOutputStream("./src/com/OrangeHRMApplicationValid_InvalidDataExcelDetails/OrangeHRMApplicationValid_InvalidDataExcelFile.xlsx");
workbook.write(dataFile);
if(Actual_Orangehrmloginpaneltext.equals(Expected_Orangehrmloginpaneltext))
{
System.out.println("The Actual and Expected orangehrm application loginpaneltext is matched - PASS");
XSSFCell passcell=row.createCell(2);
passcell.setCellValue("pass");
dataFile=new FileOutputStream("./src/com/OrangeHRMApplicationValid_InvalidDataExcelDetails/OrangeHRMApplicationValid_InvalidDataExcelFile.xlsx");
workbook.write(dataFile);
}
else
{
System.out.println("The Actual and Expected orangehrm application loginpaneltext is matched - FAIL");
XSSFCell passcell=row.createCell(2);
passcell.setCellValue("Fail");
dataFile=new FileOutputStream("./src/com/OrangeHRMApplicationValid_InvalidDataExcelDetails/OrangeHRMApplicationValid_InvalidDataExcelFile.xlsx");
workbook.write(dataFile);
}

}		
}
