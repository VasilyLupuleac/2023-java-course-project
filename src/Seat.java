public class Seat {
    private int row;
    private int column;
    private Boolean isTaken;

    public Seat(int row, int column) {
        this.row = row;
        this.column = column;
        isTaken = false;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }
    public void reserve() {
        isTaken = true;
    }
}
