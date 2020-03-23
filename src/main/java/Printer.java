public class Printer {

    private int sheetCount;
    private int toner;

    public Printer(int sheetCount){
        this.sheetCount = sheetCount;
        this.toner = 100;
    }


    public int getSheetCount() {
        return this.sheetCount;
    }

    public int getToner(){
        return this.toner;
    }

    public boolean hasEnoughSheets(int pages, int copies){
        int requiredSheets;
        requiredSheets = pages * copies;
        return requiredSheets <= this.sheetCount;
    }

    public void print(int pages, int copies) {
        if (this.hasEnoughSheets(pages, copies)) {
            this.sheetCount -= (pages * copies);
            this.toner -= (pages * copies);
        }

    }
}
