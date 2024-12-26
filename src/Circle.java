import java.lang.management.MemoryType;

public class Circle extends Shape{
    private double Radius;
    Circle(double Cradius) {
        if (Cradius < 0) {
            throw new RuntimeException("There is no figure with such parameters: " + Cradius);
        } else {
            this.Radius = Cradius;
        }

    }
    @Override
    double P() {
        return 2.0 * Math.PI * Radius;
    }

    @Override
    double S() {
        return Math.PI * Math.pow(Radius, 2);
    }
}
