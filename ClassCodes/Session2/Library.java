package Kare_classy;

import java.util.Scanner;

public class Library {
    private Scanner scanner=new Scanner(System.in);
    public void in(){
        System.out.println("A book was added to the library!");
    }
    public void out(){
        System.out.println("A book was taken out from the library!");
    }
    public void welcome(){
        System.out.println("Welcome to the library!\nDo you want to 'enter' or 'take' a book?");
    }
    public void bookList(){
        System.out.println("1.Stumbling on Happiness\n2.On the Genealogy of Morals\n3.AntiFragile\n4.The True Believer\n5.Civilization and Its Discontents\n6.The Singularity is Near\n7.The Denial of Death");
    }
    public void chooseBook(int n){
        System.out.println("Successfully chosen!");
        System.out.println("This book will be sent to you in less than 3 days!");
    }
    public void redirect(String ans){
        if (ans.equals("enter")){
            System.out.println("Enter the name of the book you want to enter into the library:");
            String booksName=scanner.nextLine();
            in();
        }
        if (ans.equals("take")){
            bookList();
            System.out.println("Choose the number of the book:");
            int num=Integer.parseInt(scanner.nextLine());
            chooseBook(num);
            out();
        }
    }
}
