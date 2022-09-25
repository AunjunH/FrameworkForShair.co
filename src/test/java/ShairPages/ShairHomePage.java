package ShairPages;

import Utils.CommonMethods;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ShairHomePage extends BasePage {
    @FindBy(id = "welcome")
    static
    WebElement userBadge;

    @FindBy(id = "carhire_viewModule")
    WebElement carhireTab;

    @FindBy(id = "menu_luxorySUV_viewJobVacancy")
    WebElement ShairLuxorySUVCarTab;

    @FindBy(xpath = "//div[@id='']//a[text()='Logout']")
    static
    WebElement logoutLink;

    @FindBy(id = "menu_admin_viewAdminModule")
    WebElement adminLink;

    @FindBy(id = "menu_admin_UserManagement")
    WebElement userManagementLink;

    @FindBy(id = "menu_admin_viewSystemUsers")
    WebElement usersLink;

    @FindBy(id = "searchSystemUser_userName")
    WebElement usernameInput;

    @FindBy(id = "searchBtn")
    WebElement searchBtn;

    @FindBy(xpath = "//table//td[text()='No Records Found']")
    WebElement noRecordFoundText;

    public void clickOnVacanciesTab() {
        carhireTab.click();
        ShairLuxorySUVCarTab.click();
    }

    public static void clickOnUserBadge() {
        userBadge.click();
    }

    public static void clickOnLogoutLink() {
        logoutLink.click();
    }

    public static void verifyPage() {
        Assert.assertTrue("User is not on home page", userBadge.isDisplayed());
        CommonMethods.takeScreenshot();
    }

    public void clickOnUsersLinkFromUserManagement() {
        Actions action = new Actions(driver);
        action.moveToElement(adminLink).moveToElement(userManagementLink).click(usersLink).build().perform();
    }

    public void searchWithUsername(String username) {
        usernameInput.sendKeys(username);
        searchBtn.click();
    }

    public void verifyNoRecordFoundTextIsDisplayed() {
        Assert.assertTrue( "Search results are still displayed",noRecordFoundText.isDisplayed());
    }
}



