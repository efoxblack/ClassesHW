package does;

public class Button {
    public String label;
    public String color;

    public Button() {

    }

    public void setColor() {
        System.out.println("The button is " + color);
    }
    public void setLabel() {
        System.out.println("The label on the button is " + label);
    }
    public void dePress() {
        System.out.println("The button has been pressed");
    }
    public void unDepress() {
        System.out.println("The button is no longer being pressed");
    }
}
