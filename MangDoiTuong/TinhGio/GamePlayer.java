package MangDoiTuong.TinhGio;

public class GamePlayer implements Comparable<GamePlayer>{
    String id;
    String name;
    int playTimeMinutes;

    GamePlayer(String id, String name, int playTimeMinutes) {
        this.id = id;
        this.name = name;
        this.playTimeMinutes = playTimeMinutes;
    }

    @Override
    public int compareTo(GamePlayer other) {
        return Integer.compare(other.playTimeMinutes, this.playTimeMinutes);
    }

    public String getFormattedPlayTime() {
        int hours = playTimeMinutes / 60;
        int minutes = playTimeMinutes % 60;
        return String.format("%d gio %d phut", hours, minutes);
    }
}
