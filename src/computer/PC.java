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

    @Override
    public void switchOn() {
        System.out.println("Sprawdzam podłączenie zasilania...");
        if(powerSupplyActive == true) {
            System.out.println("Komputer zaraz zostanie uruchomiony.");
            super.switchOn();
        }else{
            System.out.println("Podłącz komputer do zasilania w celu uruchomienia.");
        }

    }

//    @Override
    public int volumeUp(int volumeUp) {
        volume += volumeUp;
        if (volume >= 100) {
            volume = 100;
            return volume;
        } else {
            return volume;
        }
    }

//    @Override
    public int volumeDown(int volumeDown) {
        volume -= volumeDown;
        if (volume <= 0) {
            volume = 0;
            return volume;
        } else {
            return volume;
        }
    }
}
