package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class PIM_Page {

	WebDriver driver;

	// Elements
	@FindBy(id = "empsearch_employee_status")
	WebElement emp_status_dropDown;
	
	
	

	// constructor
	public PIM_Page(WebDriver driver) {

		this.driver = driver;

	}

	// Methods

	public void selectElementFromEmpStatusDropDown(String status) {

		Select emp_status = new Select(emp_status_dropDown);
		emp_status.deselectByVisibleText(status);

	}
}
