public class Table {

    private String type;
    private int depth;
    private int length;
    private int height;
    private boolean isOpen = false;

    public Table(String type, int depth, int length, int height) {
        this.type = type;
        this.depth = depth;
        this.length = length;
        this.height = height;
    }

    public void open() {
        if (isOpen) {
            System.out.println("table is already open");
        } else {
            System.out.println("going to open the table");
            isOpen = true;
        }
    }

    public void fold() {
        if (isOpen) {
            System.out.println("going to fold the table");
            isOpen = false;
        } else {
            System.out.println("table is already folded");
        }
    }

}
