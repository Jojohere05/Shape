class EquilateralPyramid extends Shape implements Volume {
    public EquilateralPyramid(double base, double height) {
        super(base, height, 0,0, 4);
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
        return dim_one * dim_one + 2 * dim_one * Math.sqrt((dim_one * dim_one / 4) + (dim_two * dim_two));
    }

}
