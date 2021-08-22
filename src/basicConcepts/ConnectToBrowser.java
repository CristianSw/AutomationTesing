package basicConcepts;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ConnectToBrowser {
    public static void main(String[] args) {


//        Create object for Firefox browser
        FirefoxDriver driver  = new FirefoxDriver();
        driver.get("https://google.com");
        System.out.println(driver.getTitle());


    }
}
