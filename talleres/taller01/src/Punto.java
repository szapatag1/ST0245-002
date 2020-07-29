package src;

class Punto {
  private double x;
  private double y;

  public Punto(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double getX() {
    return this.x;
  }

  public double getY() {
    return this.y;
  }

  public double radio() {
    return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
  }

  public double angulo() {
    return Math.atan(y / x);
  }

  public double distanciaEuclidiana(Punto otro) {
    catetoX = Math.abs(otro.getX - this.x);
    catetoY = Math.abs(otro.getY - this.y);

    return Math.sqrt(Math.pow(catetoX, 2) + Math.pow(catetoY, 2));
  }
}
