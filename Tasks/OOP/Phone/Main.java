import java.awt.image.BufferedImage;
import java.io.IOException;
import java.awt.image.BufferedImage;

public class Main {
    static class Phone{
        private int number;
        private String model;
        private int weight;
        public void recieveCall(String name){
            System.out.println("Звонит " + name);
        }
        public int getNumber(){
            return this.number;
        }
        public String getModel(){
            return this.model;
        }
        public int getWeight(){
            return this.weight;
        }
        public Phone(int number, String model){
            this.number = number;
            this.model = model;
            this.weight = 0;
        }
        public Phone(int number, String model, int weight){
            this(number, model);
            this.weight = weight;
        }
        public Phone(){
            this.number = 0;
            this.model = "";
            this.weight = 0;
        }
        public void recieveCall(String name, int number){
            System.out.println("Звонит " + name + " с номера " + number);
        }
        public void sendMessage(int[] needed_numbers){
            for (int i = 0; i < needed_numbers.length; i++){
                System.out.println(needed_numbers[i]);
            }
        }
        public void setNumber(int number){
            this.number = number;
        }
        public void setModel(String model){
            this.model = model;
        }
        public void setWeight(int weight){
            this.weight = weight;
        }

    }
    public static void main(String[] args) {
        Phone iphone = new Phone(123445, "Apple", 400);
        Phone note_9_pro = new Phone(87654, "Redmi", 300);
        Phone galaxy_s_10 = new Phone(98383, "Samsung", 500);
    }
}