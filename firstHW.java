import java.util.ArrayList;

class Product {
    String name;
    double price;
    int rating;

    public Product(String name, double price, int rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }
}

class Category {
    String name;
    ArrayList<Product> products;

    public Category(String name, ArrayList<Product> products) {
        this.name = name;
        this.products = products;
    }
}

class Basket {
    ArrayList<Product> items;

    public Basket() {
        this.items = new ArrayList<Product>();
    }
}

class User {
    String login;
    String password;
    Basket basket;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
        this.basket = new Basket();
    }
}

public class firstHW {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<Product>();
        products.add(new Product("Product 1", 10.0, 4));
        products.add(new Product("Product 2", 20.0, 3));
        products.add(new Product("Product 3", 30.0, 5));

        Category category1 = new Category("Category 1", products);
        Category category2 = new Category("Category 2", products);

        ArrayList<User> users = new ArrayList<User>();
        users.add(new User("user1", "password1"));
        users.add(new User("user2", "password2"));

        // вывод каталога продуктов
        System.out.println("Catalog:");
        for (Product product : products) {
            System.out.println(product.name + " - " + product.price + " - " + product.rating);
        }

        // вывод покупок пользователей
        for (User user : users) {
            System.out.println("User: " + user.login);
            for (Product item : user.basket.items) {
                System.out.println(item.name);
            }
        }
    }
}
