package seleniumPractica01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tarea_1 {

	public static void main(String[] args)  throws InterruptedException {
		
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
		
		
		// 2.-Agregar Backpack
		
		
		String prodtext = driver.findElement(By.className("inventory_item_name")).getText();
		
		boolean textCorrect = prodtext.contains("Sauce Labs Backpack");//Conteins es un metodo de JAVA que evalua 2 strings
		
		if (textCorrect) {
			System.out.println("El nombre del producto es correcto");
		}else {
			System.out.println("El nombre del Producto no es correcto");
		}
		Thread.sleep(2000);
		
		
		// 3.-Clic en el Carrito de Compras
		
		WebElement AddCar = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		AddCar.click();
		Thread.sleep(2000);
		
		// 4.-Clic en chek out
		
		WebElement carrito = driver.findElement(By.id("shopping_cart_container"));
		carrito.click();
		Thread.sleep(2000);
		
		//4.1 click en check out 
		WebElement checkOut = driver.findElement(By.id("checkout"));
		checkOut.click();
		Thread.sleep(2000);
		
			
		// 5.-LLenar Formulario
				
		// 5.1 Ingresar Nombre
		
		WebElement NombreCliente = driver.findElement(By.id("first-name"));
		NombreCliente.sendKeys("Paloma");
		Thread.sleep(2000);
				
		
		// 5.2 Ingresar Apellido
		
		WebElement Apellido = driver.findElement(By.id("last-name"));
		Apellido.sendKeys("Corona");
		Thread.sleep(2000);
		
		
		// 5.3 Ingresar Codigo Postal
		
		WebElement CP = driver.findElement(By.id("postal-code"));
		CP.sendKeys("55060");
		Thread.sleep(2000);
				
		
		// 6.-Click Continue
		
		WebElement BtnContinuar = driver.findElement(By.id("continue"));
		BtnContinuar.click();
		Thread.sleep(2000);
		
	
		// 7.-Click Finish
		
		WebElement TerminarCompra = driver.findElement(By.id("finish"));
		TerminarCompra .click();
		Thread.sleep(2000);		
		
		//8.-Validación de Texto

	}

}
