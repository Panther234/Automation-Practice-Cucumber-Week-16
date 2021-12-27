$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/resources/featurefile/OurStoreTest.feature");
formatter.feature({
  "line": 1,
  "name": "Our store map functionality",
  "description": "",
  "id": "our-store-map-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 11422120700,
  "status": "passed"
});
formatter.background({
  "line": 2,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 3,
  "name": "I am on Homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "CreateAccountTestSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 110543900,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "As a user I can verify that user can browse our store on Map",
  "description": "",
  "id": "our-store-map-functionality;as-a-user-i-can-verify-that-user-can-browse-our-store-on-map",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I click on Our Stores link",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I can click on Map",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I can see stores from West Palm Beach",
  "keyword": "Then "
});
formatter.match({
  "location": "OurStoreTestSteps.iClickOnOurStoresLink()"
});
formatter.result({
  "duration": 6120794400,
  "status": "passed"
});
formatter.match({
  "location": "OurStoreTestSteps.iCanClickOnMap()"
});
formatter.result({
  "duration": 161088300,
  "status": "passed"
});
formatter.match({
  "location": "OurStoreTestSteps.iCanSeeStoresFromWestPalmBeach()"
});
formatter.result({
  "duration": 972166400,
  "status": "passed"
});
formatter.after({
  "duration": 1068964200,
  "status": "passed"
});
});