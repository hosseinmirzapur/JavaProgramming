import java.util.Scanner;

public class University {
    public University(){
        System.out.println("Enter the entries requested!");
    }
    Scanner scanner=new Scanner(System.in);
    String code;
    String name;
    String year;
    String average;
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }
    public String getAverage() {
        return average;
    }
    public void setAverage(String average) {
        this.average = average;
    }
    public void entry(){
        System.out.println("Enter student's code:");
        setCode(scanner.nextLine());
        System.out.println("Enter student's name:");
        setName(scanner.nextLine());
        System.out.println("Enter entry year:");
        setYear(scanner.nextLine());
        System.out.println("Enter the student's average score:");
        setAverage(scanner.nextLine());
    }
}
