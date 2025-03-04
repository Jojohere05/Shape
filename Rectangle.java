class Rectangle extends Shape{
    public Rectangle(double length, double width){
        super(length, width, 0, 0,4);
    }
    @Override
    double calculateArea() {
        return dim_one * dim_two;
    }
    @Override
    double calculatePerimeter() {
        return 2*(dim_one +dim_two);
    }


}
