package codigo.proyecto1;

public class Vehiculo {

    private String marca,model,anio;

    public Vehiculo(String marca, String model, String anio){

        this.marca = marca;
        this.model = model;
        this.anio = anio;
    }


    public void mostrardetalles(){
            System.out.println("Marca: " + this.marca);
            System.out.println("Model: " + this.model);
            System.out.println("Anio: " + this.anio);
    }



}
