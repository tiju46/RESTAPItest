$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Pikky\u0027s PC/IdeaProjects/RestAPItest/src/main/java/feature/firstAPI.feature");
formatter.feature({
  "line": 1,
  "name": "MotoGP Drivers",
  "description": "",
  "id": "motogp-drivers",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Check MotoGP Drivers Details",
  "description": "",
  "id": "motogp-drivers;check-motogp-drivers-details",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "I set get drivers information service api endpoint",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I send  get http request",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "I validate  header type",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "i receive drivers information and status code as 200",
  "keyword": "Then "
});
formatter.match({
  "location": "motogpStepDef.i_set_get_drivers_information_service_api_endpoint()"
});
formatter.result({
  "duration": 5641855700,
  "status": "passed"
});
formatter.match({
  "location": "motogpStepDef.send_get_http_request()"
});
formatter.result({
  "duration": 14105327100,
  "status": "passed"
});
formatter.match({
  "location": "motogpStepDef.i_set_request_header()"
});
formatter.result({
  "duration": 4005600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "200",
      "offset": 49
    }
  ],
  "location": "motogpStepDef.i_receive_drivers_information_and_status_code_as(int)"
});
formatter.result({
  "duration": 82631500,
  "status": "passed"
});
});