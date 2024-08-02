package codigo.proyecto1;

public class Moto extends Vehiculo {

     boolean tienesidecar;


     public Moto(boolean tienesidecar,String model,String marca, String anio) {
         super(marca, model, anio);
         this.tienesidecar = tienesidecar;

     }

     @Override
     public void mostrardetalles(){
         super.mostrardetalles();
         System.out.println("Tiensidecar: "+ tienesidecar);
     }





}
