package dominio;

public class Casa extends Inmueble implements Arrendable{

 public Casa(String direccion, boolean arrendado, long valorVenta, long valorArriendo) {
  super(direccion, arrendado, valorVenta, valorArriendo);
 }

 @Override
 public boolean arrendar() {
  if(this.isArrendado()==false){
   this.setArrendado(false);
   return true;
  }
  else return false;

 }

 @Override
 public boolean devolver() {
  if(this.isArrendado()==true){
   this.setArrendado(false);
   return true;
  }
  else return false;

 }

 @Override
 public String toString() {
  return "casa " + this.getDireccion();
 }
}
