package src.Models;

public class Move {
    private Player player;
    private Cell cell;

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return this.player;
    }

    public void setcell(Cell cell) {
        this.cell = cell;
    }

    public Cell getCell() {
        return this.cell;
    }
}