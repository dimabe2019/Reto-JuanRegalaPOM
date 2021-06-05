package test;

import driver.SeleniumWebDriver;
import net.thucydides.core.annotations.Steps;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import steps.JuanRegalaSteps;

public class TestJuanRegala {
    @Steps
    JuanRegalaSteps juanRegalaSteps = new JuanRegalaSteps();

    @Before
    public void setUp() {
        SeleniumWebDriver.ChromeWebDriver("https://juanregala.com.co/");
    }

    @Test
    public void test() throws InterruptedException {
        Thread.sleep(2000);
        juanRegalaSteps.buscarProducto("madre");
    }

    @After
    public void tearDown() {
        //SeleniumWebDriver.driver.quit();
    }
}
