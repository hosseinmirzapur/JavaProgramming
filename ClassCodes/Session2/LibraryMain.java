package Kare_classy;
import java.util.*;
public class LibraryMain {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Library library=new Library();
        library.welcome();
        library.redirect(scanner.nextLine());

    }
}
