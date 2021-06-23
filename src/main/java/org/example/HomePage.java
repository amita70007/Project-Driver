package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils {

    private By _about = By.cssSelector("a[href='/about']");

    public void click_On_About() {
        //click on woman category
        clickOnElement(_about);
        //print output
        System.out.println("Click on About Link");
    }
}
