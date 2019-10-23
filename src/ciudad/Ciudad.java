package ciudad;

import java.util.Date;

public class Ciudad {

    private int numeroDeHabitantes;
    private Date fundacion;
    private boolean electricidad;
    private int numeroDeCasas;
    private boolean parques;
    private boolean impuestos;

    public Ciudad(int numeroDeHabitantes, Date fundacion, boolean electricidad, int numeroDeCasas, boolean parques, boolean impuestos) {
        this.numeroDeHabitantes = numeroDeHabitantes;
        this.fundacion = fundacion;
        this.electricidad = electricidad;
        this.numeroDeCasas = numeroDeCasas;
        this.parques = parques;
        this.impuestos = impuestos;
    }
    

    public void pagarImpuestos() {
        impuestos = true;
    }

    public void podarPasto() {
        parques = true;
    }

    public void nivelesAltos() {
        electricidad = true;
    }

    public void natalidadEnAumento() {
        numeroDeHabitantes += 2000000;

    }

    public void casasEnConstruccion() {
        numeroDeCasas += 100000;

    }

    public void casasEnConstruccion(int nuevoNumeroDeCasas) {
        if (nuevoNumeroDeCasas <= this.numeroDeCasas) {
            System.out.println("No hay aumento de casas");
        } else {
            this.numeroDeCasas = nuevoNumeroDeCasas;
            System.out.println("El nuevo número de casas son: "
                    + String.valueOf(nuevoNumeroDeCasas) + " casas ");
        }
    }

}
