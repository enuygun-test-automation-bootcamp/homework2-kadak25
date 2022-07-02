package Constants;

import org.openqa.selenium.By;

public class Constants {
    public static  final String base_Url ="https://demoqa.com";
    public static final By elementsLocator = By.xpath("(//div[@class='card mt-4 top-card'])[1]");
    public static final By webTablesLocator = By.xpath("(//li[@id='item-3'])[1]");
    public static final By searchBoxLocator = By.id("searchBox");
}
