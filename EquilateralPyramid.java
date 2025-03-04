class EquilateralPyramid extends Shape implements Volume {
    public EquilateralPyramid(double base, double height) {
        super(base, height, 0,0, 4);
    }
    @Override
    double calculateArea() {
        return dim_one * dim_one;
    }

}
