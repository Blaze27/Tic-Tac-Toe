package src.Models;

import java.util.List;


public class Board {
    private List<List<Cell>> cells;

    public List<List<Cell>> getBoard() {
        return this.cells;
    }

    public void setBoard(List<List<Cell>> cells) {
        this.cells = cells;
    }

}