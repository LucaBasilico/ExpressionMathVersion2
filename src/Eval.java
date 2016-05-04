
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *Create by luca on 01-May-2016
 *
 */
public class Eval {
    
      List<String> expressionList;

      public Eval() {
      }
    
      public void calculate(String expression){
            expressionList = new ArrayList<>(Arrays.asList(expression.split("(?<=\\d)(?=\\D)|(?<=\\D)(?=\\d)")));
            if(expressionList.size() == 3){
                  List<String> subList = expressionList.subList(0,3);
                  printResult(parseEval(subList));
            }else{
                  
            }
          
        
//      for (int i = 0; i < expressionList.size(); i++) {
//            if(expressionList.get(i).matches("[0-9]+")){
//                  if( (i > 0)  && (expressionList.get(i-2).matches("[0-9]+")) ){
//                        System.out.println("Eval.calculate()");
//                  }
////                      int partialResult;
////                      partialResult = Integer.parseInt(expressionList.get(i-1)) * Integer.parseInt(expressionList.get(i+1));
////                      printResult(partialResult);
//                }
//                      
//          }
      }
    
      public int parseEval(List<String> expression){
            int index = 1;
            int partialResult;
            if(expression.get(index).matches("[+]")){
                  partialResult = Integer.parseInt(expressionList.get(index-1)) + Integer.parseInt(expressionList.get(index+1));
                  return partialResult;
            }
            return 0;
      }
    
      public void printResult(int result){
            System.out.println("The result is "+result);
      }
}
