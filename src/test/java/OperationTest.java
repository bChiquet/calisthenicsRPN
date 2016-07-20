import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.mockito.BDDMockito.willReturn;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.verify;

public class OperationTest {
    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @Mock
    private Operands vals;
    @Mock
    private Operator op;

    @InjectMocks
    Operation operation;
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testName() {
        Value firstOperand = new Value(34);
        willReturn(firstOperand).given(vals).getFirstOperand();
        Value secondOperand = new Value(12);
        willReturn(secondOperand).given(vals).getSecondOperand();

        operation.eval();

        verify(op).apply(eq(firstOperand), eq(secondOperand));
    }
}