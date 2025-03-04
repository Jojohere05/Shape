class Cylinder extends Shape implements Volume{
    public Cylinder(double radius, double height) {
        super(radius, height, 0, 0,0);
    }
    @Override
    double calculateArea() {
        return 2 * Math.PI * dim_one * (dim_one + dim_two);
    }

    @Override
    double calculatePerimeter() {
        return 0; // No perimeter for a cylinder
    }
    @Override
    double surfaceArea() {
        return 2 * Math.PI * dim_one * (dim_one + dim_two);
    }

    @Override
    public double calculateVolume() {
        return Math.PI * dim_one * dim_one * dim_two;
    }
    @Override
    double volumeOfPyramid() {
        return 0;
    }

}
