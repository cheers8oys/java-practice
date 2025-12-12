package 클래스;

class ATM {
    int m1, m2, m3, m4;
    ATM () {
        m1 = 1;
        m2 = 2;
        m3 = 3;
        m4 = 4;
    }

    ATM (int a) {
        m1 = a;
        m2 = 2;
        m3 = 3;
        m4 = 4;
    }

    ATM (int a, int b) {
        m1 = a;
        m2 = b;
        m3 = 3;
        m4 = 4;
    }

    void print() {
        System.out.print(m1);
        System.out.print(m2);
        System.out.print(m3);
        System.out.print(m4);
        System.out.println(" ");
    }
}

class BTM {
    int m1, m2, m3, m4;
    BTM() {
        m1 = 1;
        m2 = 2;
        m3 = 3;
        m4 = 4;
    }
    BTM(int a) {
        this();
        m1 = a;
    }
    BTM(int a, int b) {
        this(a);
        m2 = b;
    }
    void print() {
        System.out.print(m1);
        System.out.print(m2);
        System.out.print(m3);
        System.out.print(m4);
        System.out.println(" ");
    }
}


public class ThisMethod {

    public static void main(String[] args) {

        ATM atm = new ATM();
        ATM atm1 = new ATM(1);
        ATM atm2 = new ATM(3,4);

        atm.print();
        atm1.print();
        atm2.print();

        BTM btm = new BTM();
        BTM btm1 = new BTM(1);
        BTM btm2 = new BTM(3, 4);

        btm.print();
        btm1.print();
        btm2.print();
    }

}
