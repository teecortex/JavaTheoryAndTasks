import java.io.IOException;

public class Main {
    public interface Priceable{
        public int getPrice();
    }
    public static class Apple implements Priceable{
        private int weight;
        private String color;
        private int price;
        public Apple(int weight, String color, int price){
            this.weight = weight;
            this.color = color;
            this.price = price;
        }
        @Override
        public int getPrice(){
            return this.price;
        }
    }

    public static void main(String[] args) {
        Apple apple = new Apple(25, "green", 125);
        System.out.println(apple.getPrice());
    }
}