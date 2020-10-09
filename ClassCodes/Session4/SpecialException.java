package Q1;

public class SpecialException extends Exception {
    public SpecialException(){}
    public void InfoException(String name,String family) throws SpecialException {
        if(name.equals(family)){
            throw new SpecialException();
        }
        else if(name.contains("0")||name.contains("1")||name.contains("2")||name.contains("3")||name.contains("4")||name.contains("5")||name.contains("6")||name.contains("7")||name.contains("8")||name.contains("9")){
            System.out.println("Name cannot contain a number in it!");
        }
        else if(family.contains("0")||family.contains("1")||family.contains("2")||family.contains("3")||family.contains("4")||family.contains("5")||family.contains("6")||family.contains("7")||family.contains("8")||family.contains("9")){
            System.out.println("Family cannot contain a number in it!");
        }

    }
    public void CheckName(String[] name,String[] family)throws SpecialException{
        if(name[0].equals(name[1]) && family[0].equals(family[1])){
            System.out.println("Same Info Entered!");
        }
    }
}
