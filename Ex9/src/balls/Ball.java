package balls;

public class Ball{
    enum Color {RED, BLUE, GREEN};

    private int weight;
    private Color color;

    public Ball(int weight, Color color){
        this.weight = weight;
        this.color = color;
    }

    public int getWeigth(){ return this.weight; }
    public Color getColor(){ return this.color; }

}
