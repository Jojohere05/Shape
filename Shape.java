abstract class Shape {
    protected double dim_one, dim_two, dim_three, radius;
    int num_sides;

    public Shape() {
        dim_one = dim_two = dim_three = radius = 0; // Default values
        num_sides = 0;
    }
    public Shape(double dim_one, double dim_two, double dim_three,double radius,int num_sides){
        this.dim_one=dim_one;
        this.dim_two=dim_two;
        this.dim_three=dim_three;
        this.radius=radius;
        this.num_sides=num_sides;
    }
    abstract double calculateArea();
    abstract double calculatePerimeter();
    abstract double surfaceArea();
    abstract double volumeOfPyramid();

    public int getNumSides(){
        return num_sides;
    }
}
