package Q1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws SpecialException {
        SpecialException specialException=new SpecialException();
        Scanner scanner=new Scanner(System.in);
        PersonalInfo personalInfo=new PersonalInfo();
        String[] name=new String[2];
        String[] family=new String[2];
        int[] age=new int[2];
        int i=0;
        for (i=0;i<2;i++){
            System.out.println("Enter a Name:");
            name[i]=scanner.nextLine();
            personalInfo.setName(name[i]);
            System.out.println("Enter a Family:");
            family[i]=scanner.nextLine();
            personalInfo.setFamily(family[i]);
            System.out.println("Enter a Age:");
            age[i]=Integer.parseInt(scanner.nextLine());
        }
        try {
            specialException.CheckName(name,family);
        }catch (SpecialException e){
            System.out.println("System Failure!");
        }
        try {
            specialException.InfoException(name[0],family[0]);
        }catch (SpecialException e){
            System.out.println(e.getClass());
        }finally {
            System.out.println("Run The Program Again!");
        }
    }
}
