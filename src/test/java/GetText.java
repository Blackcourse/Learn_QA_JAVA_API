import org.junit.jupiter.api.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetText {
    @Test
    public void TestGetText ()
    {
        Response response = RestAssured
                .get ("https://playground.learnqa.ru/api/get_text")
                .andReturn();
        response.prettyPrint();
    }



}
