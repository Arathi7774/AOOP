public class SolarPanelAdapter implements EnergySource {
    private SolarPanel solarPanel;

    public SolarPanelAdapter(SolarPanel solarPanel) {
        this.solarPanel = solarPanel;
    }

    @Override
    public double getEnergyOutput() {
        return solarPanel.getSolarEnergy();
    }
}
