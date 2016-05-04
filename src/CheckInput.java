import java.util.Scanner;
import javax.xml.bind.DatatypeConverter;

/**
 *Create by luca on 01-May-2016
 *
 */
public class CheckInput {
    
      private static Scanner scanner= new Scanner(System.in);

      private String userExpression;
      private boolean checkUserExpression = false;
      private int parentesisUp = 0;
      private int parentesisDown = 0;

      public String convalidExpression() {
            do {  
                  boolean testDimension, firstLetterNotSymbol, symbolsNear;
                  printAskExpression();
                  userExpression = scanner.nextLine();
                  String[] splitExpression = userExpression.split("");

                  testDimension = testDimension(userExpression);
                  firstLetterNotSymbol = testFirstLetter(userExpression.substring(0, 0));
                  symbolsNear = symbolsClose(userExpression);
            
               
                  
            if( parentesisDown == parentesisUp){
                checkUserExpression = true; 
            }else{
                printErrorParentesis();
            }

            } while (!checkUserExpression);
          return userExpression;
      }

      private void addNumberParentesis(String expres) {
            if (expres.equals("(")) {
                  parentesisUp++;
            }
            if(expres.equals(")")){
                  parentesisDown++;
            }
      }
      
      private boolean testDimension(String str) {
            if(str.length() <= 2){
                  printErrorDimension();
                  return false;
            }else{
                  return true;
            }
      }
      
      public static void printAskExpression(){
            System.out.println("\nInsert your math expression:");
      }
    
      public static void printErrorInputExpression(int errorPoint){
            System.out.println("I'm sorry but you have just inserted two operations so close.");
            System.out.println("Check positions "+(errorPoint)+ " and "+(errorPoint+1));
      }

      private void printErrorParentesis() {
            System.out.println("There is an error for your parentesis. Check if ( are as many ).");
      }

      private void printErrorDimension() {
            System.out.println("You have printed only 2 or less characters");
      }

      private boolean testFirstLetter(String userExpression) {
            if (userExpression.matches("[-+*/]")) {
                  printElementWrong();
                  return false;
            }else{
                  return true;
            }
      }

      private void printElementWrong() {
            System.out.println("You have printed inserted a symbol into a wrong position. Please, check!");
      }
      
      private boolean symbolsClose(String express){
               for(int i=0; i< express.length(); i++)
                  {
                        if(express.matches("[-+*/]") && express[i-1].matches("[-+*/]")){
                              checkUserExpression = false;
                              printErrorInputExpression(i);
                              break;
                        }
                  }
      }
      
}
