package C24B6;

public class Coche implements IVehiculo{

    public static void main(String[] args) {

        Coche coche = new Coche();

        coche.acelerar(10);
        coche.frenar();
    }

    @Override
    public void acelerar(int velocidad) {
        System.out.println("El coche acelero a: "+velocidad);
    }

    @Override
    public void frenar() {
        System.out.println("El coche freno.");
    }
}
