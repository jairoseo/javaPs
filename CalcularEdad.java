package C24B6;

import java.time.LocalDate;
import java.time.Period;

public class CalcularEdad {

    public static void main(String[] args) {

        LocalDate miEdad = LocalDate.of(1988, 1, 20);
        LocalDate fechaHoy = LocalDate.now();

        Period edad = Period.between(miEdad,fechaHoy);

        System.out.println("Tienes: "+edad.getYears()+" años "+edad.getMonths()+" meses "+edad.getDays()+" dias.");

    }

}
