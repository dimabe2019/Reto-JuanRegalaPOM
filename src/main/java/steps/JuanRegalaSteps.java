package steps;

import driver.SeleniumWebDriver;
import org.openqa.selenium.By;
import pages.JuanRegalaPage;

public class JuanRegalaSteps {

    public void clicElemento(By elemento) {
        SeleniumWebDriver.driver.findElement(elemento).click();
    }

    public void escribirEnTexto(By elemento, String texto){
        SeleniumWebDriver.driver.findElement(elemento).sendKeys(texto);
    }

    public void clicElemento2(By elemento){
        SeleniumWebDriver.driver.findElement(elemento).click();
    }

    public void seleccionProducto(By elemento){
        SeleniumWebDriver.driver.findElement(elemento).click();
    }

    public void buscarProducto(String palabra) {
        clicElemento(JuanRegalaPage.getImgCedeJuanRegala());
        escribirEnTexto(JuanRegalaPage.getTxtBuscadorJuanRegala(), palabra);
        clicElemento2(JuanRegalaPage.getBtnBuscadorJuanRegala());
        seleccionProducto(JuanRegalaPage.getImgProductoJuanRegala());


    }
}
