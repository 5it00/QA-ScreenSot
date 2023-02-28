package TakeScreen;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Test_classfromLaastofirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.edge.driver", "D:\\MicrosoftDriver\\msedgedriver.exe");
WebDriver driver =  new EdgeDriver();
driver.get("file:///C:/Users/Khitam/Desktop/First-oneQA/Qa-automation-7thmar/index.html");
List<WebElement> getNamesfromLast2First = driver.findElements(By.tagName("option"));
for(int i =getNamesfromLast2First.size()-1;i>=0;i--) {
	if(i%2 !=0) {//remove them by remove click
		getNamesfromLast2First.get(i).click();
		System.out.println("elements got deleted");
		System.out.println(getNamesfromLast2First.get(i).getText());
		driver.findElement(By.id("remove")).click();
	}else {
		if(i%2 ==0) {//else make them stay
			getNamesfromLast2First.get(i).click();
			System.out.println("elements which have been stayed");
			System.out.println(getNamesfromLast2First.get(i).getText());
			
		}
	}
}
	}

}
