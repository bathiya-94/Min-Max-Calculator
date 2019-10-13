package operations;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindMinimumOperationTest {

    @Test
    public  void returnsTrueWhenMinIsReturned(){

        Operation operation = new FindMinimumOperation();
        int answer = operation.executeOperation (Arrays.asList(1,2,3,4,5));

        assertEquals(1,answer);
    }

}
