$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 3,
  "name": "login page feature",
  "description": "",
  "id": "login-page-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@web"
    }
  ]
});
formatter.before({
  "duration": 3747241828,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I am on  login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSD.verifyLoginPageTitle()"
});
formatter.result({
  "duration": 5219158382,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Verify invalid login from login page",
  "description": "",
  "id": "login-page-feature;verify-invalid-login-from-login-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I enter hayriyebaskan@gmail.com into Email address field on the login page",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I enter test12345 into password field on the login page",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I click on login button login page",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I verify invalid login message on login page",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I click on sign up link on login page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "hayriyebaskan@gmail.com",
      "offset": 8
    },
    {
      "val": "Email address",
      "offset": 37
    }
  ],
  "location": "LoginSD.enterDataIntoTextField(String,String)"
});
formatter.result({
  "duration": 576028440,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test12345",
      "offset": 8
    },
    {
      "val": "password",
      "offset": 23
    }
  ],
  "location": "LoginSD.enterDataIntoTextField(String,String)"
});
formatter.result({
  "duration": 285415191,
  "status": "passed"
});
formatter.match({
  "location": "LoginSD.clickOnLoginButton()"
});
formatter.result({
  "duration": 170534915,
  "status": "passed"
});
formatter.match({
  "location": "LoginSD.verifySignInErrorMessage()"
});
formatter.result({
  "duration": 235382364,
  "status": "passed"
});
formatter.match({
  "location": "LoginSD.ClickOnSignUpLink()"
});
formatter.result({
  "duration": 1100687289,
  "status": "passed"
});
formatter.after({
  "duration": 150838360,
  "status": "passed"
});
});