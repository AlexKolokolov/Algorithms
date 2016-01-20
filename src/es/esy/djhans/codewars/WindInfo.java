package es.esy.djhans.codewars;

/**
 * Created by Administrator on 28.11.2015.
 */
public class WindInfo {
    public static String message(String rwy, int windDirection, int windSpeed) {
        System.out.printf("Runway - %s, wind direction - %d, wind speed - %d", rwy, windDirection, windSpeed);
        System.out.println();
        int runway = Integer.parseInt(rwy.substring(0,2)) * 10;
        int delta = runway - windDirection;
        if (delta > 180) delta -= 360;
        if (delta < -180) delta += 360;
        System.out.println(delta);
        long runwayWindSpeed = Math.abs(Math.round(windSpeed * Math.cos(delta * Math.PI / 180)));
        long crosswindSpeed = Math.abs(Math.round(windSpeed * Math.sin(delta * Math.PI / 180)));
        String runwayWind = (Math.abs(delta) <= 90 || runwayWindSpeed == 0) ? "Headwind" : "Tailwind";
        String crosswind = (delta < 0 || crosswindSpeed == 0)  ? "right" : "left";
        return String.format("%s %d knots. Crosswind %d knots from your %s.",
                runwayWind, runwayWindSpeed, crosswindSpeed, crosswind);
    }




    public static void main(String[] args) {
        System.out.println(message("18L", 170, 15));
        System.out.println(message("22", 160, 20));
    }
}
