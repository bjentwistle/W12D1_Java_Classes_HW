public class WaterBottle {
    private int volume = 100;
// initialise volume to 100

    public WaterBottle () {
        this.volume = volume;
    }// add volume attribute to WaterBottle

    public int getVolume() {
        return this.volume;
    }//create getter method get volume

    public void drink() {
        this.volume -= 10;
    }//create drink method to reduce volume

    public void empty() {
        this.volume = 0;
    }// create emoty method

    public void fill() {
        this.volume = 100;
    }// create fill method. 
}
