package com.example.application.models.main;

import java.util.function.Predicate;
import java.util.Arrays;

public class Equation {
  public double a, b, c, d, e, f, g, h, k, l;

  public Equation(double a, double b, double c, double d, double e, double f, double g, double h, double k, double l) {
    this.a = a;
    this.b = b;
    this.c = c;
    this.d = d;
    this.e = e;
    this.f = f;
    this.g = g;
    this.h = h;
    this.k = k;
    this.l = l;
  }

  public Equation negative() {
    return new Equation(-a, -b, -c, -d, -e, -f, -g, -h, -k, -l);
  }

  public boolean checkCondition(Predicate<Equation> predicate) {
    return Arrays.asList(this, this.negative()).stream().anyMatch(predicate);
  }

  public String toString() {
    return String.format(
        "%.2fx^2 + %.2fy^2 + %.2fz^2 + %.2fxy + %.2fxz + %.2fyz + %.2fx + %.2fy + %.2fz + %.2f = 0", a, b, c, d, e, f, g, h, k, l);
  }
}
