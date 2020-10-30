import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number from 1 to 5:");
        int optionalNum=Integer.parseInt(scanner.next());
        switch (optionalNum){
            case Car.MAZZERATTI:
                MAZZERATTI mazzeratti=new MAZZERATTI();
                mazzeratti.technicalInfo();
                break;
            case Car.BMW:
                BMW bmw=new BMW();
                bmw.technicalInfo();
                break;
            case Car.BENZ:
                BENZ benz=new BENZ();
                benz.technicalInfo();
                break;
            case Car.KIA:
                KIA kia=new KIA();
                kia.technicalInfo();
                break;
            case Car.HONDA:
                HONDA honda=new HONDA();
                honda.technicalInfo();
                break;
        }
        System.out.println("Finished!");
    }
}
