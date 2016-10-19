package about.api.test;

import about.api.main.Setup;
import com.jayway.restassured.http.ContentType;

import static com.jayway.restassured.RestAssured.get;
import static com.jayway.restassured.RestAssured.given;

/**
 * Created by wasey on 10/18/16.
 */
public class Test extends Setup {


    @org.testng.annotations.Test

    public void responseTest()

    {



        given()
                .contentType(ContentType.JSON);
                get().getBody().prettyPrint().toString();

    }


}
