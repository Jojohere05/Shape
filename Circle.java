class Circle extends Shape {
    public Circle(double radius){
        super(radius,0,0,0,0)
    }
    @Override
    double calculatearea() {
        return Math.PI * dim_one * dim_one;
    }
    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * dim_one;
    }
}
