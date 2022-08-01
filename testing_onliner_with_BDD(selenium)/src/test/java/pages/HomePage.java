package pages;

import com.pavlov.testing.driverfactory.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    private static final int WAIT = 15;

    private static final String ELEMENT_OF_MAIN_MENU_LINK_PATTERN =
            "//div//ul[@class='b-main-navigation']//span[contains(text(),'%s')]";
    private static final String AVTOBARACHOLKA_SUBMENU_LINK_PATTERN = "//div//ul[@class='b-main-navigation']" +
            "//div[contains(@class,'dropdown-column_75')]//div[contains(@class,'_dropdown-wrapper')]";
    private static final String DOMA_I_KVARTIRY_SUBMENU_LINK_PATTERN =
            "//div[contains(@class,'_dropdown-column_50')]//a[contains(text(),'Продажа')]/../..";

    public void openOnlinerWebsite() {
        WebDriverFactory.setChromeDriver();
        WebDriverFactory.getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(WAIT));
        WebDriverFactory.getDriver().get("http://www.onliner.by");
    }

    public void movePointerOnElementOfMainMenu(String value) {
        Actions actions = new Actions(WebDriverFactory.getDriver());
        WebElement element = WebDriverFactory.getDriver().findElement(By
                .xpath(String.format(ELEMENT_OF_MAIN_MENU_LINK_PATTERN, value)));
        actions.moveToElement(element).build().perform();
    }

    public boolean displayedSubmenuAvtobaracholka() {
        WebElement element = WebDriverFactory.getDriver().findElement(By.xpath(AVTOBARACHOLKA_SUBMENU_LINK_PATTERN));
        new WebDriverWait(WebDriverFactory.getDriver(), Duration.ofSeconds(WAIT))
                .until(ExpectedConditions.visibilityOfAllElements(element));
        return element.isDisplayed();
    }

    public boolean displayedSubmenuDomaIKvartiry() {
        WebElement element = WebDriverFactory.getDriver().findElement(By.xpath(DOMA_I_KVARTIRY_SUBMENU_LINK_PATTERN));
        new WebDriverWait(WebDriverFactory.getDriver(), Duration.ofSeconds(WAIT))
                .until(ExpectedConditions.visibilityOfAllElements(element));
        return element.isDisplayed();
    }
}
