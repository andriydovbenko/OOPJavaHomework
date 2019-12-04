public class Circle {
    private double areaOfCircle;

    Circle(double radius) {
        this.areaOfCircle = Math.PI * Math.pow(radius, 2);
    }

    public double getAreaOfCircle() {
        return areaOfCircle;
    }
}
