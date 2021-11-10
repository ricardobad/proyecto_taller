public class Vehiculo {

    private String Marca;
    private String Placa;
    private String ProblemaVehiculo;

    public Vehiculo(String Marca, String Placa, String ProblemaVehiculo) {
        this.setMarca(Marca);
        this.setPlaca(Placa);
        this.setProblemaVehiculo(ProblemaVehiculo);
    }

    public String getProblemaVehiculo() {
        return ProblemaVehiculo;
    }

    public void setProblemaVehiculo(String problemaVehiculo) {
        this.ProblemaVehiculo = problemaVehiculo;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String placa) {
        this.Placa = placa;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        this.Marca = marca;
    }

    
}
