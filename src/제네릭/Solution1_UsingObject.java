package 제네릭;

class AppleS1U {}
class PencilS1U {}

class GoodsS1U {
    private Object object = new Object();
    public Object getObject() {
        return object;
    }
    public void setObject(Object object){
        this.object = object;
    }
}

public class Solution1_UsingObject {
    public static void main(String[] args) {
        GoodsS1U goodsS1U = new GoodsS1U();
        goodsS1U.setObject(new AppleS1U());
        AppleS1U appleS1U = (AppleS1U) goodsS1U.getObject();

        goodsS1U.setObject(new PencilS1U());
        PencilS1U pencilS1U = (PencilS1U) goodsS1U.getObject();

        // 잘못된 캐스팅(약한 타입 체크)
//        goodsS1U.setObject(new AppleS1U());
//        PencilS1U pencilS1U1 = (PencilS1U) goodsS1U.getObject();
//
//        System.out.println(pencilS1U1);
    }
}
