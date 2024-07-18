package com.nttdata.runners;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import org.apache.commons.io.FileUtils;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RunWith(Suite.class)
@SuiteClasses({RunnerTest.class})
public class CucumberReportGenerator {

    private static final String OUTPUT_PATH = "target/cucumber-report";

    @AfterClass
    public static void generateReport() {
        generateReport(OUTPUT_PATH);
    }


    public static void generateReport(String cucumberOutputPath) {
        Collection<File> jsonFiles = FileUtils.listFiles(new File(cucumberOutputPath), new String[]{"json"}, true);
        List<String> jsonPaths = new ArrayList<>(jsonFiles.size());
        jsonFiles.forEach(file -> jsonPaths.add(file.getAbsolutePath()));
        Configuration config = new Configuration(new File("build"), "Test_E2E");
        ReportBuilder reportBuilder = new ReportBuilder(jsonPaths, config);
        reportBuilder.generateReports();
    }
}
