class Geometry {
    double calculateArea(double radius) { return Math.PI * radius * radius; }
    double calculateArea(double length, double width) { return length * width; }
    double calculateArea(double base, double height, boolean type) {
        return 0.5 * base * height;
    }
}
