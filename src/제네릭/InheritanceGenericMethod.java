package 제네릭;

class ParentIGM {
    <T extends Number> void print(T t){
        System.out.println(t);
    }
}

class ChildIGM extends ParentIGM {

}

public class InheritanceGenericMethod {
    public static void main(String[] args) {

        ParentIGM parentIGM = new ParentIGM();
        parentIGM.print(10);

        ChildIGM childIGM = new ChildIGM();
        childIGM.print(4.5);
    }
}
