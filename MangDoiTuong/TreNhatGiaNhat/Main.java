package MangDoiTuong.TreNhatGiaNhat;

import java.util.*;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Main {
    static class Person implements Comparable<Person> {
        String name;
        Date birthDate;

        Person(String name, String birthDateStr) throws ParseException {
            this.name = name;
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            this.birthDate = sdf.parse(birthDateStr);
        }

        @Override
        public int compareTo(Person other) {
            return this.birthDate.compareTo(other.birthDate);
        }
    }

    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());

        List<Person> people = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String[] input = scanner.nextLine().split(" ");
            people.add(new Person(input[0], input[1]));
        }

        Collections.sort(people);

        System.out.println(people.get(people.size() - 1).name);  // Youngest
        System.out.println(people.get(0).name);  // Oldest

        scanner.close();
    }
}
