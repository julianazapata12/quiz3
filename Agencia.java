package dominio;

import java.util.ArrayList;
import java.util.List;

public class Agencia {
    private  String nombre;
    private List<Inmueble> inmuebles = new ArrayList<>();

    public Agencia(String nombre, List<Inmueble> inmuebles) {
        this.nombre = nombre;
        this.inmuebles = inmuebles;
    }

    public void agregarInmueble (Inmueble i){
        int contador1= 0;
        for (Inmueble a : inmuebles){
            if (a.getDireccion().equals(i.getDireccion())){
                contador1= contador1 +1;
            }
        }
        if (contador1==0){
            inmuebles.add(i);
        }
        else System.out.println("esta direccion ya existe");

    }


    public boolean arrendar (Arrendable inmueble){
        if (inmueble != null){
            return inmueble.arrendar();
        }
        else return false;

    }

    public boolean devolver (Arrendable inmueble){
        if (inmueble != null){
            return inmueble.devolver();
        }
        else return false;
    }

    public boolean vender (Inmueble i){
        if (!i.isArrendado()){
            this.inmuebles.remove(i);
            return true;
        }
        else return false;

    }

    public List<Inmueble> getArrendablesDisponibles (){
        List<Inmueble> aux = new ArrayList<>();
        for (Inmueble b : inmuebles){
            if (b instanceof Arrendable){
                if (!b.isArrendado()){
                    aux.add(b);
                }
            }
        }


        return aux;

    }

    public List<Inmueble> getArrendados (){
        List<Inmueble> aux2 = new ArrayList<>();
        for( Inmueble d : inmuebles){
            if( d instanceof Arrendable){
                if(d.isArrendado()){
                    aux2.add(d);
                }
            }

        }
        return aux2;
    }
}