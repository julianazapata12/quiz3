package quiz3.app;

import dominio.*;

import java.util.Arrays;
import java.util.List;

public class app {
    public static void main(String[] args) {
        Inmueble casa1 = new Casa("cr 27A #33-40", true, 40000000, 800000);
        Inmueble casa2 = new Casa("cr 21 #22-33", true, 50000000, 1000000);
        Inmueble apartamento1 = new Apartamento("cr 27A #32-22 apar 202",true, 35000000, 300000);
        Inmueble apartamento2 = new Apartamento("cr 28 #25-30 apar 501",false, 37000000, 400000);
        Inmueble lote1 = new Lote("cr 30 #25-25",false, 120000000, 4000000);
        List<Inmueble> age =  Arrays.asList(casa1,casa2,apartamento1, apartamento2, lote1);
        Agencia casaSAS = new Agencia("casaSAS", age);


        List<Inmueble> arren = casaSAS.getArrendablesDisponibles();
        System.out.println("DISPONIBLES:");
        System.out.println("--------------------------------");
        for (Inmueble g : arren){
            System.out.println(g);
        }
        System.out.println("-------------------------");

        List<Inmueble> arrend = casaSAS.getArrendados();
        System.out.println("ARRENDADOS :");
        System.out.println("----------------------------");
        for(Inmueble h :arrend){
            System.out.println(h);
        }
    }
}
