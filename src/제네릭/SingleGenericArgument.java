package 제네릭;



class MyClassSGA<T> {
    private T t;
    public  T getT() {
        return t;
    }
    public void setT(T t) {
        this.t = t;
    }
}

public class SingleGenericArgument {
    public static void main(String[] args) {
        MyClassSGA<String> myClassSGA = new MyClassSGA<>();
        myClassSGA.setT("안녕하세요");
        String str = myClassSGA.getT();
        System.out.println(str);

        MyClassSGA<Integer> myClassSGA1 = new MyClassSGA<>();
        myClassSGA1.setT(1);
        int num = myClassSGA1.getT();
        System.out.println(num);
    }
}
