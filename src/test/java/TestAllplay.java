import com.beust.ah.A;
import org.junit.Test;
import org.openqa.selenium.ScreenOrientation;

public class TestAllplay extends CoreTestCase {
    private RefactoringMethodsPageForAllplay Allplay;

    @Override
    public void setUp() throws Exception {
        super.setUp();

        Allplay = new RefactoringMethodsPageForAllplay(driver);
    }

    @Test
    public void testMainPageOfAllplay() {
        //step1
        Allplay.ClickMainMenu();
        //step2
        Allplay.ClickTv();
        //step3
        Allplay.ClickMainMenu();
        Allplay.ClickRadio();
        //step4
        Allplay.ClickMainMenu();
        Allplay.ClickFilms();
        //step5
        Allplay.SwipeDown();
        //step5
        driver.rotate(ScreenOrientation.LANDSCAPE);
        Allplay.CheckTheRotation();
        //step6
        Allplay.ClickSearchBtn();
        //step7
        Allplay.TypeSearchName();
        driver.rotate(ScreenOrientation.PORTRAIT);
        //step8
        Allplay.ClickToFilm();
        //step8
        Allplay.CheckingTheFilm();
        driver.navigate().back();
        //step8
        Allplay.ClearSearchInput();
        //step8
        Allplay.ClickToClearHistory();
        Allplay.ClickBtnYes();
    }
}
