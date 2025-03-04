abstract class Shape {
    protected String shapeName;
    public Shape(String shapeName) {
        this.shapeName = shapeName;
    }
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
    public void display(){
        System.out.println("Shape: "+shapeName);
    }
}
