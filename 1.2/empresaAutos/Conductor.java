public class Conductor {
    private String nombre;
    private String rut;
    private String licencia;

    public Conductor(String nombre, String rut, String licencia) {
        this.nombre = nombre;
        this.rut = rut;
        this.licencia = licencia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRut() {
        return rut;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    public void setRut(String nuevoRut) {
        this.rut = nuevoRut;
    }

    public void setLicencia(String nuevaLicencia) {
        this.licencia = nuevaLicencia;
    }

    public void mostrarCredenciales() {
        System.out.println("--- Credenciales del Conductor ---");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("RUT: " + this.rut);
        System.out.println("Licencia: " + this.licencia);
    }
}
