package codigo.proyecto1;

public class Coche extends Vehiculo {

   int numerodepuertas;

 public Coche(String marca, String model, String anio, int numerodepuertas) {
       super(marca, model, anio);
       this.numerodepuertas = numerodepuertas;
   }

   @Override
    public void mostrardetalles() {
       super.mostrardetalles();
       System.out.println("Numero de puertas: " + numerodepuertas);
   }


}
