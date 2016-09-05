package webDriverDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WebDriverCencosud {
	
	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("http://192.168.0.90:1337/");
		
		//maximizar la pantalla del browser
		driver.manage().window().maximize();
		
		//login-limpia lo que se encuentra en el input con nombre=email
		driver.findElement(By.name("email")).clear();
		//login- ingresa el correo electrónico al input con nombre=email
		driver.findElement(By.name("email")).sendKeys("alejandra.alvarez@cencosud.cl");
		//login - limpia lo que se encuentra en el input co nombre=password
		driver.findElement(By.name("password")).clear();
		//login  - ingresa la password al input con nombre=password
		driver.findElement(By.name("password")).sendKeys("1002");
		
		//log - presiona el boton ingresar a traves del xpath del input
		driver.findElement(By.xpath("//input[@value='Ingresar']")).click();
		//es necesario parar la prueba por 3 segundos
		Thread.sleep(3000);
		//Al ingresar a la aplicación despues de loguearse se dirige al menu
		//y le hace click a la opción mantenedor
		driver.findElement(By.linkText("MANTENEDORES")).click();
		//es necesario parar la prueba por 3 segundos
		Thread.sleep(3000);
		//Realiza un clicke al elemento llamado Gerencia
		driver.findElement(By.linkText("Gerencia")).click();
		
		driver.findElement(By.className(":class['btn btn-default btn-xs']")).click();
		
		
		/*
		//Realiza un click al eleemento que es un boton llamado crear nueva
		driver.findElement(By.linkText("Crear Nueva")).click();
		
		//Limpia el elemento que tieneel id=nombre 
		driver.findElement(By.id("nombre")).clear();
		//Ingresa el nombre Gerencia 15 al elemento que tiene el id=nombre
		driver.findElement(By.id("nombre")).sendKeys("Gerencia 17");
		
		//por último realiza un click al boton que tiene como id= sbubitbutton
		driver.findElement(By.id("submitButton")).click();
		*/
		
	}

}
