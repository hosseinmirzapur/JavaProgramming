package Q3;

public class Main {
    public static void main(String[] args)throws StringException {
        Strings strings=new Strings();
        StringException stringException=new StringException();
        strings.enterString();
        try {
            stringException.stringCheck(strings.getS());
        }catch (StringException e){
        }
}}
