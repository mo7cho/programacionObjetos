public class Auto {
    private String modelo;
    private String marca;
    private String color;
    private int anio;
    private double km;
    private String tipo;

    public Auto(String modelo, String marca, String color, int anio, double km, String tipo) {
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.anio = anio;
        this.km = km;
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public int getAnio() {
        return anio;
    }

    public double getKm() {
        return km;
    }

    public String getTipo() {
        return tipo;
    }

    public void setModelo(String nuevoModelo) {
        this.modelo = nuevoModelo;
    }

    public void setMarca(String nuevaMarca) {
        this.marca = nuevaMarca;
    }

    public void setColor(String nuevoColor) {
        this.color = nuevoColor;
    }

    public void setAnio(int nuevoAnio) {
        this.anio = nuevoAnio;
    }

    public void setKm(double nuevoKm) {
        this.km = nuevoKm;
    }

    public void setTipo(String nuevoTipo) {
        this.tipo = nuevoTipo;
    }

    public void avanzar(double distancia) {
        this.km += distancia;
        System.out.println("Avanzando: " + distancia + " km. Km totales: " + this.km);
    }

    public void retroceder(double distancia) {
        this.km -= distancia;
        System.out.println("Retrocediendo: " + distancia + " km. Km totales: " + this.km);
    }

    public void detenerReportarEstado() {
        System.out.println(this.marca + " " + this.modelo + " detenido, su kilometraje es " + this.km);
    }
}
