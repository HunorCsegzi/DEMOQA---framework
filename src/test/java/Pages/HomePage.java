package Pages;

import Logger.LoggerUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//h5[text()='Elements']")
    private WebElement elementsField;
    @FindBy(xpath = "//h5[text()='Forms']")
    private WebElement formsField;
    @FindBy(xpath = "//h5[text()='Widgets']")
    private WebElement widgetsField;
    public void clickElementsPage(){
        elementMethods.clickElement(elementsField);
        LoggerUtility.infoTest("The user clicks on elementsField");
    }

    public void clickFormsPage(){
        elementMethods.clickElement(formsField);
        LoggerUtility.infoTest("The user clicks on formsField");
    }
    public void clickWidgetsPage(){
        elementMethods.clickElement(widgetsField);
        LoggerUtility.infoTest("The user clicks on widgetField");
    }
}
