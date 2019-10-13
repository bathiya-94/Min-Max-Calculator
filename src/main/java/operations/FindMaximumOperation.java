package operations;

import java.util.List;

public class FindMaximumOperation implements  Operation{
    @Override
    public Integer executeOperation(List<Integer>numbers) {
        int maxValue = numbers.get(0);
        for (int i=1; i<numbers.size();i++){
            if(numbers.get(i) > maxValue){
                maxValue =numbers.get(i);
            }
        }
        return maxValue;
    }
}
