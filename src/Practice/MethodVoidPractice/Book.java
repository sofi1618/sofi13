package Practice.MethodVoidPractice;

import java.util.Scanner;

class Book {
    private String title;
    private String author;

    public void setTitle(String title){

        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void displayInfo(){
        System.out.println("Title and author " + title + " " + author);

    }

}
class BookFullInfo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Book book=new Book();
        String title= sc.nextLine(),author= sc.nextLine();
        book.setTitle(title);
        book.setAuthor(author);
        book.displayInfo();
    }
}