package abstractsample;

class Rectangle extends Shape {
    int length, width;
    Rectangle(String name, int length, int width) {
        super(name);
        this.length=length;
        this.width=width;
    }
    
    @Override
    public double area() {
        return this.length*this.width;
    }
}
