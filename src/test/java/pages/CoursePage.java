package pages;

public class CoursePage extends BasePage{

    private String introduccionTestingLing ="//a[normalize-space()='Introducción al Testing de Software' and @href]";


    public CoursePage() {
        super(driver);
    }
    public void clickOnIntroduccionTestingLink() {
        clickElement(introduccionTestingLing);
    }
}
