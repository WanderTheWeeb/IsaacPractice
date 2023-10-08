package mx.com.rossier.domain.empleado;


public class Empleado {
    private int idEmpleado;
    //Atributos
    private String nombreEmpleado;
    private int edad;
    private Puesto Puesto;
    private String Departamento;
    private String jornadaLaboral;
    private String responsable;

    public Empleado(int idEmpleado, String nombreEmpleado, int edad, Puesto puesto, String departamento, String jornadaLaboral, String responsable) {
        this.idEmpleado = idEmpleado;
        this.nombreEmpleado = nombreEmpleado;
        this.edad = edad;
        Puesto = puesto;
        Departamento = departamento;
        this.jornadaLaboral = jornadaLaboral;
        this.responsable = responsable;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "idEmpleado=" + idEmpleado +
                ", nombreEmpleado='" + nombreEmpleado + '\'' +
                ", edad=" + edad +
                ", Puesto='" + Puesto + '\'' +
                ", Departamento='" + Departamento + '\'' +
                ", jornadaLaboral='" + jornadaLaboral + '\'' +
                ", responsable='" + responsable + '\'' +
                '}';
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Puesto getPuesto() {
        return Puesto;
    }

    public void setPuesto(Puesto puesto) {
        Puesto = puesto;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String departamento) {
        Departamento = departamento;
    }

    public String getJornadaLaboral() {
        return jornadaLaboral;
    }

    public void setJornadaLaboral(String jornadaLaboral) {
        this.jornadaLaboral = jornadaLaboral;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }
}
