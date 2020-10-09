package Q1;

public class Main {
    public static void main(String[] args)throws Exceptions {
        Exceptions exceptions=new Exceptions();
        StudentInfo studentInfo=new StudentInfo();
        studentInfo.start();
        studentInfo.Entry();
        try {
            exceptions.checkName(studentInfo.getStudentName());
        }catch(Exceptions e){}
        try {
            exceptions.usernamePasswordCheck(studentInfo.getUsername(),studentInfo.getPassword());
        }catch (Exceptions e){}
        finally {
            System.out.println("Program Ended Successfully!");
        }
    }

}
