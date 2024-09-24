public class WindTurbineAdapter implements EnergySource {
    private WindTurbine windTurbine;

    public WindTurbineAdapter(WindTurbine windTurbine) {
        this.windTurbine = windTurbine;
    }

    @Override
    public double getEnergyOutput() {
        return windTurbine.getWindEnergy();
    }
}
