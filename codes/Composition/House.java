public class House {
    private Table theTable;
    private Tv theTv;

    public House(Table theTable, Tv theTv) {
        this.theTable = theTable;
        this.theTv = theTv;
    }
    
    public void getAll() {
        theTable.getName();
        theTable.getDimension();
        theTv.getName();
        theTv.getDimension();
    }

}