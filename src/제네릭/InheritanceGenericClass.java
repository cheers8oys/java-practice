package 제네릭;


class ParaentIGC<T> {
    T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}

class ChildIGC<T> extends ParaentIGC<T> {

}

class ChildIGC2<T, V> extends ParaentIGC<T> {
    V v;

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }
}

public class InheritanceGenericClass {
    public static void main(String[] args) {

        ParaentIGC<String> p = new ParaentIGC<>();
        p.setT("부모 제네릭 클래스");
        System.out.println(p.getT());

        ChildIGC<String> c1 = new ChildIGC<>();
        c1.setT("자식 1 제네릭 클래스");
        System.out.println(c1.getT());

        ChildIGC2<String, Integer> c2 = new ChildIGC2<>();
        c2.setT("자식 2 제네릭 클래스");
        c2.setV(2);
        System.out.println(c2.getT());
        System.out.println(c2.getV());
    }
}
