package 제네릭;


class A_BTOIA {}
class B_BTOIA extends A_BTOIA {}
class C_BTOIA extends B_BTOIA {}
class D_BTOIA extends C_BTOIA {}

class Goods_BTOIA<T> {
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}

class Test_BTOIA {
    void method1(Goods_BTOIA<A_BTOIA> g) {}
    void method2(Goods_BTOIA<?> g) {}
    void method3(Goods_BTOIA<? extends B_BTOIA> g) {}
    void method4(Goods_BTOIA<? super B_BTOIA> g) {}
}

public class BoundedTypeOfInputArguments {
    public static void main(String[] args) {
        Test_BTOIA t = new Test_BTOIA();

        t.method1(new Goods_BTOIA<>());
        // t.method1(new Goods_BTOIA<B_BTOIA>());
        // t.method1(new Goods_BTOIA<C_BTOIA>());
        // t.method1(new Goods_BTOIA<D_BTOIA>());

        t.method2(new Goods_BTOIA<A_BTOIA>());
        t.method2(new Goods_BTOIA<B_BTOIA>());
        t.method2(new Goods_BTOIA<C_BTOIA>());
        t.method2(new Goods_BTOIA<D_BTOIA>());

        //t.method3(new Goods_BTOIA<A_BTOIA>());
        t.method3(new Goods_BTOIA<B_BTOIA>());
        t.method3(new Goods_BTOIA<C_BTOIA>());
        t.method3(new Goods_BTOIA<D_BTOIA>());

        t.method4(new Goods_BTOIA<B_BTOIA>());
        t.method4(new Goods_BTOIA<A_BTOIA>());
        //t.method4(new Goods_BTOIA<C_BTOIA>());
        //t.method4(new Goods_BTOIA<D_BTOIA>());
    }
}
