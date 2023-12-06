package Stepdefs;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

public class TestOrangeHRMLandPage {
    WebDriver driver;

    @Given("User navigates to Orange HRM Landing Page")
    public void user_navigates_to_orange_hrm_landing_page() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com");
        ////System.out.println("Venkata");
        Thread.sleep(5000);

    }

    @When("User enters login details")
    public void user_enters_login_details(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        ///List<String> credentials = dataTable.asList(String.class);
        List<List<String>> credentials = dataTable.asLists();
        String userN = credentials.get(1).get(0);
        String pass = credentials.get(1).get(1);
        System.out.println("The size of List of Lists: = " + credentials.size());
        System.out.println("Username: " + userN);
        System.out.println("password: " + pass);

    }

    @When("User clicks the login button")
    public void user_clicks_the_login_button() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        Thread.sleep(3000);
    }


    @When("User Reads TestData")
    public void userReadsTestData() throws IOException, Throwable,Exception {
        //obtaining/streams input bytes from a file
        FileInputStream fis = new FileInputStream(new File("C:\\Users\\welcome\\Desktop\\Appium\\OrangeHRM\\src\\main\\resources\\TestData\\ReadExcel.xls"));
//creating workbook instance that refers to .xls file
        HSSFWorkbook wb = new HSSFWorkbook(fis);
//creating a Sheet object to retrieve the object
        ///HSSFSheet sheet = wb.getSheetAt(0);
        HSSFSheet sheet = wb.getSheet("Sheet1");
        //Iterate through each rows one by one
        ///We can also say, the below line would create an array of rows, which corresponds to the rows with data in the sheet
//        Iterator<Row> rowIterator = sheet.iterator();
//
//        while (rowIterator.hasNext()) { ////here we are checking if there is a row with data? if yes this loop will be satisifed
//
//            Row row = rowIterator.next(); ////this will pick the first row for processing
//
//            //For each row, iterate through all the columns
//            Iterator<Cell> cellIterator = row.cellIterator();
//
//            while (cellIterator.hasNext()) {
//
//                Cell cell = cellIterator.next();
//
//                switch (cell.getCellType()){
//                    case STRING ->
//                            System.out.print("The cellType found is String, the cell value is "+cell.getStringCellValue());
//                    case NUMERIC ->
//                            System.out.print("The cellType found is Numeric, the cell value is "+cell);
//                }
//
//                System.out.println(" | ");
//            }
//
//        }///while at line 73
        int rowsC = sheet.getLastRowNum();
        int colsC = sheet.getRow(0).getLastCellNum();
        for(int i=1;i<=rowsC;i++){
            for(int j=0;j<=colsC;j++){
                ///System.out.println("Cell Value at row "+i+" and col "+j+" is: "+sheet.get;
                switch (sheet.getRow(i).getCell(j).getCellType()){
                    case STRING -> System.out.println("The cellType found is String, the cell value is "+sheet.getRow(i).getCell(j).getStringCellValue());
                    case NUMERIC -> System.out.println("The cellType found is Numeric, the cell value is "+sheet.getRow(i).getCell(j).getNumericCellValue());

                }
                System.out.print(" | ");
            }
        }
        fis.close();
    } ////line 61

    @When("User enters {string} and {string} in the fields")
    public void user_enters_and_in_the_fields(String user, String password)  throws Exception, Throwable{
        driver.findElement(By.name("username")).sendKeys(user);
        driver.findElement(By.name("password")).sendKeys(password);

    }


    @When("User enters login credentials in the login fields")
    public void user_enters_and_in_the_login_fields(DataTable dataTable) throws Throwable{
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.

        //Without dataTable.transpose we would get the error/exception listed below in next 3 lines.
        ////Can't convert DataTable to List<java.lang.String>.
        /////There was a table cell converter but the table was too wide to use it.
        ///////Please reduce the table width or register a TableEntryTransformer or TableRowTransformer for java.lang.String.
        List<String> log0n  = dataTable.transpose().asList(String.class);
        ///for(int i=0;i<log0n.size();i++)
        Thread.sleep(3000);
        String userN = log0n.get(0);
        String pwd = log0n.get(1);
        driver.findElement(By.name("username")).sendKeys(userN);
        driver.findElement(By.name("password")).sendKeys(pwd);
        Select s = new Select(driver.findElement(By.name("abc")));
        s.selectByVisibleText("vkr");


    }


}
