package src.Models;

public class Bot extends Player{
    private BotDifficultyLevel botDifficultyLevel;

    public void setBotDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
        this.botDifficultyLevel = botDifficultyLevel;
    }
    public BotDifficultyLevel getBotDifficultyLevel() {
        return this.botDifficultyLevel;
    }
}