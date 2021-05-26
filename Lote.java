package dominio;

public class Lote extends Inmueble{
    public Lote(String direccion, boolean arrendado, long valorVenta, long valorArriendo) {
        super(direccion, arrendado, valorVenta, valorArriendo);
    }

    @Override
    public String toString() {
        return "lote"+ this.getDireccion();
    }
}
