import java.util.Objects;
import java.util.Set;

public class Product {
    private String name;
    private float price;
    private float amount;

    private boolean checked;

    public Product(String name, float price, float amount) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Заполните карточку товара полностью, отсутствует имя" );
        } else this.name = name;
        if (price < 0) {
            throw new IllegalArgumentException("Заполните карточку товара полностью, отсутствует цена");
        } else this.price = Math.max(1f,price);
        if (amount < 0) {
            throw new IllegalArgumentException("Заполните карточку товара полностью, отсутствует количество");
        } else this.amount = Math.max(1f,amount);
        this.checked=false;
    }

    public  void addProduct (String name, Set<String> set) {
        if (set.contains(this.name)) {
            throw new RuntimeException("Уже куплен " + this.name);
        } else {
            set.add(name);
        }
    }

    public void removeProduct(String name, Set<String> set) {
        if (set.contains(name)) {
            set.remove(name);
        }
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public float getAmount() {
        return amount;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked() {
        this.checked = true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        String checkedString = this.isChecked() ? "Да" : "Нет";
        return "Продукт "
                 + this.name + '\'' +
                "по цене:  " + this.price +
                ", цена за кг: " + this.amount + ", куплен: " + checkedString +
                '}';
    }
}
