import java.awt.image.BufferedImage;
import java.io.IOException;
import java.awt.image.BufferedImage;

public class Main {
    static class Student{
        protected String firstName;
        protected String lastName;
        protected String group;
        protected double averageMark;
        public Student(String firstName, String lastName, String group, double averageMark){
            this.firstName = firstName;
            this.lastName = lastName;
            this.group = group;
            this.averageMark = averageMark;
        }
        public int getScholarship(){
            if (Math.round(this.averageMark) == 5){
                return 100;
            }
            else{
                return 80;
            }
        }
        public Student(){
            this.firstName = "";
            this.lastName = "";
            this.group = "";
            this.averageMark = 0;
        }

        public String getFirstName() {return firstName;}

        public String getLastName() {return lastName;}

        public String getGroup() {return group;}

        public double getAverageMark() {return averageMark;}

        public void setLastName(String lastName) {this.lastName = lastName;}

        public void setFirstName(String firstName) {this.firstName = firstName;}

        public void setAverageMark(double averageMark) {this.averageMark = averageMark;}

        public void setGroup(String group) {this.group = group;}
    }
    static class Aspirant extends Student{
        private String scientificWork;

        public Aspirant(){
            super("", "", "", 0);
            this.scientificWork = "";
        }
        public Aspirant(String firstName, String lastName, String group, double averageMark){
            super(firstName, lastName, group, averageMark);
            scientificWork = "";
        }
        public Aspirant(String firstName, String lastName, String group, double averageMark, String scientificWork){
            super(firstName, lastName, group, averageMark);
            this.scientificWork = scientificWork;
        }
        @Override
        public int getScholarship(){
            if (Math.round(this.averageMark) == 5){
                return 200;
            }
            else{
                return 180;
            }
        }

        public String getScientificWork() {return scientificWork;}

        public void setScientificWork(String scientificWork) {this.scientificWork = scientificWork;}
    }
    public static void main(String[] args) {
        Student student = new Aspirant("Иван", "Сидоров", "K3121", 5);
        Student[] arrayOfStudents = new Student[5];
        Aspirant aspirant = new Aspirant();
        System.out.print(aspirant.getScholarship());
    }
}