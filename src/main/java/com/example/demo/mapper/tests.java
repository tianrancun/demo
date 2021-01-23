///*
//
//public class Ttest {
//
//    public static void main(String[] args) {
//
//        List<XXX> makeXXXList = makeXXXList();
//// 转map
//        Map<xxx,yyy> map = lll.stream().collect(Collectors.toMap(xxx::getxxx, xxx::getyyy));
//
//        // 按type分组
//        Map<Integer, List<XXX>> collect = makeXXXList.stream().collect(Collectors.groupingBy(XXX::getType));
//        System.out.println(collect);
//        //{0=[XXX{name='n0', type=0, price=0}, XXX{name='n5', type=0, price=5}], 1=[XXX{name='n1', type=1, price=1}, XXX{name='n4', type=1, price=4}], 2=[XXX{name='n2', type=2, price=2}, XXX{name='n3', type=2, price=3}]}
//        System.out.println("===");
//        //按type分组记算总的price
//        Map<Integer, BigDecimal> collect1 = makeXXXList.stream().collect(Collectors.groupingBy(XXX::getType,
//                Collectors.reducing(BigDecimal.ZERO, XXX::getPrice, BigDecimal::add)));
//        System.out.println(collect1);
//        // {0=5, 1=5, 2=5}
//        System.out.println("===");
//        // 按type分组求最大price的XXX
//        Map<Integer, XXX> collect2 = makeXXXList.stream().collect(Collectors.groupingBy(XXX::getType,
//                Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(XXX::getPrice)), Optional::get)));
//        System.out.println(collect2);
//
//        System.out.println("===");
//        // 按type分组求最大price
//        Map<Integer, Optional<BigDecimal>> collect3 = makeXXXList.stream().collect
//                (Collectors.groupingBy(XXX::getType, Collectors.mapping(x -> x.getPrice(), Collectors.maxBy(BigDecimal::compareTo))));
//        System.out.println(collect3);
//        // {0=Optional[5], 1=Optional[4], 2=Optional[3]}
//
//
//
//
//
//
//        List<Map<String, Integer>> mapArrayList = new ArrayList<Map<String, Integer>>();
//
//        HashMap<String, Integer> stringIntegerHashMap = new HashMap<>();
//        stringIntegerHashMap.put("A", 1);
//        mapArrayList.add(stringIntegerHashMap);
//
//        stringIntegerHashMap = new HashMap<>();
//        stringIntegerHashMap.put("A", 2);
//        mapArrayList.add(stringIntegerHashMap);
//
//        stringIntegerHashMap = new HashMap<>();
//        stringIntegerHashMap.put("B", 3);
//        mapArrayList.add(stringIntegerHashMap);
//
//        stringIntegerHashMap = new HashMap<>();
//        stringIntegerHashMap.put("B", 4);
//        mapArrayList.add(stringIntegerHashMap);
//
//        Map<String, List<Integer>> collect = mapArrayList.stream()
//                .flatMap(x -> x.entrySet().stream())
//                .collect(Collectors.groupingBy(Map.Entry::getKey, Collectors.mapping(Map.Entry::getValue, Collectors.toList())));
//        System.out.println(collect);
//
//        Map<String, Integer> collect2 = mapArrayList.stream()
//                .flatMap(x -> x.entrySet().stream()).
//                        collect(Collectors.groupingBy(Map.Entry::getKey, Collectors.reducing(0, Map.Entry::getValue, Integer::sum)));
//        System.out.println(collect2);
//
//
//
//
//
//
//
//    }
//
//    private static List<XXX> makeXXXList(){
//        List<XXX> list = new ArrayList<>();
//        list.add(new XXX("n0", 0, BigDecimal.ZERO));
//        list.add(new XXX("n1", 1, new BigDecimal(1)));
//        list.add(new XXX("n2", 2, new BigDecimal(2)));
//        list.add(new XXX("n3", 2, new BigDecimal(3)));
//        list.add(new XXX("n4", 1, new BigDecimal(4)));
//        list.add(new XXX("n5", 0, new BigDecimal(5)));
//        return list;
//    }
//
//    private static class XXX{
//
//        private String name;
//        private Integer type;
//        private BigDecimal price;
//
//        public XXX(String name, Integer type, BigDecimal price) {
//            this.name = name;
//            this.type = type;
//            this.price = price;
//        }
//
//        public String getName() {
//            return name;
//        }
//
//        public void setName(String name) {
//            this.name = name;
//        }
//
//        public Integer getType() {
//            return type;
//        }
//
//        public void setType(Integer type) {
//            this.type = type;
//        }
//
//        public BigDecimal getPrice() {
//            return price;
//        }
//
//        public void setPrice(BigDecimal price) {
//            this.price = price;
//        }
//
//        @Override
//        public String toString() {
//            return "XXX{" +
//                    "name='" + name + '\'' +
//                    ", type=" + type +
//                    ", price=" + price +
//                    '}';
//        }
//*/
