package co.com.saucedemo.integrations;

public class ExcepcionTitulo extends AssertionError{

    public ExcepcionTitulo(String mensaje, Throwable causa){
        super(mensaje, causa);
    }
}
