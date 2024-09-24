public class GridPowerAdapter implements EnergySource {
    private GridPower gridPower;

    public GridPowerAdapter(GridPower gridPower) {
        this.gridPower = gridPower;
    }

    @Override
    public double getEnergyOutput() {
        return gridPower.getGridEnergy();
    }
}
