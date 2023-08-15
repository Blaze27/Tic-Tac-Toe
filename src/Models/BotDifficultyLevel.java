package src.Models;

public enum BotDifficultyLevel {
    EASY(1),
    MEDIUM(2),
    HARD(3);

    private int value;

    BotDifficultyLevel(int value) {
        this.value = value;
    }

    public int getBotDifficultyLevel() {
        return this.value;
    }
}