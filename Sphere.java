class Sphere extends Shape  {
    public Sphere(double radius) {
        super(radius, 0, 0, 0,0);
    }
    @Override
    double calculateArea() {
        return 4 * Math.PI * dim_one * dim_one;
    }
    @Override
    double calculatePerimeter() {
        return 0; // No perimeter for sphere
    }
}
