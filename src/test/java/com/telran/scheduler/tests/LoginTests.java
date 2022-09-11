package com.telran.scheduler.tests;

import org.testng.annotations.Test;

public class LoginTests extends  TestBase{

    @Test
    public void loginPositiveTest() {
        app.getUser().login("maxmiller56@gmail.com", "Max21234");
    }
}
