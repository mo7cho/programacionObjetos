public class VehiculoCarga {
    private String patente;
    private double capacidadMaxima;
    private double cargaActual;
    private double km;

    public VehiculoCarga(String patente, double capacidadMaxima, double km) {
        this.patente = patente;
        this.capacidadMaxima = capacidadMaxima;
        this.cargaActual = 0.0;
        this.km = km;
    }

    public String getPatente() {
        return patente;
    }

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public double getCargaActual() {
        return cargaActual;
    }

    public double getKm() {
        return km;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public void setCapacidadMaxima(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public void setCargaActual(double cargaActual) {
        this.cargaActual = cargaActual;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public void cargar(double peso) {
        if (this.cargaActual + peso <= this.capacidadMaxima) {
            this.cargaActual += peso;
            System.out.println("Se cargaron " + peso + " kg. Carga actual: " + this.cargaActual + " kg.");
        } else {
            System.out.println("Error: Capacidad máxima excedida. No se puede cargar " + peso + " kg.");
        }
    }

    public void descargar(double peso) {
        if (peso <= this.cargaActual) {
            this.cargaActual -= peso;
            System.out.println("Se descargaron " + peso + " kg. Carga actual: " + this.cargaActual + " kg.");
        } else {
            System.out.println("Error: No se puede descargar más de la carga actual.");
        }
    }

    public void avanzar(double distancia) {
        this.km += distancia;
        System.out.println(
                "El vehículo patente " + this.patente + " avanzó " + distancia + " km. Kilometraje total: " + this.km);
    }
}
