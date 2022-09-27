package script;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Utility;
import page.HomePage;

public class Test2 extends BaseTest
{
	@Test(priority = 2)
	public void testB() {
		
		String v=Utility.getXlData(XLPATH,"test1", 0, 0);
		Reporter.log("From xl:"+v,true);
		
		String title = driver.getTitle();
		Reporter.log(title,true);
		
		HomePage homePage=new HomePage(driver);
		String label = homePage.getLabel();
		Reporter.log(label,true);
		
		Assert.assertEquals(label,"CONTACT ME");
		
	}
}
