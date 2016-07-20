import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ValueTest {
    @Test
    public void eval_returns_the_value_directly() {
        Value val = new Value(5);
        assertThat(val.eval()).isEqualTo(val);
    }
}