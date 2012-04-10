package com.c0deattack.cucumberspring;

import org.junit.runner.RunWith;

import cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(features = "features/", format = { "pretty", "html:target/cucumber" })
public class AppTest {

}
