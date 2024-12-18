public class Gamer {
    private String nickname;
    boolean isActive;

    public Gamer(String nickname, boolean isActive) {
        this.nickname = nickname;
        this.isActive = isActive;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    @Override
    public String toString() {
        return "Игрок " +
                "nickname = '" + nickname + '\'' +
                ", в сети ? = " + (isActive ? "Да" : "Нет");
    }

}
