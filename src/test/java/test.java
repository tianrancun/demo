import org.junit.jupiter.api.Test;

public class test {

    public static void main(String[] args) {
        int total = 11;//数据总量
        int pageSize = 3;//一页显示条数
        int totalPages;//总页数
        totalPages = total / pageSize;
        if (total % pageSize != 0){
            totalPages ++;
        }
        System.out.println(totalPages);//此方法容易理解
        System.out.println((total-1)/pageSize+1);//此方法使用较多
        System.out.println((total+pageSize-1)/pageSize);

    }

    @Test
    void testswithc() throws Exception {
        String[] str = new String[]{"a","b","c","f","c"};

        for (String s:str){
            switch (s){
                case "a":
                    System.out.println("aaa");
                    break;
                case "b":
                    System.out.println("bbb");
                case "c":
                    System.out.println("ccc");
                default:
                    throw new Exception("x");
            }
        }
    }
}
