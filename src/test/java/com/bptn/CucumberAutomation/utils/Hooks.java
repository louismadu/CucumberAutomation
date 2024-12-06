package com.bptn.CucumberAutomation.utils;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	// 1. Using Hooks for All Scenarios
	@Before
	public void beforeScenario() {
		// Code to run before every scenario
		System.out.println("Code to run before every scenario");
	}

	@After
	public void afterScenario() {
		// Code to run after every scenario
		System.out.println("Code to run after every scenario");
	}

}