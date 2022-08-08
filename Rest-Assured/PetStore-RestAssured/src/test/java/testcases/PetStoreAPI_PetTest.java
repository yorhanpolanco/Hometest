package testcases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PetStoreAPI_PetTest extends BaseTest{

    @Test(dataProvider = "PetStore-data-provider")
    public void findPetsByAnyStatus(String status){


        response = given()
                        .pathParam("status",status)
                    .when()
                            .get("/pet/findByStatus?status={status}")
                    .then()
                        .statusCode(200)
                    .extract().response();

//        jsonData = response.getBody().jsonPath();
//
//        PetPojo[] petPojos = jsonData.getObject("",PetPojo[].class);
//
//        for(int i=0; i < petPojos.length; i++){
//
//            System.out.println(petPojos[i].getPetName());
//        }

//        System.out.println("Pets with "+status+" status\n");
//        System.out.println(jsonData.getString("name"));
//        System.out.println("-----------------------------------------------\n");

    }

    @Parameters({"invalidStatus"})
    @Test
    public void tryToSearchPetByInvalidStatus(String invalidStatus){

        response = given()
                        .pathParam("status",invalidStatus)//TODO: it could be multiple values
                    .when()
                        .get("/pet/findByStatus?status={status}")
                    .then()
                        .statusCode(400)
                        .extract().response();
    }

    @Test
    public void addNewPetToStore(){

        //TODO: it could be better
        String body = "{\n" +
                "  \"id\": 12,\n" +
                "  \"name\": \"peggy\",\n" +
                "  \"category\": {\n" +
                "    \"id\": 1,\n" +
                "    \"name\": \"Dogs\"\n" +
                "  },\n" +
                "  \"photoUrls\": [\n" +
                "    \"google.com.do\"\n" +
                "  ],\n" +
                "  \"tags\": [\n" +
                "    {\n" +
                "      \"id\": 2,\n" +
                "      \"name\": \"oneTag\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"status\": \"sold\"\n" +
                "}";

        response = given()
                    .header("Content-Type","application/json")
                    .and()
                    .body(body)
                .when()
                .post("/pet")
                .then()
                    .statusCode(200)
                .extract().response();
    }

    @Parameters({"petId"})
    @Test
    public void deletePetFromStore(String petId){

        response = given()
                    .header("Content-Type","application/json")
                .when()
                    .pathParam("id",petId)
                    .delete("/pet/{id}")
                .then()
                    .statusCode(200)
                    .extract().response();
    }
}
