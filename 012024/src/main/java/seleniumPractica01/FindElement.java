package seleniumPractica01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;


public class FindElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		//obtener objetos /webElements de la pagina Web
		
		WebElement userName = driver.findElement(By.id("user-name"));
		WebElement PasswordText = driver.findElement(By.id("password"));
		WebElement logintBtn = driver.findElement(By.id("login-button"));
		
		// 1.-Hacer Login
		
		userName.sendKeys("standard_user");
		Thread.sleep(500);
		PasswordText.sendKeys("secret_sauce");
		Thread.sleep(500);
		logintBtn.click();
		
		//find Element
		
		List<WebElement> prodList = driver.findElements(By.className("iventory_item_name"));
		System.out.println("Numero de Elementos:" + prodList.size());
		
		for (int i=0; i<prodList.size(); i++) {
			System.out.println("Los productos son: " + prodList.get(i).getText());
		}
		
		driver.quit();
	}


	}


