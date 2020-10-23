package Q3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentList {
    Scanner scanner=new Scanner(System.in);
    Information information=new Information();
    List <String> studentName=new ArrayList<>();
    List <String> studentNumber=new ArrayList<>();
    List <String> studentFatherName=new ArrayList<>();
    int i;
    public void entry(){
        for(i=0;i<2;i++){
            System.out.println("Enter the student's name:");
            information.setStudentName(scanner.nextLine());
            studentName.add(information.getStudentName());
            System.out.println("Enter the student's number:");
            information.setStudentNum(scanner.nextLine());
            studentNumber.add(information.getStudentNum());
            System.out.println("Enter the student's father's name:");
            information.setStudentFatherName(scanner.nextLine());
            studentFatherName.add(information.getStudentFatherName());
        }
        for (i=0;i<2;i++){
            System.out.println("Student Name:"+studentName.get(i));
            System.out.println("Student Number:"+studentNumber.get(i));
            System.out.println("Father Name:"+studentFatherName.get(i));
            System.out.println("---------------------");
        }
    }

}
