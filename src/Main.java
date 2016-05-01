/**
 * Created by luca on 01-May-2016
 * 
 */
public class Main {
    
    public static void main(String[] args) {
        // TODO code application logic here
        welcomeInstruction();
        
        Eval calculator = new Eval();
        CheckInput checkInput = new CheckInput();
        String userExpression;
        
        userExpression = checkInput.convalidExpression();

        calculator.calculate(userExpression);
        
    }
    
    public static void welcomeInstruction(){
        System.out.println("\nWelcome to our Resolution Expression Math");
    }
}
