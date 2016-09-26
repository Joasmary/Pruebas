package webDriverDemo;



import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;



public class RecorridoCencosud {

	private WebDriver driver;
	private String baseUrl;
	private StringBuffer verificationErrors = new StringBuffer();

	@BeforeClass(alwaysRun = true)
	public void setUp() throws Exception {
		FirefoxProfile fxProfile = new FirefoxProfile();

		fxProfile.setPreference("browser.download.manager.showWhenStarting", false);
		fxProfile.setPreference("browser.helperApps.neverAsk.openFile","application/octet-stream");
		fxProfile.setPreference("browser.helperApps.neverAsk.saveToDisk","application/octet-stream");
		fxProfile.setPreference("browser.helperApps.alwaysAsk.force", false);
		fxProfile.setPreference("browser.download.manager.alertOnEXEOpen", false);
		fxProfile.setPreference("browser.download.manager.focusWhenStarting", false);
		fxProfile.setPreference("browser.download.manager.useWindow", false);
		fxProfile.setPreference("browser.download.manager.showAlertOnComplete", false);
		fxProfile.setPreference("browser.download.manager.closeWhenDone", false);
		driver = new FirefoxDriver(fxProfile);
		baseUrl = "http://192.168.0.90:1337/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test
	public void testUntitled() throws Exception {
		// open | / | 
		driver.get(baseUrl + "/");
		// type | name=email | alejandra.alvarez@cencosud.cl
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys("alejandra.alvarez@cencosud.cl");
		// type | name=password | 1002
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("1002");
		// click | //input[@value='Ingresar'] | 
		driver.findElement(By.xpath("//input[@value='Ingresar']")).click();

		Thread.sleep(3000);
		// click | link=INGRESO HORAS | 
		driver.findElement(By.linkText("INGRESO HORAS")).click();

		Thread.sleep(5000);
		// click | link=PROYECTOS | 
		driver.findElement(By.linkText("PROYECTOS")).click();

		Thread.sleep(5000);
		// click | link=Nuevo Proyecto | 
		driver.findElement(By.linkText("Nuevoss Proyecto")).click();

		Thread.sleep(5000);
		// click | css=button.btn.btn-danger | 
		driver.findElement(By.cssSelector("button.btn.btn-danger")).click();

		Thread.sleep(3000);

		// click | link=REPORTES | 
		driver.findElement(By.linkText("REPORTES")).click();

		Thread.sleep(3000);
		// click | link=Dashboard | 
		driver.findElement(By.linkText("Dashboard")).click();

		Thread.sleep(3000);
		// click | link=REPORTES | 
		driver.findElement(By.linkText("REPORTES")).click();

		Thread.sleep(3000);
		// click | link=Reporte General | 

		driver.findElement(By.linkText("Reporte General")).click();

		Thread.sleep(8000);
		// click | link=MANTENEDORES | 
		driver.findElement(By.linkText("MANTENEDORES")).click();

		Thread.sleep(3000);
		// click | link=Torre | 
		driver.findElement(By.linkText("Torre")).click();

		Thread.sleep(5000);
		// click | css=span.glyphicon.glyphicon-pencil | 
		driver.findElement(By.cssSelector("span.glyphicon.glyphicon-pencil")).click();

		Thread.sleep(5000);
		// click | css=button.btn.btn-default | 
		driver.findElement(By.cssSelector("button.btn.btn-default")).click();

		Thread.sleep(3000);
		// click | link=MANTENEDORES | 
		driver.findElement(By.linkText("MANTENEDORES")).click();
		// click | link=Gerencia | 

		Thread.sleep(3000);
		driver.findElement(By.linkText("Gerencia")).click();

		Thread.sleep(3000);
		// click | link=MANTENEDORES | 
		driver.findElement(By.linkText("MANTENEDORES")).click();

		Thread.sleep(3000);
		// click | link=Roles | 
		driver.findElement(By.linkText("Roles")).click();

		Thread.sleep(5000);
		// click | link=Crear Nuevo | 
		driver.findElement(By.linkText("Crear Nuevo")).click();
		Thread.sleep(5000);
		// click | css=button.btn.btn-default | 
		driver.findElement(By.cssSelector("button.btn.btn-default")).click();

		Thread.sleep(3000);
		// click | link=MANTENEDORES | 
		driver.findElement(By.linkText("MANTENEDORES")).click();

		Thread.sleep(3000);
		// click | link=Unidad de Negocio | 
		driver.findElement(By.linkText("Unidad de Negocio")).click();

		Thread.sleep(5000);
		// click | //button[@onclick='editarUN(1)'] | 
		driver.findElement(By.xpath("//button[@onclick='editarUN(1)']")).click();

		Thread.sleep(5000);
		// click | css=button.btn.btn-default | 
		driver.findElement(By.cssSelector("button.btn.btn-default")).click();

		Thread.sleep(3000);
		// click | link=MANTENEDORES | 
		driver.findElement(By.linkText("MANTENEDORES")).click();

		Thread.sleep(3000);
		// click | link=Proveedores y Tarifas | 
		driver.findElement(By.linkText("Proveedores y Tarifas")).click();

		Thread.sleep(3000);
		// click | link=MANTENEDORES | 
		driver.findElement(By.linkText("MANTENEDORES")).click();

		Thread.sleep(3000);
		// click | link=Cambio Moneda a USD | 
		driver.findElement(By.linkText("Cambio Moneda a USD")).click();

		Thread.sleep(3000);
		// click | link=MANTENEDORES | 
		driver.findElement(By.linkText("MANTENEDORES")).click();

		Thread.sleep(3000);
		// click | link=Maestro Tercero | 
		driver.findElement(By.linkText("Maestro Tercero")).click();

		Thread.sleep(3000);
		// click | link=MANTENEDORES | 
		driver.findElement(By.linkText("MANTENEDORES")).click();

		Thread.sleep(3000);
		// click | link=Usuario | 
		driver.findElement(By.linkText("Usuario")).click();

		Thread.sleep(3000);
		// click | link=MANTENEDORES | 
		driver.findElement(By.linkText("MANTENEDORES")).click();

		Thread.sleep(3000);
		// click | link=País | 
		driver.findElement(By.linkText("País")).click();

		Thread.sleep(3000);
		// click | link=MANTENEDORES | 
		driver.findElement(By.linkText("MANTENEDORES")).click();

		Thread.sleep(3000);
		// click | link=Agrupación | 
		driver.findElement(By.linkText("Agrupación")).click();

		Thread.sleep(3000);
		// click | link=MANTENEDORES | 
		driver.findElement(By.linkText("MANTENEDORES")).click();

		Thread.sleep(3000);
		// click | link=Líderes de Proyecto | 
		driver.findElement(By.linkText("Líderes de Proyecto")).click();

		Thread.sleep(3000);
		// click | link=ORDEN DE SERVICIO | 
		driver.findElement(By.linkText("ORDEN DE SERVICIO")).click();

		Thread.sleep(3000);
		// click | link=Nueva Orden de Servicio | 
		driver.findElement(By.linkText("Nueva Orden de Servicio")).click();

		Thread.sleep(3000);
		// click | css=button.btn.btn-default | 
		driver.findElement(By.cssSelector("button.btn.btn-default")).click();

		Thread.sleep(3000);
		// click | link=Alejandra Alvarez (Administrador) | 
		driver.findElement(By.linkText("Alejandra Alvarez (Administrador)")).click();

		Thread.sleep(3000);
		// click | link=Cerrar Sesión | 
		driver.findElement(By.linkText("Cerrar Sesión")).click();
	}

	@AfterClass(alwaysRun = true)
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Antes del método");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("Después del metodo");
	}
}

