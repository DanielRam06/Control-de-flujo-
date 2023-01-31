
class Circulo2 {
    double ID;

    public Circulo2(double ID) {
        this.ID = ID;
    }

    public double getCircunferencia() {
        return 2 * Math.PI * ID;
    }

    public double getArea() {
        return Math.PI * Math.pow(ID, 2);
    }
}