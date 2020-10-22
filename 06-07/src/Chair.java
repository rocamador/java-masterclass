public class Chair {

    private String type;
    private boolean isOpen = false;

    public Chair(String type) {
        this.type = type;
    }

    public void fold() {
        if (isOpen) {
            System.out.println("going to fold the chair");
            isOpen = false;
        } else {
            System.out.println("the chair is already folded");
        }
    }

    public void open() {
        if (isOpen) {
            System.out.println("the chair is already open");
        } else {
            System.out.println("going to open the chair");
            isOpen = true;
        }
    }

}
