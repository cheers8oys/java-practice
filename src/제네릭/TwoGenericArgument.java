package 제네릭;

class KeyValueTGA<K, V> {
    private K k;
    private V v;

    public K getK() {
        return k;
    }

    public V getV() {
        return v;
    }

    public void setK(K k) {
        this.k = k;
    }

    public void setV(V v) {
        this.v = v;
    }
}


public class TwoGenericArgument {
    public static void main(String[] args) {
        KeyValueTGA<String, Integer> keyValueTGA = new KeyValueTGA<>();
        keyValueTGA.setK("안녕하세요");
        keyValueTGA.setV(123);

        String str = keyValueTGA.getK();
        int num = keyValueTGA.getV();

        KeyValueTGA<Integer, String> keyValueTGA1 = new KeyValueTGA<>();
        keyValueTGA1.setK(123);
        keyValueTGA1.setV("안녕하세요");

        int num1 = keyValueTGA1.getK();
        String str1 = keyValueTGA1.getV();
    }
}
