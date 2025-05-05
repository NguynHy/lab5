package LABTUAN5;
class Square extends Rectangle {
    public Square() {
        super();
    }
    public Square(double side) {
        super(side, side);
    }
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }
    public double getSide() {
        return getWidth(); // width == length in square
    }
    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }
    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }
    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }
    @Override
    public String toString() {
        return "Hinh vuong [side=" + getSide() + ", color=" + color + ", filled=" + filled + "]";
    }
}
