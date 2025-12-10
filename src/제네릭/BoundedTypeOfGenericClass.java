package 제네릭;

class A_BTG {}
class B_BTG extends A_BTG {}
class C_BTG extends B_BTG {}

class D_BTG <T extends B_BTG> {
    private T t;
    public T getT() {
        return t;
    }
    public void setT(T t){
        this.t = t;
    }
}

public class BoundedTypeOfGenericClass {
    public static void main(String[] args) {

        // D_BTG<A_BTG> d1 = new D<>();  **불가능
        D_BTG<B_BTG> d2 = new D_BTG<>();
        D_BTG<C_BTG> d3 = new D_BTG<>();
        D_BTG d4 = new D_BTG(); // D<B_BTG> d4 = new D_BTG<>();와 같음

        d2.setT(new B_BTG());
        d2.setT(new C_BTG());

        // d3.setT(new B_BTG()); d3 객체는 객체를 생성할 때 제네릭 타입으로 C를 지정하므로 불가능
        d3.setT(new C_BTG());

        d4.setT(new B_BTG());
        d4.setT(new C_BTG());
    }
}
