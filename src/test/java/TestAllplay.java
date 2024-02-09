import org.junit.Test;

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

    }
}
