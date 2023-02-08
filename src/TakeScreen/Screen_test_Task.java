package TakeScreen;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Screen_test_Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "D:\\MicrosoftDriver\\msedgedriver.exe");
		WebDriver driver  = new EdgeDriver();
		driver.get("file:///C:/Users/Khitam/Desktop/First-oneQA/Qa-automation-7thmar/index.html");
		List<WebElement> studentsElement= driver.findElements(By.tagName("option"));
		for(int i = 0; i<studentsElement.size();i++) {
			if(i  %2 !=0) {
				studentsElement.get(i).click();
				System.out.println("student names got removed :");
				System.out.println(studentsElement.get(i).getText());
				driver.findElement(By.id("remove")).click();
			}
			else if(i%2==0) {
				studentsElement.get(i).click();
				System.out.println("student names stayed : ");
				System.out.println(studentsElement.get(i).getText());
			}
		}
	}
}