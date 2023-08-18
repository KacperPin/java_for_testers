package computer;

public class Laptop extends Computer {

    private int batteryLevel;
    public Laptop(String name, String type, int hdd, int ram, int batteryLevel) {
        super(name, type, hdd, ram);
        this.batteryLevel = batteryLevel;
    }

    public void setBatteryLevel(int newBatteryLevel) {
        batteryLevel = newBatteryLevel;
    }

    public void showLaptopName() {
        System.out.println(name);
    }

    public void switchOn() {
        System.out.println("Sprawdzam stan naładowania baterii...");
        if (batteryLevel > 0) {
            System.out.println("Laptop został uruchomiony.");
            super.switchOn();
        } else {
            System.out.println("Poziom baterii jest zbyt niski! Nie można uruchomić laptopa.");
        }
    }

//    @Override
    public int volumeUp(int volumeUp) {
        volume += volumeUp;
        if (volume >= 100) {
            return 100;
        } else {
            return volume;
        }
    }

//    @Override
    public int volumeDown(int volumeDown) {
        volume -= volumeDown;
        if (volume <= 0) {
            return 0;
        } else {
            return volume;
        }
    }
}
