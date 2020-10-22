public class Balcony {

    private String orientation;
    private Table table;
    private Chair chair;

    public Balcony(String orientation, Table table, Chair chair) {
        this.orientation = orientation;
        this.table = table;
        this.chair = chair;
    }

    public String getOrientation() {
        return orientation;
    }

    public void foldTable() {
        table.fold();
    }

    public void foldChair() {
        chair.fold();
    }

    public void openTable() {
        table.open();
    }

    public void openChair() {
        chair.open();
    }
}
