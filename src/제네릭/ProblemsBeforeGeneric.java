package 제네릭;

class ApplePBG {}

class Goods1PBG {
    private ApplePBG applePBG = new ApplePBG();
    public ApplePBG getApplePBG() {
        return applePBG;
    }

    public void setApplePBG(ApplePBG applePBG) {
        this.applePBG = applePBG;
    }
}

class PencilPBG {}
class Goods2PBG {
    private PencilPBG pencilPBG = new PencilPBG();
    public PencilPBG getPencilPBG() {
        return pencilPBG;
    }
    public void setPencilPBG(PencilPBG pencilPBG) {
        this.pencilPBG = pencilPBG;
    }
}

public class ProblemsBeforeGeneric {
    public static void main(String[] args){

        Goods1PBG goods1PBG = new Goods1PBG();
        goods1PBG.setApplePBG(new ApplePBG());
        ApplePBG applePBG = goods1PBG.getApplePBG();

        Goods2PBG goods2PBG = new Goods2PBG();
        goods2PBG.setPencilPBG(new PencilPBG());
        PencilPBG pencilPBG = goods2PBG.getPencilPBG();

        System.out.println(applePBG);
        System.out.println(pencilPBG);

    }
}
