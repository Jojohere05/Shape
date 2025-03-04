class Circle extends Shape {
    public Circle(double radius){
        super(radius,0,0,0,0);
    }
    @Override
    double calculateArea() {
        return Math.PI * dim_one * dim_one;
    }
    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * dim_one;
    }
    @Override
    double surfaceArea() {
        return 0; // Not applicable for 2D shape
    }

    @Override
    double volumeOfPyramid() {
        return 0; // Not applicable for 2D shape
    }
}
