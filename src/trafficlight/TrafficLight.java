package trafficlight;

public class TrafficLight {

    private Color color;

    public TrafficLight (Color color){
        this.color = color;
    }

    public void changeColor(){
        switch (color){
            case YELLOW:
                color = Color.RED;
                break;
            case RED:
                color = Color.GREEN;
                break;
            case GREEN:
                color = Color.YELLOW;
        }
    }
    public Color getColor(){
        return color;
    }
}
