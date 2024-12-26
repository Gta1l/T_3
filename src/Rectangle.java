public class Rectangle extends Shape{
    private double Length;
    private double Width;
    Rectangle(double Rlength, double Rwidth) {
        if (Rwidth < 0 || Rlength < 0) {
            throw new RuntimeException("There is no figure with such parameters: " + Rlength + ", " + Rwidth);
        } else {
            this.Length = Rlength;
            this.Width = Rwidth;
        }
    }

        @Override
        double P () {
            return 2.0 * (Length + Width);
        }

        @Override
        double S () {
            return Length * Width;
        }
    }
