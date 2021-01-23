import com.example.demo.mapper.ProductPrice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class BigdecimalTest {
    public static void main(String[] args) {
//        List<ProductPrice> list  = new ArrayList<ProductPrice>(){{
//            add(new ProductPrice("prd1",new BigDecimal("1"),new BigDecimal("1"),new BigDecimal("1")));
//            add(new ProductPrice("prd1",new BigDecimal("1"),new BigDecimal("1"),new BigDecimal("2")));
//            add(new ProductPrice("prd2",new BigDecimal("1"),new BigDecimal("1"),new BigDecimal("1")));
//            add(new ProductPrice("prd2",new BigDecimal("1"),new BigDecimal("1"),new BigDecimal("1")));
//            add(new ProductPrice("prd3",new BigDecimal("1"),new BigDecimal("1"),new BigDecimal("1")));
//            add(new ProductPrice("prd3",new BigDecimal("1"),new BigDecimal("1"),new BigDecimal("1")));
//            add(new ProductPrice("prd4",new BigDecimal("1"),new BigDecimal("1"),new BigDecimal("1")));
//        }};
//
//        list.stream().map(e->e.getPrice1().add(e.getPrice2()).add(e.getPrice3())).reduce(BigDecimal.ZERO,BigDecimal::add);
//        Map<String , BigDecimal> map =list.stream().collect(Collectors.groupingBy(ProductPrice::getPrdName,
//                Collectors.reducing(BigDecimal.ZERO, (x)-> x.getPrice1().add(x.getPrice2()).add(x.getPrice3()), BigDecimal::add)));
//        list.stream().map(ProductPrice::getPrdName).collect(Collectors.joining(",","{","}");
//        System.out.println(map);


            // A是父类,B是子类
            A a = new A();
            a.setName("a1");
            a.sayA(); // sayA

            B b = new B();
            b.setName("b1");
            b.setSex(true);
            b.sayA(); // sayA from B
            b.sayB(); // sayB

            // Java中的对象进行类型提升，依然保持其原有的类型。
            A a2 = (A) b; // 子类强转父类,其实仍然是子类
            System.out.println(a2.toString()); // B [name=b1, sex=true]
            // 该引用只能调用父类中定义的方法和变量；
            // a2.sayB(); // The method sayB() is undefined for the type A 报错
            // 如果子类中重写了父类中的一个方法，那么在调用这个方法的时候，将会调用子类中的这个方法；
            a2.sayA(); // sayA from B a2其实是B,调用的是B方法
            // B b2 = (B) a; // atest.A cannot be cast to atest.B a是A,转不成B
            // 只有父类对象本身就是用子类new出来的时候, 才可以在将来被强制转换为子类对象.
            B b2 = (B) a2; // a2其实是B,可以转成B
            System.out.println(b2.toString()); // B [name=b1, sex=true]
            b2.sayA(); // sayA from B
            b2.sayB(); // sayB

            List<A> aList = new ArrayList<A>();
            aList.add(a);
            aList.add(b);
            for (A item : aList) {
                System.out.println(item.getClass() + ":" + item.toString());
                // class atest.A:A [name=a1]
                // class atest.B:B [name=b1, sex=true]
            }


    }


}
