class Sphere extends Shape implements Volume {
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
    double surfaceArea() {
        return 4 * Math.PI * dim_one * dim_one;
    }
    @Override
    public double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(dim_one, 3);
    }
    @Override
    double volumeOfPyramid() {
        return 0;
    }
}
