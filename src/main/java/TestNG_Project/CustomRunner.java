package TestNG_Project;

import org.testng.TestNG;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CustomRunner {

    public static void main(String[] args) {
        TestNG testng = new TestNG();

        XmlSuite suite = new XmlSuite();
        suite.setName("CalculatorTestSuite");
        suite.setParallel(XmlSuite.ParallelMode.METHODS);
        suite.setThreadCount(2);

        XmlTest test = new XmlTest(suite);
        test.setName("CalculatorTest");
        List<XmlClass> classes = new ArrayList<>();
        classes.add(new XmlClass("TestNG_Project.CalculatorTest"));
        test.setXmlClasses(classes);

        List<XmlSuite> suites = new ArrayList<>();
        suites.add(suite);
        testng.setXmlSuites(suites);

        // Convert the XmlSuite to XML contentg
        String xmlContent = suite.toXml();

        // Save the XML content to a file
        String filePath = "testng1.xml";
        try (FileWriter fileWriter = new FileWriter(filePath)) {
            fileWriter.write(xmlContent);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Run the TestNG suite
        testng.run();
    }
}
