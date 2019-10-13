package operations;

import operations.FindMaximumOperation;
import operations.Operation;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindMaximumOperationTest {
    @Test
    public void  returnsTrueWhenMaxIsReturned(){
        Operation operation = new FindMaximumOperation();
        int answer = operation.executeOperation( Arrays.asList(1,2,3,4,5));
        assertEquals(5,answer);
    }

}
