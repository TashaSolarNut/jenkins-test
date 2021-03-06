package selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import support.Browser;

public class SimpleTest {

  @Test
  public void sometest() {
    //http://www.seleniumhq.org/download/maven.jsp
    //https://code.google.com/p/selenium/wiki/GettingStarted
    
    WebDriver driver = Browser.launch();
    driver.get("https://yandex.ru");
    WebElement element = driver.findElement(By.name("text"));
    element.sendKeys("Kaspersky");
    element.submit();
    System.out.println("Page title is: " + driver.getTitle());
    driver.quit();
  }
  
}
