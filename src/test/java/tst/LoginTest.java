package tst;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.LandingPage;
import pages.LoginPage;

public class LoginTest {

	@Test
	public void doLogin() {
		HomePage homePage=new HomePage();
		LoginPage loginPage=homePage.goToLoginPage();
		LandingPage landingPage=loginPage.doLogin("ashsharma22@gmail.com", "Legend@13");
	}
}
