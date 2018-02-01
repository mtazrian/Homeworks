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
public class TestScenario extends BasePage {

    @Test
    public void testOne() {

//        Navigate to website
        navigateToUrl("https://www.darksky.net/");


//        Create Array to add for loop results into
        ArrayList timeReceived = new ArrayList();


//        Create list of WebElements returned by xpath
        List<WebElement> elements = getDriver().findElements(By.xpath("//*[@id=\"timeline\"]/div/div[3]"));


//        For loop to print formatted list of elements
        for (WebElement s1 : elements) {
            String text = s1.getText().replaceAll("\n", "").replaceAll("\n", "");
            timeReceived.add(text.toUpperCase());
        }

//        Date format to print time in hours and AM/PM
        SimpleDateFormat sdf = new SimpleDateFormat("ha");


//        Calendar object to return date
        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());


//        Array created for expected time values
        ArrayList timeExpected = new ArrayList();


//        String builder to create string with times
        StringBuilder addTime = new StringBuilder();


//        Do while loop to add 2 hours to current time 12 times (24hrs) which is returned from calendar object
        int addHours = 2;
        int counter = 0;
        do {
            cal.add(Calendar.HOUR_OF_DAY, addHours);
            counter += 1;
            addTime.append(sdf.format(cal.getTime()));
        } while (counter < 11);


//        Insertion of NOW into index 0 of string
        timeExpected.add(addTime.insert(0, "NOW").toString());


//       Checking if timeReceived and timeExpected is equal with assertion
        Assert.assertEquals(timeReceived, timeExpected);

    }
}