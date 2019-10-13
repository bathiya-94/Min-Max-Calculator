package helpers;

import java.util.ArrayList;
import java.util.List;

public class UserInputFormatter {
    private String operation;
    private List<Integer> numbers = new ArrayList<>();

    public UserInputFormatter(String inputStringLine) {
        String[] inputString = inputStringLine.trim().split("\\s+");
        this.operation = inputString[1];

        for (int i=2; i<inputString.length ; i++){
           this.numbers.add(Integer.parseInt(inputString[i]));
        }

    }

    public String getOperation() {
        return operation;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}
