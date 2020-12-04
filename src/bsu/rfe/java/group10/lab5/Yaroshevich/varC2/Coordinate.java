package bsu.rfe.java.group10.lab5.Yaroshevich.varC2;

public class Coordinate {

    // Левый верхний угол для нашего экрана
    private double minX=0;
    private double maxY=0;
    // Правый нижний угол экрана
    private double maxX=0;
    private double minY=0;
    public Coordinate(){
        minY=0;
        minX=0;
        maxX=0;
        minX=0;
    }
    public Coordinate(double minX,double maxY,double maxX,double minY){
        setLeftUpperCorner(minX,maxY);
        setRightBottomCorner(maxX,minY);
    }
    public void setLeftUpperCorner(double minX,double maxY){
        this.minX=minX;
        this.maxY=maxY;
    }
    public void setRightBottomCorner(double maxX,double minY){
        this.maxX=maxX;
        this.minY=minY;
    }

    public double getMinX() {
        return minX;
    }

    public double getMaxY() {
        return maxY;
    }

    public double getMaxX() {
        return maxX;
    }

    public double getMinY() {
        return minY;
    }

    @Override
    public String toString() {
        return "Coordinate:  Left upper corner(" +
                 + minX +
                ";" + maxY +
                "), Right bottom corner (" + maxX +
                ";" + minY +
                ')';
    }
}
