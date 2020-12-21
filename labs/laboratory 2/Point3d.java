public class Point3d extends Point2d {
  private double zCoord;

  public Point3d(double x, double y, double z) { // Конструктор инициализации
    super(x, y);
    zCoord = z;
  }

  public Point3d() { // Конструктор по умолчанию.
    super();
    zCoord = 0;
  }

  public double getzAxis() { // Возвращение координаты Z
    return zCoord;
  }

  public void setzAxis(double z) { // Установка значения координаты Z
    zCoord = z;
  }

  public boolean equals(Point3d point) {
    return getxAxis() == point.getxAxis() && getyAxis() == point.getyAxis() && zCoord == point.zCoord;
  }

  public double distanceTo(Point3d point) { // Расстояние между точками (длина сторон)
    return Math.round(Math.sqrt(Math.pow(point.getxAxis() - getxAxis(), 2) + Math.pow(point.getyAxis() - getyAxis(), 2) + Math.pow(point.zCoord - zCoord, 2)) * 100.0) / 100.0;
  }
}
