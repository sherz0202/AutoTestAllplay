import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class RefactoringMethodsPageForAllplay extends MainPageObject {
    public RefactoringMethodsPageForAllplay(AppiumDriver driver) {
        super(driver);
    }


    public void ClickMainMenu() {
        this.waitForElementAndClick(By.id("android:id/text1"), "CannotClick", 5);
    }

    public void ClickRadio() {
        this.waitForElementAndClick(By.xpath("//*[@text = 'Радио']"), "Cannot click Radio", 5);
    }

    public void ClickFilms() {
        this.waitForElementAndClick(By.xpath("//*[@text = 'Фильмы и сериалы']"), "Cannot click Films", 5);
    }

    public void ClickGo() {
        this.waitForElementAndClick(By.xpath("//*[@text = 'GO']"), "Cannot click Go", 5);
    }

    public void ClickTv() {
        this.waitForElementAndClick(By.xpath("//*[@text = 'ТВ']"), "Cannot click TV", 5);
    }

    public void SwipeDown() {
        this.swipeUpToFindElement(By.id("uz.allplay.app:id/all_collections"), "Cannot find collection Btn", 10);
    }

    public void CheckTheRotation() {
        this.waitForElementNotPresent(By.id("android:id/statusBarBackground"), "Cannot rotate", 5);
    }

    public void ClickSearchBtn() {
        this.waitForElementAndClick(By.id("uz.allplay.app:id/search"), "Cannot find the search Btn", 5);
    }

    public void TypeSearchName()
    {
        this.waitForElementAndSendKeys(By.id("uz.allplay.app:id/input_view"),"Интер","Cannot SendKeys",5);
    }
    public void SwipeDownToFindFilm() {
        this.swipeUpToFindElement(By.xpath("//*[@text = 'Интерстеллар']"), "Cannot find collection Btn", 5);
    }
    public void ClickToFilm()
    {
        this.waitForElementAndClick(By.xpath("//*[@text = 'Интерстеллар']"), "Cannot click TV", 5);
    }
    public void CheckingTheFilm ()
    {
        this.waitForElement(By.id("uz.allplay.app:id/play_btn"),"Cannot open film",5);
    }
    public void ClearSearchInput ()
    {
        this.waitForElementAndClear(By.id("uz.allplay.app:id/input_view"),"Cannot clear input",5);
    }
    public void ClickToClearHistory ()
    {
     this.waitForElementAndClick(By.id("uz.allplay.app:id/clearHistory"),"Cannot clear history",5);
    }
    public void ClickBtnYes ()
    {
        this.waitForElementAndClick(By.id("android:id/button1"),"Cannot click Btn Yes",5);
    }

}



