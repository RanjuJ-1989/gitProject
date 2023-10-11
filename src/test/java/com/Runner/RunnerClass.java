package com.Runner;


import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.testNG.gitProject.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "C:\\Users\\Vivek\\Desktop\\WorkSpace\\gitProject\\src\\test\\java\\com\\feature\\file.feature",
	            glue = "com.gitProject_StepDefinition",
	            monochrome = true,
	            dryRun = false,
	            strict = true,
	            tags = "@SmokeTest",
	            plugin = {"pretty",
                		"json:res/file.json",
                		"html:re/gitProject.html",
                		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
                		})

public class RunnerClass extends BaseClass{

	@BeforeClass
	public static void launch()
	{
		getDriver("Chrome");
	}
	
}
