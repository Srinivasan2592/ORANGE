$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Negativelogin.feature");
formatter.feature({
  "name": "Negative case",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "navigate to url and checking the login page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user launching browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefination.user_launching_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "navigate to url",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefination.navigate_to_url()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Enter username and Password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "name": "user enter the username \"\u003cUsername\u003e\" and password \"\u003cPassword\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "click login button",
  "keyword": "And "
});
formatter.step({
  "name": "verified user login",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ]
    },
    {
      "cells": [
        "Rbnbalan092",
        "90439273922"
      ]
    },
    {
      "cells": [
        "Rbnbalan0922",
        "9043927392"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Enter username and Password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag2"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user enter the username \"Rbnbalan092\" and password \"90439273922\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefination.user_enter_the_username_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click login button",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefination.click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verified user login",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefination.verified_user_login()"
});
formatter.result({
  "error_message": "org.junit.AssumptionViolatedException: Negative crediential is pass\r\n\tat org.junit.Assume.assumeTrue(Assume.java:59)\r\n\tat Stepdefination.Stepdefination.verified_user_login(Stepdefination.java:69)\r\n\tat ✽.verified user login(src/test/resources/Negativelogin.feature:14)\r\n",
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Enter username and Password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag2"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user enter the username \"Rbnbalan0922\" and password \"9043927392\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefination.user_enter_the_username_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click login button",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefination.click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verified user login",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefination.verified_user_login()"
});
formatter.result({
  "error_message": "org.junit.AssumptionViolatedException: Negative crediential is pass\r\n\tat org.junit.Assume.assumeTrue(Assume.java:59)\r\n\tat Stepdefination.Stepdefination.verified_user_login(Stepdefination.java:69)\r\n\tat ✽.verified user login(src/test/resources/Negativelogin.feature:14)\r\n",
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.uri("src/test/resources/login.feature");
formatter.feature({
  "name": "Positive case",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Enter username and Password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag3"
    }
  ]
});
formatter.step({
  "name": "user enter the username \"\u003cUsername\u003e\" and password \"\u003cPassword\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "click login button",
  "keyword": "And "
});
formatter.step({
  "name": "verified user login",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ]
    },
    {
      "cells": [
        "Rbnbalan092",
        "9043927392"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Enter username and Password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@tag3"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user enter the username \"Rbnbalan092\" and password \"9043927392\"",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdefination.user_enter_the_username_and_password(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click login button",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdefination.click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verified user login",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefination.verified_user_login()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});