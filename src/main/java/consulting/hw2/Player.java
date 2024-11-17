package consulting.hw2;

public class Player {
    private String nickname;
    private int level;
    private int score;

    public Player(String nickname, int level, int score) {
        this.nickname = nickname;
        this.level = level;
        this.score = score;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void levelUp() {
        this.level++;
    }

    public void addScore(int points) {
        this.score += points;
    }

    public void printPlayerInfo() {
        System.out.printf("Игрок: %s, Уровень: %s, Очки: %s",
                this.nickname, this.level, this.score);
    }
}
