public class Colors {

    private String color;

    // Constructor BAD EXP
    private Colors(String color) {
        this.color = color;
    }

private final static Colors red = new  Colors("red");
private final static Colors blue = new Colors("blue");
private final static Colors green = new Colors("green");




    public static Colors red() {
        return red;
    }

    public static Colors blue() {
        return blue;
    }

    public static Colors green() {
        return green;
    }

    @Override
    public String toString() {
        return color;
    }

    public static void main(String[] args) {
        System.out.println("Color ::: " + Colors.red());
        System.out.println("Color ::: " + Colors.blue());
        System.out.println("Color ::: " + Colors.green());

    }
}