package dark_sky_assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.text.SimpleDateFormat;
import java.util.*;


/**
 * Created by Mo Tazrian on 1/25/18.
 */
public class MidtermPartTwo extends BasePage {

    @Test
    public void MidtermPartTwo() {

//        Midterm Question One

        ArrayList textAdded = new ArrayList();

        List<WebElement> third = getDriver().findElements(By.className("title ng-binding"));

        for(WebElement s1 : third) {
            String text = s1.getText();
            textAdded.add(text);
        }

        System.out.println(textAdded.get(2));
        System.out.println(textAdded.get(4));

//        Midterm Question Two

        HashMap<String,String> hm = new HashMap<>();

        String title = getTitle(By.className("title ng-binding"));
        String desc = getDescription(By.className("description ng-binding"));

        hm.put(title, desc);

        for (String key : hm.keySet()) {
        }
        for (String values : hm.values()) {
        }
    }

    private String getTitle(By locator) {
        String title;
        title = getDriver().findElement(locator).getText();
        return title;
    }

    private String getDescription(By locator) {
        String desc;
        desc = getDriver().findElement(locator).getText();
        return desc;
    }
}