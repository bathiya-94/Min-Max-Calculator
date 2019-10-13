package operations;

import java.util.List;

public class FindMinimumOperation implements Operation {
    @Override
    public Integer executeOperation(List<Integer> numbers) {
        int minValue = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) < minValue) {
                minValue = numbers.get(i);
            }
        }
        return minValue;
    }
}
