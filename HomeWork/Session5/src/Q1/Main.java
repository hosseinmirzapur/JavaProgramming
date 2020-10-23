package Q1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Map map=new HashMap();
        System.out.println("Enter your number:");
        map.put("Student number",Integer.parseInt(scanner.nextLine()));
        System.out.println("Enter your name:");
        map.put("Student name",scanner.nextLine());
        System.out.println("Enter your average number");
        map.put("Average number",Double.parseDouble(scanner.nextLine()));
        System.out.println("Student number:"+map.get("Student number"));
        System.out.println("Student name:"+map.get("Student name"));
        System.out.println("Average number:"+map.get("Average number"));
    }
}
