package mx.com.rossier.domain.empleado;

public class Oficinista extends Empleado implements ICalcularSalario{

    //Atributos

    public Oficinista(int idEmpleado, String nombreEmpleado, int edad, String puesto, String departamento, String jornadaLaboral, String responsable) {
        super(idEmpleado, nombreEmpleado, edad, puesto, departamento, jornadaLaboral, responsable);
    }

    @Override
    public String toString() {
       return super.toString();
    }

    @Override
    public double calcularSalario() {
        return 5000*2;
    }
}
