package pages;

public class HomePage extends BasePage {

    private String sectionLink = "//a[normalize-space()='%s' and @href]";//esta parte '%s' es para decirle que tome el comodin
    private String elegirPlanButton = "//a[normalize-space()='Elegir Plan' and @href]";//esta parte '%s' es para decirle que tome el comodin

    public HomePage() {
        super(driver);
    }

    public void navigateToFreeRangeTesters() {
        navigateTo("https://www.freerangeTesters.com");

    }

    public void clickOnSectionNavigation(String section) {
        String xpathSection = String.format(sectionLink, section);
        clickElement(xpathSection);
    }
    public void clickOnElegirPlanButton(){
        clickElement(elegirPlanButton);
    }

}
