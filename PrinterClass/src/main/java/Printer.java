public class Printer {
    private int sheetsLeft;
    private int toner;
    // declare attributes of printer 

    public Printer (int sheetsLeft, int toner) {
        this.sheetsLeft = sheetsLeft;
        this.toner = toner;
    }

    public int getSheetsLeft() {
        return this.sheetsLeft;
    }// create method 

    public int getToner() {
        return this.toner;
    }//??

    public void print (int pages, int copies) {

        if (this.sheetsLeft > pages * copies && this.toner > pages * copies) {
            this.sheetsLeft -= (pages * copies);
            this.toner -= (pages * copies);
        }
    }
}
