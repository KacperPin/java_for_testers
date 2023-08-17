package computer;

public class PC extends Computer {

    private boolean powerSupplyActive;

    public PC(String name, String type, int hdd, int ram, boolean powerSupplyActive) {
        super(name, type, hdd, ram);
        this.powerSupplyActive = powerSupplyActive;
    }

    public void setPowerSupplyActive(boolean newPowerSupplyActive) {
        powerSupplyActive = newPowerSupplyActive;
    };

    public void showPCName() {
        System.out.println(name);
    }

    public void switchOn() {
        System.out.println("Sprawdzam podłączenie zasilania...");
        if(powerSupplyActive == true) {
            System.out.println("Komputer zaraz zostanie uruchomiony.");
            super.switchOn();
        }else{
            System.out.println("Podłącz komputer do zasilania w celu uruchomienia.");
        }

    }
}
