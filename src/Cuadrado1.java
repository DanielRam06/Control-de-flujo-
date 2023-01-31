
class Cuadrado1 {
    double ID;

    public Cuadrado1(double ID) {
        this.ID = ID;
    }

    public double getDiagonal() {
        return Math.sqrt(2) * ID;
    }

    public double getPerimetro() {
        return 4 * ID;
    }

    public double getArea() {
        return ID * ID;
    }
}