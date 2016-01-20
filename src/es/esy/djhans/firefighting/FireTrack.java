package es.esy.djhans.firefighting;

/**
 * Created by User on 18.09.2015.
 */
public class FireTrack implements FirefightingDevice {
    @Override
    public void putOutFire() {
        System.out.println("Тушу пожар водой");
    }
}
