package co.com.saucedemo.utils;

import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class Utilities {

    public static String getDriver() {
        String[] drivers = {"chrome", "edge", "firefox"};
        int i = (int) (Math.random() * drivers.length);
        return drivers [i];
    }

    public static int getRandom(List<WebElementFacade> lista){
        int i = (int) (Math.random() * lista.size());
        return  i;
    }

    public static String getValor(String valor){
        String[] parts = valor.split("\\$");
        return parts[1];
    }

}
