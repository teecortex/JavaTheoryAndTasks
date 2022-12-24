import java.awt.image.BufferedImage;
import java.io.IOException;
import java.awt.image.BufferedImage;

public class Main {
    static class Person{
        private String fullName;
        private int age;
        public void talk(){
            System.out.println("Такой-то " + this.fullName + " говорит");
        }
        public Person(){
            this.fullName = "";
            this.age = 0;
        }
        public Person(String fullName, int age){
            this.fullName = fullName;
            this.age = age;
        }
        public String getfullName() { return this.fullName; }
        public int getAge() { return this.age; }
        public void setFullName(String fullName) { this.fullName = fullName; }
        public void setAge(int age) { this.age = age; }
    }
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Иван Головкин", 19);
        person2.talk();
    }
}