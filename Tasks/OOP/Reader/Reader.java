import java.awt.image.BufferedImage;
import java.io.IOException;
import java.awt.image.BufferedImage;

public class Main {
    static class Reader{
        private String snp;
        private int number;
        private String faсulty;
        private String dateOfBirth;
        private String telephone_number;
        public void takeBook(){}
        public void returnBook(){}
        public void takeBook(int n){
            System.out.println(this.snp + " взял " + n + " книг");
        }
        public void takeBook(String[] arrayOfBooks){
            System.out.print(snp + "взял книги: ");
            for (int i = 0; i < arrayOfBooks.length; i++){
                System.out.print(arrayOfBooks[i]);
                if (i != arrayOfBooks.length - 1){
                    System.out.print(',');
                }
            }
        }
        public void takeBook(Book[] arrayOfBooks){
            System.out.print(snp + "взял книги: ");
            for (int i = 0; i < arrayOfBooks.length; i++){
                System.out.print(arrayOfBooks[i].name);
                if (i != arrayOfBooks.length - 1){
                    System.out.print(',');
                }
            }
        }
        public Reader(String snp, int number, String faculty, String dateOfBirth, String telephone_number){
            this.snp = snp;
            this.number = number;
            this.faсulty = faculty;
            this.dateOfBirth = dateOfBirth;
            this.telephone_number = telephone_number;
        }
    }
    static class Book{
        private String name;
        private String author;
        public Book(String name, String author){
            this.name = name;
            this.author = author;
        }
    }
    public static void main(String[] args) {
        Reader reader = new Reader("Телунц Э.Р.", 1, "ИКТ", "2004-06-27", "+7872827287289");
        String[] arrayOfBooks = {"Апельсин", "Стол", "Холодильник"};
        reader.takeBook(5);
    }
}