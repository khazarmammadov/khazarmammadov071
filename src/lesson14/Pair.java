package lesson14;

public interface Pair<K,V> {
    K getKey();
    V getValue();

}

class IMain {
    public static void main(String[] args) {
        Pair<String,Integer> pair = new Pair<String, Integer>() {
            @Override
            public String getKey() {
                return "A";
            }

            @Override
            public Integer getValue() {
                return 5;
            }
        };

        String str = pair.getKey();
        Integer intg = pair.getValue();

        System.out.println(str);
        System.out.println(intg);

    }
}
