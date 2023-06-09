import java.util.*;

public class Problem_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, List<String>> guestMealMap = new LinkedHashMap<>();

        String guestInfoInput = "";
        int unlikedMealsCount = 0;

        while (!"Stop".equals(guestInfoInput = scanner.nextLine())) {
            String[] guestInfoArr = guestInfoInput.split("-");
            String guest = guestInfoArr[1];
            String meal = guestInfoArr[2];

            if (guestInfoInput.contains("Like")) {
                if (!guestMealMap.containsKey(guest)) {
                    guestMealMap.put(guest, new ArrayList<>());
                    guestMealMap.get(guest).add(meal);
                } else if ((!guestMealMap.get(guest).contains(meal))) {
                    guestMealMap.get(guest).add(meal);
                }
            } else if (guestInfoInput.contains("Dislike")) {

                if (!guestMealMap.containsKey(guest)) {
                    System.out.println(guest + " is not at the party.");
                } else if (!guestMealMap.get(guest).contains(meal)) {
                    System.out.printf("%s doesn't have the %s in his/her collection.%n", guest, meal);
                } else {
                    unlikedMealsCount++;
                    guestMealMap.get(guest).remove(meal);
                    System.out.printf("%s doesn't like the %s.%n", guest, meal);
                }
            }
        }
        guestMealMap.forEach((key, value) -> System.out.println(key
                                            + ": "
                                            + value.toString()
                                            .replaceAll("[\\[\\]]", "")));

        System.out.println("Unliked meals: " + unlikedMealsCount);
    }
}
