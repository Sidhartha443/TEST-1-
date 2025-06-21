class Square extends TransformableShape {
    void resize(double factor) { System.out.println("Resizing square by " + factor); }
    void rotate(double angle) { System.out.println("Rotating square by " + angle + " degrees"); }
}
