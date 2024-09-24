import java.util.ArrayList;
import java.util.List;

public class EnergyManagementSystem {
    private List<EnergySource> energySources;

    public EnergyManagementSystem() {
        energySources = new ArrayList<>();
    }

    public void addEnergySource(EnergySource energySource) {
        energySources.add(energySource);
    }

    public double getTotalEnergy() {
        double totalEnergy = 0;
        for (EnergySource source : energySources) {
            totalEnergy += source.getEnergyOutput();
        }
        return totalEnergy;
    }

    public void distributeEnergy() {
        double totalEnergy = getTotalEnergy();
        System.out.println("Distributing " + totalEnergy + " kWh of energy to the home.");
    }

    public static void main(String[] args) {
        // Create energy sources
        SolarPanel solarPanel = new SolarPanel();
        WindTurbine windTurbine = new WindTurbine();
        GridPower gridPower = new GridPower();

        // Create adapters
        EnergySource solarAdapter = new SolarPanelAdapter(solarPanel);
        EnergySource windAdapter = new WindTurbineAdapter(windTurbine);
        EnergySource gridAdapter = new GridPowerAdapter(gridPower);

        // Energy Management System
        EnergyManagementSystem ems = new EnergyManagementSystem();
        ems.addEnergySource(solarAdapter);
        ems.addEnergySource(windAdapter);
        ems.addEnergySource(gridAdapter);

        // Distribute energy
        ems.distributeEnergy();
    }
}
