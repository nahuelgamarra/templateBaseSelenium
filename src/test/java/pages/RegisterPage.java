package pages;

import java.util.List;

public class RegisterPage extends BasePage {


    private String planDropdown= "//select[@id='cart_cart_item_attributes_plan_with_interval']";



    public RegisterPage() {
        super(driver);
    }

    public List<String> getPlanDropdown() {
        return getDropDownValues(planDropdown);
    }
}
