package seleniumPractica01;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PracticaSel {

	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		//obtener objetos /webElements de la pagina Web
		
		WebElement userName = driver.findElement(By.id("user-name"));
		WebElement PasswordText = driver.findElement(By.id("password"));
		WebElement logintBtn = driver.findElement(By.id("login-button"));
		
		//hacer Login
		
		userName.sendKeys("standard_user");
		Thread.sleep(500);
		PasswordText.sendKeys("secret_sauce");
		Thread.sleep(500);
		logintBtn.click();
		
		//Metodos del Explorador
		//obtener el titlo de la pagina
		
		String tittle = driver.getTitle();
		System.out.println("El titulo de la pagina es:" + tittle);
		
		//Obtener la URL
		
		String url = driver.getCurrentUrl();
		System.out.println("La URL actual es: " + url);
		
		//Metodos de navegacion
		
		//driver.navigate().back();
		//Thread.sleep(2000);
		//driver.navigate().forward();
		//Thread.sleep(2000);
		//driver.navigate().refresh();
		//Thread.sleep(2000);
		
		
		//verifica elemento desplegado en la pagina:
		
		//Ordena los productos a - z
				Select dropdown = new Select(driver.findElement(By.className("product_sort_container"))); 
				dropdown.selectByValue("lohi");

		boolean product = driver.findElement(By.className("inventory_item_name")).isDisplayed();
		
		if(product) {
			System.out.println("El articulo es desplegado");	
		}
		
	
		//obtener un texo del Web Element
		String prodtext = driver.findElement(By.className("inventory_item_name")).getText();
		
		boolean textCorrect = prodtext.contains("Sauce Labs Onesie");//Conteins es un metodo de JAVA que evalua 2 strings
		
		if (textCorrect) {
			System.out.println("El nombre del producto es correcto");
		}else {
			System.out.println("El nombre del Producto no es correcto");
		}
		Thread.sleep(2000);
		
		// 3.-Clic en el Carrito de Compras
		
		// 4.-Clic en chek out
		
		// 5.-LLenar Formulario
		
		// 6.-Click Co
		
		//Sauce Labs Backpack
		//Dropdown
		
		//Select dropdown = new Select(driver.findElement(By.className("product_sort_container"))); 
		//dropdown.selectByValue("lohi");
		
		//driver.close();//Cierra la ventana actual, con la que se esta interactuando
		//driver.quit(); // Cierra todas las ventanas o pestañas que se abrieron durante las pruebas

	}

}
