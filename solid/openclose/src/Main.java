//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();

        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(3, 4);

        System.out.println("Area of circle: " + areaCalculator.calculateArea(circle));
        System.out.println("Area of rectangle: " + areaCalculator.calculateArea(rectangle));
    }
}