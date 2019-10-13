package helpers;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserInputFormatterTest {
    @Test
    public void returnsTrueIfTheOperationMaxisReturned(){

      UserInputFormatter userInputFormatter = new UserInputFormatter("Calculate max 1 2 3 4 5");
      String operation = userInputFormatter.getOperation();

      assertEquals("max",operation);
    }

    @Test
    public  void returnsTrueIftANumberListIsCorrectlyReturned(){
        UserInputFormatter userInputFormatter = new UserInputFormatter("Calculate max 1 2 3 4 5");
        List<Integer> inputNumberList = userInputFormatter.getNumbers();
        List<Integer> expectedNumberList = Arrays.asList(1,2,3,4,5);

        assertEquals(expectedNumberList,inputNumberList);

    }
}
