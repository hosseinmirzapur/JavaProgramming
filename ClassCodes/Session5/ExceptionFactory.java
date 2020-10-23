public class ExceptionFactory extends Exception {
    public ExceptionFactory(String msg) {
        super(msg);
    }
    public ExceptionFactory(){}
    public void getException(Object name, Object family, Object age, Object username, Object password) throws ExceptionFactory{
        if(name.toString().contains("0")||name.toString().contains("1")||name.toString().contains("2")||name.toString().contains("3")||name.toString().contains("4")||name.toString().contains("5")||name.toString().contains("6")||name.toString().contains("7")||name.toString().contains("8")||name.toString().contains("9")){
            throw new ExceptionFactory("A name cannot contain a number in it!");
        }
        if(family.toString().contains("0")||family.toString().contains("1")||family.toString().contains("2")||family.toString().contains("3")||family.toString().contains("4")||family.toString().contains("5")||family.toString().contains("6")||family.toString().contains("7")||family.toString().contains("8")||family.toString().contains("9")){
            throw new ExceptionFactory("A family name cannot contain a number in it!");
        }
        if (Integer.parseInt(age.toString())>120||Integer.parseInt(age.toString())<0){
            throw new ExceptionFactory("An invalid age is Entered!");
        }
        if (username.toString().length()<8){
            throw new ExceptionFactory("Username cannot contain less than 8 characters!");
        }
        if(password.toString().length()<8){
            throw new ExceptionFactory("Password cannot contain less than 8 characters!");
        }
    }

}
