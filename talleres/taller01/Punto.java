class Punto {
  private double x, y;

  public Punto(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double radio() {
    return Math.sqrt(this.x + this.y);
  }

  public double angulo() {
    return Math.atan(this.y / this.x);
  }

  public double distancia(Punto otro) {
    catetoA = Math.abs(otro.getX() - this.x);
    catetoB = Math.abs(otro.getY() - this.y);

    return Math.sqrt(catetoA + catetoB);
  }

  public double getX() {
    return this.x;
  }

  public double getY() {
    return this.y;
  }
}
