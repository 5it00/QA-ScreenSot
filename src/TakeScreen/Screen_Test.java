package TakeScreen;
import  org.testng.Assert;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
public class Screen_Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.edge.driver", "D:\\MicrosoftDriver\\msedgedriver.exe");
WebDriver driver  = new EdgeDriver();
driver.get("file:///C:/Users/Khitam/Desktop/First-oneQA/Qa-automation-7thmar/index.html");
List <WebElement> studentNames= driver.findElements(By.tagName("option"));
int totalNumbers = studentNames.size();
System.out.println("original numbers are  ="+totalNumbers);
//driver.findElement(By.xpath("//*[@id=\"remove\"]")).click(); //remove one element
//remove all elements
//List <WebElement> studentNames= driver.findElements(By.tagName("option"));
//for(int i =0 ; i<studentNames.size();i++) {
//	driver.findElement(By.xpath("//*[@id=\"remove\"]")).click();
//}
//need to delete required number just do decleration 
int ineedtoRemove= 9 ;
List <WebElement> studentsNames= driver.findElements(By.tagName("option"));
for(  int i =0 ; i <ineedtoRemove;i++) {
	driver.findElement(By.xpath("//*[@id=\"remove\"]")).click();
	}
System.out.println("total number i had removed ="+ineedtoRemove);
// to delete one element from actual elements using testng (Assert)
List<WebElement> StudentAfterDeletion =driver.findElements(By.tagName("option"));
int actualNo = StudentAfterDeletion.size();
System.out.println("new actual numbers after  deletion ="+actualNo);
int expectedNo = totalNumbers - ineedtoRemove;
System.out.println("total number i expect after deletion  ="+expectedNo);
Assert.assertEquals(actualNo, expectedNo);
}}
