// двумерный класс точки.
public class    Point2d {
  private double xCoord; //координата X
  private double yCoord; //координата Y

  public Point2d(double x, double y) {   // Конструктор инициализации
    xCoord = x;
    yCoord = y;
  }

  public Point2d() {  // Конструктор по умолчанию.
    xCoord = 0;
    yCoord = 0;
  }

  public double getxAxis() { // Возвращение координаты X
    return xCoord;
  }

  public void setxAxis(double x) { // Установка значения координаты X
    xCoord = x;
  }

  public double getyAxis() { // Возвращение координаты Y
    return yCoord;
  }

  public void setyAxis(double y) { // Установка значения координаты Y
    yCoord = y;
  }

  public boolean equals(Point2d point) {
    return xCoord == point.xCoord && yCoord == point.yCoord;
  }

  public double distanceTo(Point2d point) { // Расстояние между точками (длина сторон)
    return Math.round(Math.sqrt(Math.pow(point.xCoord - xCoord, 2) + Math.pow(point.yCoord - yCoord, 2)) * 100.0) / 100.0;
  }
}
