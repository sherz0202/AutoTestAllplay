import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class RefactoringMethodsPageForAllplay extends MainPageObject{
    public RefactoringMethodsPageForAllplay(AppiumDriver driver)
    {
        super(driver);
    }


    public void ClickMainMenu ()
    {
     this.waitForElementAndClick(By.id("android:id/text1"), "CannotClick", 5);
    }
    public void ClickRadio ()
    {
        this.waitForElementAndClick(By.xpath("//*[@text = 'Радио']"), "Cannot click Radio", 5);
    }
    public void ClickFilms ()
    {
        this.waitForElementAndClick(By.xpath("//*[@text = 'Фильмы и сериалы']"), "Cannot click Films", 5);
    }
    public void ClickGo ()
    {
        this.waitForElementAndClick(By.xpath("//*[@text = 'GO']"), "Cannot click Go", 5);
    }
    public void ClickTv ()
    {
        this.waitForElementAndClick(By.xpath("//*[@text = 'ТВ']"), "Cannot click TV", 5);
    }
    public void SwipeDown ()
    {
        this.swipeUpToFindElement(By.id("uz.allplay.app:id/all_collections"), "Cannot find collection Btn", 10);
    }

}



