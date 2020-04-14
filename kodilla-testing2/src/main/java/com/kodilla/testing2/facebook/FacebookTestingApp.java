package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_SELECT_DAY= "//div[contains(@class=\"_5k_5\")]/span/span/select[1]";
    public static final String XPATH_SELECT_MONTH = "//div[contains(@class=\"_5k_5\")]/span/span/select[2]";
    public static final String XPATH_SELECT_YEAR = "//div[contains(@class=\"_5k_5\")]/span/span/select[3]";

    public static final String XPATH_WAIT_FOR_SELECT1 = "//select[1]";
    public static final String XPATH_WAIT_FOR_SELECT2 = "//select[2]";
    public static final String XPATH_WAIT_FOR_SELECT3 = "//select[3]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        while (!driver.findElement(By.xpath(XPATH_WAIT_FOR_SELECT1)).isDisplayed());

        WebElement dayCombo = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select selectDay = new Select(dayCombo);
        selectDay.selectByIndex(7);

        while (!driver.findElement(By.xpath(XPATH_WAIT_FOR_SELECT2)).isDisplayed());

        WebElement monthCombo = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select selectMonth = new Select(monthCombo);
        selectMonth.selectByIndex(7);

        while (!driver.findElement(By.xpath(XPATH_WAIT_FOR_SELECT3)).isDisplayed());

        WebElement yearCombo = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select selectYear = new Select(yearCombo);
        selectYear.selectByIndex(2007);
    }
}
