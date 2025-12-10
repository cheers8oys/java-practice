package 제네릭;

class A_BTGM {
    public <T extends Number> void method1(T t){
        System.out.println(t.intValue());
    }
}

interface MyInterface_BTGM {
    public abstract void print();
}

class B_BTGM {
    public <T extends MyInterface_BTGM> void method1(T t){
        t.print();
    }
}

public class BoundedTypeOfGenericMethod {
    public static void main(String[] args) {
        A_BTGM aBtgm = new A_BTGM();
        aBtgm.method1(5.6);

        B_BTGM bBtgm = new B_BTGM();
        bBtgm.method1(new MyInterface_BTGM() {
            @Override
            public void print() {
                System.out.println("print() 구현");
            }
        });
    }
}
