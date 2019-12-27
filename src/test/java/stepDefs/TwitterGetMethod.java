package stepDefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import com.sun.org.apache.regexp.internal.RE;
import io.restassured.response.Response;
import org.junit.Test;
import sun.security.x509.OtherName;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;
import javax.naming.ldap.StartTlsResponse;
import javax.xml.soap.SAAJResult;

import java.util.Currency;

import static org.hamcrest.Matchers.*;



public class TwitterGetMethod {

String ConsumerKey = "Qj9IaZIG8NGQiOzk5eHYdir4C";
String ConsumerSecret = "IB2X4xMlzXAGysqoMKsT0UeYSNcepGdV3wQFWdlnF7N45Oxl0P";
String AccessKey = "1204375673592307712-U63QHflqsjXnYmOd549rlbB1NLt1jw";
String TokenSecret = "StaSS4QSkJ69VrE1V1w0vvBqn6r1UDFFlw0CoUUJ3EyhO";


    @Given("^I am on Twitter Home Page$")
    public void i_am_on_Twitter_Home_Page() {

        Response res = given().auth().oauth(ConsumerKey,ConsumerSecret,AccessKey,TokenSecret)
                .when().get("https://twitter.com/home");

    }

    @When("^I run get method in Automation Framwork$")
    public void i_run_get_method_in_Automation_Framwork() {

        Response res = given().auth().oauth(ConsumerKey,ConsumerSecret,AccessKey,TokenSecret)
                .when().get("https://api.twitter.com/1.1/statuses/home_timeline.json");

    }

    @Then("^I shoud be abale to see the Twitt on Twitter Website$")
    public void i_shoud_be_abale_to_see_the_Twitt_on_Twitter_Website()  {

        Response res = given().auth().oauth(ConsumerKey,ConsumerSecret,AccessKey,TokenSecret)
                .when().get("https://api.twitter.com/1.1/statuses/home_timeline.json");

        res.then().body("text",hasItems("API Automation Test","Twitt from Postman"))
                .statusCode(200);

        res.prettyPrint();


    }

}
