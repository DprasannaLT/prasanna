Feature : Login

Scenario :Successfully Login With Valid credentials
    Give user Launch the ChromeBrowser
    When user open the URL "http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login"
    And user enter the name and password
    And user click on login it will navigate to HomePage
    