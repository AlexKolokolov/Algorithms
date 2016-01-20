package es.esy.djhans.firefighting;

import java.util.ArrayList;

/**
 * Created by User on 18.09.2015.
 */
public class FireFighter {
    private ArrayList<FirefightingDevice> devices;

    public FireFighter() {
        devices = new ArrayList<>();
    }

    public void addDevice(FirefightingDevice device) {
        devices.add(device);
    }

    public void putOutFire() {
        for (FirefightingDevice device : devices) {
            device.putOutFire();
        }
    }

    public static void main(String[] args) {
        FireFighter fireFighter = new FireFighter();
        fireFighter.addDevice(new SandBucket());
        fireFighter.addDevice(new Extinguisher());
        fireFighter.addDevice(new FireTrack());
        fireFighter.putOutFire();
    }
}
