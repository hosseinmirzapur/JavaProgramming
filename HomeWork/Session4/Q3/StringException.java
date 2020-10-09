package Q3;

public class StringException extends Exception {
    Strings strings=new Strings(0);
    public StringException(String msg){
        super(msg);
    }
    public StringException() {
    }
    public void stringCheck(String s)throws StringException{
        if(strings.numCheck(s)==1){
            System.out.println("There is a number in the string you entered!");
        }
        else
            System.out.println("The string's length equals:"+s.length());
    }
}
