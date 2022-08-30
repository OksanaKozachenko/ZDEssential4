package task2;

public class Main {
    public static void pp(AbstractHandler file){
        file.open();
        file.change();
        file.create();
        file.save();
    }
    public static void main(String[] args) {
        XMLHandler xMLHandler= new XMLHandler();
        DOCHandler dOCHandler = new DOCHandler();
        TXTHandler tXTHandler= new TXTHandler();
        pp(xMLHandler);
        pp(dOCHandler);
        pp(tXTHandler);

    }
}
