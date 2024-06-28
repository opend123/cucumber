$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/register.feature");
formatter.feature({
  "name": "TO validate the account creation of fb registeration",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To crate new account",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "To open the browser and maximize the window",
  "keyword": "Given "
});
formatter.match({
  "location": "fbregister.to_open_the_browser_and_maximize_the_window()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To launch the url of fb",
  "keyword": "When "
});
formatter.match({
  "location": "fbregister.to_launch_the_url_of_fb()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "TO click the create new account button",
  "keyword": "And "
});
formatter.match({
  "location": "fbregister.to_click_the_create_new_account_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass firstname in firstname text box",
  "rows": [
    {
      "cells": [
        "diviya",
        "java",
        "class",
        "ion",
        "base"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "fbregister.to_pass_firstname_in_firstname_text_box(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass secondname in secondname text box",
  "keyword": "And "
});
formatter.match({
  "location": "fbregister.to_pass_secondname_in_secondname_text_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass mobile or email in email text box",
  "rows": [
    {
      "cells": [
        "praveenkk45@gmail.com",
        "56778990",
        "inmakes@gmail.vom",
        "3456789"
      ]
    },
    {
      "cells": [
        "reava@gmail.com",
        "678890",
        "qweras@gamil.com",
        "456678896"
      ]
    },
    {
      "cells": [
        "automation@gamil.com",
        "5678934",
        "wertgvg@gmail,com",
        "3456789"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "fbregister.to_pass_mobile_or_email_in_email_text_box(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To craete new password in password fiels",
  "keyword": "And "
});
formatter.match({
  "location": "fbregister.to_craete_new_password_in_password_fiels()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "fbregister.to_close_the_browser()"
});
formatter.result({
  "status": "passed"
});
});