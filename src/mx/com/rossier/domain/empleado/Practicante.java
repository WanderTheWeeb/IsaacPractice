package mx.com.rossier.domain.empleado;

public class Practicante extends Empleado implements ICalcularSalario{
    public Practicante(int idEmpleado, String nombreEmpleado, int edad, String puesto, String departamento, String jornadaLaboral, String responsable) {
        super(idEmpleado, nombreEmpleado, edad, puesto, departamento, jornadaLaboral, responsable);
    }

    @Override
    public String toString() {
        return super.toString();
    }
    @Override
    public double calcularSalario() {
        return 300;
    }
}
