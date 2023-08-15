package src.Models;
import java.util.List;

public class Game {
    private Board board;
    private List<Player> player;
    private List<Move> move;
    private GameStatus gameStatus;
    private int nextPlayerIndex;

    // Getters and Setters Start

    public Board getBoard() {
        return this.board;
    }
    public void setBoard(Board board) {
        this.board = board;
    }


    public List<Player> getPlayer() {
        return this.player;
    }
    public void setPlayer(List<Player> player) {
        this.player = player;
    }


    public void setMove(List<Move> move) {
        this.move = move;
    }
    public List<Move> getMove() {
        return this.move;
    }


    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }
    public GameStatus getGameStatus() {
        return this.gameStatus;
    }


    public void setNextPlayerIndex(int nextPlayerIndex) {
        this.nextPlayerIndex = nextPlayerIndex;
    }
    public int getNextPlayerIndex() {
        return this.nextPlayerIndex;
    }

    // Getters and Setters End
}