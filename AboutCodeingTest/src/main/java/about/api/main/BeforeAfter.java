package about.api.main;

import com.jayway.restassured.RestAssured;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static about.api.main.AppConstant.link;

/**
 * Created by wasey on 10/20/16.
 */
public class BeforeAfter {


    @BeforeMethod

    public static void beforetest()

    {
        System.out.println("Starting Test" + org.testng.annotations.Test.class);
        RestAssured.baseURI=link;
        RestAssured.port=80;


    }


    @AfterMethod

    public static void afterretest()

    {
        System.out.println("Closeing Test" + Test.class);

    }

}
