public class Rectangle {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        if(width > 0)
            this.width = width;
        if(height > 0)
            this.height = height;
    }

    public double computeArea() {
        return width * height;
    }

    public double getHeight() {
        return height;
    }
}
