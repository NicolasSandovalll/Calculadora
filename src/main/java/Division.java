public class Division {
    public double suma(double numero1, double numero2) {
        if ( numero2 == 0) {
            throw new ArithmeticException(("La división por cero no está permitida."));
        } else {
            return numero1/numero2;
        }
    }
}
