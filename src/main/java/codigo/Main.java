package codigo;
import codigo.proyecto1.Coche;
import codigo.proyecto1.Moto;
import codigo.proyecto1.Vehiculo;


public class Main {
    public static void main(String[] args) {

        Vehiculo v = new Vehiculo("Honda","Miata","2018");
        v.mostrardetalles();
        Moto moto = new Moto(true,"miata", "Honda","2018");
        moto.mostrardetalles();
        Coche coche = new Coche("Honda","miata","2019",2);
        coche.mostrardetalles();





    }
}