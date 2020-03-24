import com.example.demo.mapper.Order;
import com.example.demo.mapper.OrderMapper;
import com.example.demo.mapper.OrderQueryParam;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

public class TestMapper {
    @Test
    void entity2queryParam() {
        Order order = new Order();
        order.setId(12345L);
        order.setOrderSn("orderSn");
        order.setOrderType(0);
        order.setReceiverKeyword("keyword");
        order.setSourceType(1);
        order.setStatus(2);
        OrderMapper mapper = Mappers.getMapper(OrderMapper.class);
        OrderQueryParam orderQueryParam = mapper.entity2queryParam(order);
//        Assert.assertEquals(orderQueryParam.getOrderSn(), order.getOrderSn());
//        Assert.assertEquals(orderQueryParam.getOrderType(), order.getOrderType());
//        Assert.assertEquals(orderQueryParam.getReceiverKeyword(), order.getReceiverKeyword());
//        Assert.assertEquals(orderQueryParam.getSourceType(), order.getSourceType());
//        Assert.assertEquals(orderQueryParam.getStatus(), order.getStatus());
    }

    @Test
    void s() {
        System.out.println("te");
    }
}
