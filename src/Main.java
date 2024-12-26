import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        List<Shape> figures = new ArrayList<Shape>();
        figures.add(new Circle(5));
        figures.add(new Rectangle(8, 5));
        figures.add(new Triangle(10, 4, 13));

        for(Shape s : figures) {
            System.out.println("Clss: " + s);
            System.out.println("Perimiter: " + s.P());
            System.out.println("Square: " + s.S());
        }
    }
}