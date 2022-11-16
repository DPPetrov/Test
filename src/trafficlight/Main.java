package trafficlight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] collors = sc.nextLine().split("\\s+");
        int itterate = Integer.parseInt(sc.nextLine());
        List<TrafficLight> trafficLights = new ArrayList<>();

        for (String signal : collors) {
            Color color = Color.valueOf(signal);
            TrafficLight trafficLight = new TrafficLight(color);
            trafficLights.add(trafficLight);

        }

        for (int i = 0; i < itterate; i++) {

            for (TrafficLight trafficLight : trafficLights) {
                trafficLight.changeColor();
                System.out.print(trafficLight.getColor() + " ");
            }

            System.out.println();

        }

    }
}
