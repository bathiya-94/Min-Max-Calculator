package operations;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class OperatorFactoryTest {
    @Test
    public  void returnsTrueIfTheObjectCreatedIsOfTypeFindMaxClass(){
        Operation operation = OperatorFactory.getOperation("mAx");
        assertThat(operation, instanceOf(FindMaximumOperation.class));
    }

    @Test
    public  void returnsTrueIfTheObjectCreatedIsOfTypeFindMinClass(){
        Operation operation = OperatorFactory.getOperation("Min");
        assertThat(operation, instanceOf(FindMinimumOperation.class));
    }

    @Test
    public void returnsTrueIfAnUnSupportedExceptionIsThrown(){
        assertThrows(UnsupportedOperationException.class,()->OperatorFactory.getOperation("Mox"),"Unsupported");
    }
}
