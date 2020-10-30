import java.util.Scanner;

public class Input {
    private String userInput;
    private Scanner scanner=new Scanner(System.in);
    public Input setUserInput(String userInput){
        this.userInput=userInput;
        return this;
    }
    private String getUserInput() {
        return userInput;
    }
    public void inputStart(){
        System.out.println("Enter your Operation:(Sum or Fraction)");
        Input input=new Input().setUserInput(scanner.nextLine());
        if (input.getUserInput().contains("-")){
            CalcMinus calcMinus=new CalcMinus();
            calcMinus.calc(input.getUserInput().charAt(0)-'0',input.getUserInput().charAt(2)-'0');
        }
        else if (input.getUserInput().contains("+")){
            CalcPlus calcPlus=new CalcPlus();
            calcPlus.calc(input.getUserInput().charAt(0)-'0',input.getUserInput().charAt(2)-'0');
        }
    }
}
