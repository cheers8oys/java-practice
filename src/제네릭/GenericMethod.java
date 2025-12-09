package 제네릭;


class GenericMethodsGM {

    public <T> T method1(T t){
        return t;
    }
    public <T> boolean method2(T t1, T t2) {
        return t1.equals(t2);
    }

    public <K, V> void method3(K k, V v){
        System.out.println(k + ":" +v);
    }
}

public class GenericMethod {

    public static void main(String[] args) {
        GenericMethodsGM genericMethodsGM = new GenericMethodsGM();
        String str = genericMethodsGM.method1("안녕");

        boolean check = genericMethodsGM.method2(1, 2);

        genericMethodsGM.method3("hi", 3);

        System.out.println(str);
        System.out.println(check);
    }

}
