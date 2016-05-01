import java.util.Scanner;

/**
 *Create by luca on 01-May-2016
 *
 */
public class CheckInput {
    
    private static Scanner scanner= new Scanner(System.in);
    
    private String userExpression;
    private boolean checkUserExpression = false;

    public String convalidExpression() {
        do {            
            printAskExpression();
            userExpression = scanner.nextLine();
            String[] splitExpression = userExpression.split("");
            if (!splitExpression[0].matches("[-+*/]")) {
                for(int i=0; i< splitExpression.length; i++){
                    if(splitExpression[i].matches("[-+*/]") && splitExpression[i+1].matches("[-+*/]")){
                        checkUserExpression = false;
                        printErrorInputExpression(i);
                        break;
                    }else{
                        checkUserExpression = true;
                    }
                }
            }
        } while (!checkUserExpression);
        return userExpression;
    }
    
    public static void printAskExpression(){
        System.out.println("\nInsert your math expression:");
    }
    
    public static void printErrorInputExpression(int errorPoint){
        System.out.println("I'm sorry but you have just inserted two operations so close.");
        System.out.println("Check positions "+(errorPoint+1)+ " and "+(errorPoint+2));
    }
}
