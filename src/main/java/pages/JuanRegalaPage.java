package pages;

import org.openqa.selenium.By;

public class JuanRegalaPage {

    private static By imgCedeJuanRegala = By.xpath("//img[@src='https://juanregala.com.co/media/wysiwyg/banners/BANNER-CIUDADES-JR-2020-BOGOTA-A_1.jpg']");
    private static By txtBuscadorJuanRegala = By.name("q");
    private static By btnBuscadorJuanRegala = By.xpath("//button[@id='basic-search']");
    private static By imgProductoJuanRegala = By.xpath("//img[@id='product-collection-image-222']");

    public static By getImgCedeJuanRegala() {
        return imgCedeJuanRegala;
    }

    public static By getTxtBuscadorJuanRegala() {
        return txtBuscadorJuanRegala;
    }

    public static By getBtnBuscadorJuanRegala() {
        return btnBuscadorJuanRegala;
    }

    public static By getImgProductoJuanRegala() {
        return imgProductoJuanRegala;
    }
}
