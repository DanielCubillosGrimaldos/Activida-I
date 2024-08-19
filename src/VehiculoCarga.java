public class VehiculoCarga {
    private double capacidad;
    private int numEjes;


    public VehiculoCarga(double capacidad, int numEjes) {
        this.capacidad = capacidad;
        this.numEjes = numEjes;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public int getNumEjes() {
        return numEjes;
    }

    public void setNumEjes(int numEjes) {
        this.numEjes = numEjes;
    }
}
