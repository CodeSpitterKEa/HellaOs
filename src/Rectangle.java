public class Rectangle {
    private double width;
    private double height;

    //gettere

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    // settere

    //Standard konstruktør
    public Rectangle(double height , double width) {
        this.height = height;
        this.width = width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return(width*height);

    }

    // overfører regnskaberne til
    public String toString() {
        return("Rectangle: width= "+getWidth()+" Height is: "+getHeight()+" Area"+getArea());
    }
}
