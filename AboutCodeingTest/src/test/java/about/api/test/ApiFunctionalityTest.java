package about.api.test;

import about.api.main.BeforeAfter;
import com.jayway.restassured.http.ContentType;
import static com.jayway.restassured.RestAssured.given;


/**
 * Created by wasey on 10/20/16.
 */
public class ApiFunctionalityTest extends BeforeAfter{


    @org.testng.annotations.Test

    public void responseTest()

    {

        given()
                .log().all()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .get()
                .then()
                .log().body()
                .statusCode(200);


    }


    @org.testng.annotations.Test

    public void idTest()

    {

    }
}
