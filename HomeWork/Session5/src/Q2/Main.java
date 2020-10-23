package Q2;

public class Main {
    public static void main(String[] args) {
        Operations operations=new Operations();
        Operations operations1,operations2;
        operations1=null;
        operations2=null;
        operations.webSiteOperations();
        try {
            operations1=(Operations) operations.clone();
            operations2=(Operations) operations.clone();
        }catch (CloneNotSupportedException e) {
            System.out.println("Clone not supported!");
        }
        operations1.webSiteOperations();
        operations2.webSiteOperations();
    }
}
