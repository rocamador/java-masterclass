public class Printer {

    private int tonerLevel;
    private int nrPagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex) {
        this.tonerLevel = tonerLevel>=0 && tonerLevel<=100 ? tonerLevel : 0;
        this.isDuplex = isDuplex;
    }

    public void fillToner(int level) {
        this.tonerLevel = level;
    }

    public void print() {
        this.nrPagesPrinted++;
    }

    public void print(int pages) {
        this.nrPagesPrinted += pages;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getNrPagesPrinted() {
        return nrPagesPrinted;
    }

    public boolean isDuplex() {
        return isDuplex;
    }

    public void setTonerLevel(int tonerLevel) {
        this.tonerLevel = tonerLevel>0 && tonerLevel<=100 ? tonerLevel : 0;
    }
}
