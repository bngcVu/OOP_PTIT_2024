package MangDoiTuong.TinhGio;

import java.util.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine().trim());

        List<GamePlayer> players = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");

        for (int i = 0; i < n; i++) {
            String id = scanner.nextLine().trim();
            String name = scanner.nextLine().trim();
            String startTime = scanner.nextLine().trim();
            String endTime = scanner.nextLine().trim();

            Date start = sdf.parse(startTime);
            Date end = sdf.parse(endTime);

            int playTimeMinutes = (int) ((end.getTime() - start.getTime()) / (60 * 1000));
            players.add(new GamePlayer(id, name, playTimeMinutes));
        }

        Collections.sort(players);

        for (GamePlayer player : players) {
            System.out.printf("%s %s %s%n", player.id, player.name, player.getFormattedPlayTime());
        }

        scanner.close();
    }
}