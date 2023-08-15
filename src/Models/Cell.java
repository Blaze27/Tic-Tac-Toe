package src.Models;

public class Cell {
    private Player player;
    private int row;
    private int col;
    private CellState cellState;

    // Getters Setters Start

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return this.player;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getRow() {
        return this.row;
    }

    public void setColumn(int col) {
        this.col = col;
    }

    public int getCol() {
        return this.col;
    }

    public void setCellState(CellState cellState) {
        this.cellState = cellState;
    }

    public CellState getCellState() {
        return this.cellState;
    }

    // Getters Setters End

}