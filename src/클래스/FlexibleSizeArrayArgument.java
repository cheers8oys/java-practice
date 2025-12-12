package 클래스;

public class FlexibleSizeArrayArgument {
    public static void main(String[] args) {
        method1(1, 2);
        method1(1,2,3);
        method1();

        method2("안녕");
        method2("안녕", "잘가");
        method2();
    }
    public static void method1(int...values){
        System.out.println("배열의 길이: " +values.length);
    }
    public static void method2(String...values){
        System.out.println("배열의 길이: "+values.length);
    }
}

