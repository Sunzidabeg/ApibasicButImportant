package baseApi;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class NipaTest {

    @Test
    public void GetWeatherDetails1(){

        RestAssured.baseURI= "http://restapi.demoqa.com/utilities/weather/city";
        RequestSpecification httpRequest = RestAssured.given();

        Response response = httpRequest.request(Method.GET,"/Plano");
        String responseBody= response.getBody().asString();
        System.out.println("Response body is =>" + responseBody);


    }


}
