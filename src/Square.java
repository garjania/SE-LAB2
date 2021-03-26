public class Square implements Shape{
    private double width;

    public Square(double width) {
        if(width > 0)
            this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width > 0)
            this.width = width;
    }

    public double computeArea() {
        return width * width;
    }
}