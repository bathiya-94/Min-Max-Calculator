package operations;

import java.util.HashMap;
import java.util.Map;



public class OperatorFactory {
    private static Map<String, Operation> operationMap = new HashMap<>();

    private OperatorFactory(){
        throw  new IllegalStateException("Utility Class");

    }
    static {
        operationMap.put("max", new FindMaximumOperation());
        operationMap.put("min",new FindMinimumOperation());
    }

    public static Operation getOperation(String operation){
        if (operationMap.containsKey(operation.toLowerCase())){
            return (operationMap.get(operation.toLowerCase()));
        }
        else {
            throw  new UnsupportedOperationException("The Operation you entered is not Supported");
        }

    }

}
