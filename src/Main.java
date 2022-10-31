import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Product orange = new Product("Апельсин", 56f, 4);
        Product orange2 = new Product("Апельсин", 56f, 5);
        Product apple = new Product("Яблоко", 120f, 1.5f);

        ProductList productList = new ProductList();
        productList.addProduct(orange);
        productList.addProduct(apple);
        System.out.println(productList);

//        productList.addProduct(orange2); //добавление дубля
//        System.out.println(productList);

        Recipe recipe = new Recipe("Recipe1", Set.of(orange, apple));
        System.out.println(recipe.getRecipePrice());

        //        Set<String> productList = new HashSet<>();
//
//        try {
//            orange.addProduct(String.valueOf(orange), productList); //
//            orange2.addProduct(String.valueOf(orange2), productList); //исключение на второй такой-же продукт по имени только по имени не работает
//            apple.addProduct(String.valueOf(apple),productList);
//
//        } catch (RuntimeException e) {
//            e.getMessage();
//        } finally {
//            System.out.println("Список покупок: " + productList);
//        }
//
//
//        apple.removeProduct(String.valueOf(apple),productList);
//        System.out.println("Список покупок после удаления: " + productList);
    }
}