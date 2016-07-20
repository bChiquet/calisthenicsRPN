import javax.xml.transform.Result;

public class Value implements Operand {

    private final Integer value;

    Value(Integer value)
    {
        this.value = value;
    }

    public Value eval() {
        return this;
    }
}
