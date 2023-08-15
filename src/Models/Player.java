package src.Models;

public class Player {
    private char symbol;
    private String name;
    private PlayerType playerType;

    // Getters and Setters Start

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }
    public char getSymbol() {
        return this.symbol;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }
    public PlayerType getPlayerType() {
        return this.playerType;
    }

    // Getters and Setters End

}