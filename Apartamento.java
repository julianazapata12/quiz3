package dominio;

public class Apartamento extends Inmueble implements Arrendable{


    public Apartamento(String direccion, boolean arrendado, long valorVenta, long valorArriendo) {
        super(direccion, arrendado, valorVenta, valorArriendo);
    }

    @Override
    public boolean arrendar() {
        if(!this.isArrendado()){
            this.setArrendado(false);
            return true;
        }
        else return false;

    }

    @Override
    public boolean devolver() {
        if(this.isArrendado()){
            this.setArrendado(false);
            return true;
        }
        else return false;

    }

    @Override
    public String toString() {
        return "apartamento " + this.getDireccion();
    }
}