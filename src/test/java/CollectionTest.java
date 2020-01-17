import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CollectionTest {
    public static void main(String[] args) {
        List<Employ> list = new ArrayList<Employ>(){{
            add(new Employ("a",18,"M", BigDecimal.valueOf(1000)));
            add(new Employ("b",18,"M", BigDecimal.valueOf(2000)));
            add(new Employ("c",18,"M", BigDecimal.valueOf(3000)));
            add(new Employ("d",18,"M", BigDecimal.valueOf(4000)));
            add(new Employ("e",18,"M", BigDecimal.valueOf(5000)));
        }};

    }


}
