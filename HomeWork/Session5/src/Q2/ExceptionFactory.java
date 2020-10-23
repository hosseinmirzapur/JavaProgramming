package Q2;

public class ExceptionFactory extends Exception {
    public ExceptionFactory(String t){
        super(t);
    }
    public ExceptionFactory(){}
    public void getException(Object Firstname,Object Lastname,Object Username,Object Password) throws ExceptionFactory{
        if(Firstname.toString().equals(Lastname)){
            throw new ExceptionFactory("First name cannot be the same as last name!");
        }
        if(Username.toString().equals(Password)){
            throw new ExceptionFactory("Username cannot be the same as password!");
        }
        System.out.println("Finished!");
    }
}
