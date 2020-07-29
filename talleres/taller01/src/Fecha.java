package src;

class Fecha {
  private byte dia, mes, ano;

  public Fecha(byte dia, byte mes, byte ano) {
    this.dia = dia;
    this.mes = mes;
    this.ano = ano;
  }

  public byte getDia() {
    return this.dia;
  }

  public byte getMes() {
    return this.mes;
  }

  public byte getAno() {
    return this.ano;
  }

  @Override
  public String toString() {
    return dia + "/" + mes + "/" + año;
  }

  public boolean esIgual(Fecha otra) {
    return this.dia == otra.dia && this.mes == otra.mes && this.ano == otra.ano;
  }

  public String comparar(Fecha otra) {
    int fechaA = this.dia + this.mes * 100 + this.ano * 10000;
    int fechaB = otra.dia + otra.mes * 100 + otra.ano * 10000;

    if (fechaA == fechaB) {
      return "igual";
    } else if (fechaA > fechaB) {
      return "despues";
    } else {
      return "antes";
    }
  }
}
