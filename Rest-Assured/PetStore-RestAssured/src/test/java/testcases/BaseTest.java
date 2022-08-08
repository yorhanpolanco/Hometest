package testcases;

import com.fasterxml.jackson.databind.util.JSONPObject;
import io.restassured.RestAssured;
import io.restassured.parsing.Parser;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

public class BaseTest {

    protected final String baseURI = "http://localhost:8080/api/v3";//TODO move out to property file
    protected Response response;
    protected JsonPath jsonData;
    protected JSONPObject requestParams;

    @DataProvider(name = "PetStore-data-provider")
    public Object[][] setDataProvider(){
        return new Object[][]
                {
                        {"available"},
                        {"pending"},
                        {"sold"}
                };
    }


    @BeforeTest
    public void setUp(){

        RestAssured.defaultParser = Parser.JSON;
        RestAssured.baseURI = baseURI;
    }

}
