package about.api.main;

import com.jayway.restassured.RestAssured;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static about.api.main.Appconstant.link;

/**
 * Created by wasey on 10/18/16.
 */
public class Setup {

@BeforeTest

        public static void beforetest()

        {
            System.out.println("Starting Test" + org.testng.annotations.Test.class);
            RestAssured.baseURI=link;
            RestAssured.port=80;


        }


@AfterTest

         public static void afterretest()

         {
             System.out.println("Closeing Test" + Test.class);

          }


}
