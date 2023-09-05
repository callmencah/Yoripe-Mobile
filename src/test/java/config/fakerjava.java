package config;
import com.github.javafaker.Faker;

public class fakerjava {
    public static String generateFood() {
        Faker faker = new Faker();
        return faker.food().dish();
    }
    public static String generateLorem() {
        Faker faker = new Faker();
        return faker.lorem().paragraph(2);
    }

    public static String[] generateIngredients() {
        Faker faker = new Faker();
        String[] ingredients = new String[5];
        for (int i = 0; i < 5; i++) {
            ingredients[i] = faker.food().ingredient();
        }
        return ingredients;
    }
}
