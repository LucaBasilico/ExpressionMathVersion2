
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
        expressionList = new ArrayList<String>(Arrays.asList(expression.split("(?<=\\d)(?=\\D)|(?<=\\D)(?=\\d)")));
        double partialResult;
        int index = 0;
        
        
//        Object arr[]=expressionList.toArray();  
        
//        for (Object expressionListed : arr) {
//                if(expressionListed.matches("[*]")){
//                    System.out.println("Entra per fare il calcolo * e /");
//                    index = expressionList.indexOf("*");
//                    System.out.println(index);
//                    operationMoltiplication(expressionListed[index-1], expressionListed[index+1]);
//                    
//                    
//                }
//                if(expressionListed.matches("[/]")){
//                    System.out.println("Entra per fare il calcolo * e /");
//                    index = expressionList.indexOf("/");
//                    System.out.println(index);
//                }
//
//        }
        
    }
    
}
