class Square extends Shape{
    public Square(double side) {
        super(side, side, 0,0, 4);
    }
    @Override
    double calculateArea() {
        return dim_one * dim_one;
    }
    @Override
    double calculatePerimeter() {
        return 4 * dim_one;
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
