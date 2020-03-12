package does;

public class ShoppingCart {
    public String cartContents;

    public ShoppingCart() {

    }

    public void addToCart() {
        System.out.println("Added to cart");
    }
    public void removeFromCart() {
        System.out.println("Removed from cart");
    }
    public void checkOut() {
        System.out.println("Checked out");
    }
}
