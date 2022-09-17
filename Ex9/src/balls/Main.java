package balls;

public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.balls.add(new Ball(20, Ball.Color.BLUE));
        basket.balls.add(new Ball(15, Ball.Color.GREEN));
        basket.balls.add(new Ball(13, Ball.Color.RED));
        basket.balls.add(new Ball(18, Ball.Color.BLUE));
        System.out.println("Вес мячей: " + basket.getBallsWeight());
        System.out.println("Количество синих мячей: " + basket.getBallsCount(Ball.Color.BLUE));
    }

}