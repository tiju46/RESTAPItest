
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.get;
import org.json.simple.JSONObject;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.*;
public class demoApiRequest {

    RequestSpecification request;
    Response response;
    int statusCode;
   @Test(priority =1)
    void post(){
        baseURI ="http://localhost:3000/data";
        request = RestAssured.given();
        JSONObject reqparams = new JSONObject();

        reqparams.put("employee_name","kennyJK");
        reqparams.put("employee_salary",320801);
        reqparams.put("employee_age",28);
       request.contentType(ContentType.JSON);
        request.body(reqparams.toJSONString());
        response = request.post();
        statusCode = response.statusCode();
       Assert.assertEquals(statusCode, 201);

//       String employee_name = given().contentType(ContentType.JSON).log().all().
//               get("/30").then().extract().path("employee_name");
       response = given().contentType(ContentType.JSON).log().all().get("/34");
       JsonPath extractor = response.jsonPath();
       String emp_name = extractor.get("employee_name");
       Assert.assertEquals("kennyJK",emp_name);
       System.out.println("Emp name --->" +emp_name);


    }
    @Test(priority =2)
    void retrieveData(){
       response = get("http://localhost:3000/data/31");
       String body = response.getBody().asString();
        System.out.println(body);

    }
   //@Test(priority =3)
    void update(){
        baseURI = "http://localhost:3000/data";
         request = RestAssured.given();
         JSONObject reqparams = new JSONObject();
        reqparams.put("employee_name","Tony Johny");
        reqparams.put("employee_salary",46000);
        reqparams.put("employee_age",25);
        request.contentType(ContentType.JSON);
        request.body(reqparams.toJSONString());
        response = request.put("/30");
        statusCode = response.statusCode();
        Assert.assertEquals(200,statusCode);
        String employee_name = given().contentType(ContentType.JSON).log().all().
                get("/30").then().extract().path("employee_name");
        Assert.assertEquals("Tony Johny",employee_name);
        System.out.println("Emp name --->" +employee_name);

    }
   // @Test(priority =4)
    void delete(){
        baseURI = "http://localhost:3000/data";
       request = RestAssured.given();
        request.contentType(ContentType.JSON);
        response = request.delete("/28");
        statusCode = response.statusCode();
        Assert.assertEquals(200,statusCode);
    }
   // @Test(priority =5)
    void deletedID(){
        baseURI = "http://localhost:3000";
        basePath = "/data";
        response = given().contentType(ContentType.JSON).log().all().get("/28");
        JsonPath extractor = response.jsonPath();
        String id = extractor.get("id");
        System.out.println(id);
        Assert.assertEquals(null,id);

    }

}
