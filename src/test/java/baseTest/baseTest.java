package baseTest;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class baseTest {
    private AppiumDriver driver;
    @Before
    public void Before() throws MalformedURLException {
        System.out.println("Iniciando conexion...");

        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability("deviceName","emulator-5554");
        capabilities.setCapability("platformVersion","9");
        capabilities.setCapability("appPackage","com.vrproductiveapps.whendo");
        capabilities.setCapability("appActivity",".ui.HomeActivity");
        capabilities.setCapability("platformName","Android");

        this.driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        this.driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
    }
    @Test
    public void Test_First(){
        //Add Nota
        this.driver.findElement(By.id("com.vrproductiveapps.whendo:id/fab")).click();
        //text Titulo Nota
        this.driver.findElement(By.id("com.vrproductiveapps.whendo:id/noteTextTitle")).sendKeys("Nota");
        //text Body Nota
        this.driver.findElement(By.id("com.vrproductiveapps.whendo:id/noteTextNotes")).sendKeys("Body Nota");
        //clic Fecha-Repeater
        this.driver.findElement(By.id("com.vrproductiveapps.whendo:id/note_item_reminder")).click();
        //Fijar Fecha Limite
        this.driver.findElement(By.id("com.vrproductiveapps.whendo:id/due_date")).click();
        //Poner Fecha
        this.driver.findElement(By.id("android:id/button1")).click();
        //Fijar Time
        this.driver.findElement(By.id("com.vrproductiveapps.whendo:id/time")).click();
        //Poner Tiempo
        this.driver.findElement(By.id("android:id/button1")).click();
        //Recordatorio
        this.driver.findElement(By.id("com.vrproductiveapps.whendo:id/reminder")).click();
        //Poner Recordatorio
        this.driver.findElement(By.xpath("//android.widget.RadioButton[@text='5 minutes before']")).click();
        //Repetidor
        this.driver.findElement(By.id("com.vrproductiveapps.whendo:id/repeat")).click();
        //Poner Repetidor
        this.driver.findElement(By.xpath("//android.widget.RadioButton[contains(@text,'Daily')]")).click();
        //Grabar Nota
        this.driver.findElement(By.id("com.vrproductiveapps.whendo:id/saveItem")).click();
        String actualNote=this.driver.findElement(By.id("com.vrproductiveapps.whendo:id/home_list_item_text")).getText();
        String expectedNote="Nota";
        Assert.assertEquals("El Titulo de la Nota es Correcto",actualNote,expectedNote);
        //Select Nota
        this.driver.findElement(By.id("com.vrproductiveapps.whendo:id/home_list_item_text")).click();
        //Delete Nota
        this.driver.findElement(By.id("com.vrproductiveapps.whendo:id/deleteItem")).click();
        //Confirmar Delete
        this.driver.findElement(By.id("android:id/button1")).click();
        String actualList=this.driver.findElement(By.id("com.vrproductiveapps.whendo:id/noNotesText")).getText();
        String expectedList="No tasks added";
        Assert.assertEquals("La lista esta vacia",actualList,expectedList);
    }

    @After
    public void after(){
        System.out.println("After...");
        this.driver.quit();

    }
}
