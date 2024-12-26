public class Triangle extends Shape{
    private double A;
    private double B;
    private double C;
    Triangle(double Ta, double Tb, double Tc) {
        if (Ta < 0 || Tb < 0 || Tc < 0 || Ta + Tb < Tc || Ta + Tc < Tb || Tb + Tc < Ta) {
            throw new RuntimeException("There is no figure with such parameters: " + Ta + ", " + Tb + ", " + Tc);
        } else {
            this.A = Ta;
            this.B = Tb;
            this.C = Tc;
        }

    }
    @Override
    double P() {
        return A + B + C;
    }

    @Override
    double S() {
        double HP = (A + B + C)/2.0;
        return Math.sqrt(HP * (HP - A) * (HP - B) * (HP - C));
    }
}
