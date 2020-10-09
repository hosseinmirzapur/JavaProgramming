package Q1;

public class Exceptions extends Exception{

    public Exceptions(){}
    public Exceptions(String msg){
        super(msg);
    }
    public void checkName(String studentName)throws Exceptions{
        if(studentName.contains("0")||studentName.contains("1")||studentName.contains("2")||studentName.contains("3")||studentName.contains("4")||studentName.contains("5")||studentName.contains("6")||studentName.contains("7")||studentName.contains("8")||studentName.contains("9")){
            System.out.println("Student's name cannot contain a number in it!");
            throw new Exceptions("StudentNameException");
        }
        else if(studentName.contains("/")||studentName.contains("?")||studentName.contains("!")||studentName.contains("@")||studentName.contains("#")||studentName.contains("$")||studentName.contains("%")||studentName.contains("^")||studentName.contains("&")||studentName.contains("*")||studentName.contains("(")||studentName.contains(")")||studentName.contains("+")){
            System.out.println("Student's name cannot contain a character in it!");
            throw new Exceptions("StudentNameException");
        }
        else{
            System.out.println("Name's Entered successfully!");
            throw new Exceptions("StudentNameException");
        }
    }
    public void usernamePasswordCheck(String Username,String password)throws Exceptions{
        if (Username.equals(password)){
            System.out.println("Password or Username is Incorrect!");
            throw new Exceptions("UsernamePasswordException");
        }
        if(password.length()<8){
            System.out.println("Password length's too short!");
            throw new Exceptions("UsernamePasswordException");
        }
        if(Username.contains(" ")){
            System.out.println("Username cannot contain space character!");
            throw new Exceptions("UsernamePasswordException");
        }

    }

}
