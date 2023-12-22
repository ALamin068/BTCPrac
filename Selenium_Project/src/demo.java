import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class demo {
	ChromeDriver driver;
	@Test
	public void run(){
		
		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
		
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
		
		
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
		
		hoverOver();
		
		addtoCart();
		
		//multi();
		
		//driver.quit();
	}
	
	
	public void addtoCart() {
		
		
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
		
		
		
		
	}
	
	
	
	public void reverseString() {
		String name = "Al Amin";
		
		char[] a = name.toCharArray();
		
		for(int i = a.length-1; i >= 0; i--) {
			System.out.print(a[i]);
		}
	}
	
	
	public void addArray() {
		int[] num = {1,2,4,5,6};
		int result = 0;
		
		for(int i = 0; i < num.length; i++) {
			
			result += num[i];
			
			
			
		}
		System.out.println(result);
	}
	
	
	public void hoverOver() {
		
		Actions a = new Actions(driver);
		
		a.moveToElement(driver.findElement(By.xpath("//*[@id=\"item_4_title_link\"]/div"))).build().perform();
		
	}
	
	
	public void multi() {
				
				
		List<WebElement> ele = null;
		for(int i = 1; i <= ele.size(); i++) {
		
		Actions a = new Actions(driver);
			
		ele = driver.findElements(By.xpath("//*[@id=\"inventory_container\"]/div/div/div["+i+"]"));

		a.moveToElement((WebElement) ele).build().perform();
			
		}
		
		
	}
	
	
	

}
