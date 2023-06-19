public class Printer {
    private int sheetsLeft;
    private int toner;

    public Printer (int sheetsLeft, int toner) {
        this.sheetsLeft = sheetsLeft;
        this.toner = toner;
    }

    public int getSheetsLeft() {
        return this.sheetsLeft;
    }

    public int toner() {
        return this.toner;
    }

    public void print (int pages, int copies) {

        if (this.sheetsLeft > pages * copies && this.toner > pages * copies) {
            this.sheetsLeft -= (pages * copies);
            this.toner -= (pages * copies);
        }
    }
}
