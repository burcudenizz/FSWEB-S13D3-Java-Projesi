public class Wall {
    //instance variables
    double width;
    double height;

    public Wall(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double setWidth(double number) {
        width = number;
        if (number < 0) {
            width = 0;
        }
        return width;
    }

    public double setHeight(double number) {
        height = number;
        if (number < 0) {
            height = 0;
        }
        return height;
    }


    public double getArea() {
        return width * height;
    }

}
