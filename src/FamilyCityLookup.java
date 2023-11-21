import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FamilyCityLookup {
    public static void main(String[] args) {
        // Створення мапи для зберігання міст та сімей
        Map<String, String> cityFamilyMap = new HashMap<>();
        cityFamilyMap.put("Париж", "Іванови");
        cityFamilyMap.put("Київ", "Петрови");
        cityFamilyMap.put("Лондон", "Абрамовичі");

        // Введення міста
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть місто:");
        String city = scanner.nextLine();

        // Пошук сім'ї за містом та виведення результату
        if (cityFamilyMap.containsKey(city)) {
            String family = cityFamilyMap.get(city);
            System.out.println("Сім'я, яка живе у місті " + city + ": " + family);
        } else {
            System.out.println("Місто не знайдено в базі даних.");
        }
    }
}

