package com.example.application.models.main;

public class SurfaceFactory {
  public static Surface create(double a, double b, double c, double d, double e, double f, double g, double h, double k,
      double l) {

    Equation equation = new Equation(a, b, c, d, e, f, g, h, k, l);

    if (isElipsoid(equation)) {
      return new Elipsoid(equation);
    } else if (isImaginaryElipsoid(equation)) {
      return new ImaginaryElipsoid(equation);
    } else if (isImaginaryCone(equation)) {
      return new ImaginaryCone(equation);
    } else if (isSingleCavityHyperboloid(equation)) {
      return new SingleCavityHyperboloid(equation);
    } else if (isDoubleCavityHyperboloid(equation)) {
      return new DoubleCavityHyperboloid(equation);
    } else if (isCone(equation)) {
      return new Cone(equation);
    } else if (isEllipticParaboloid(equation)) {
      return new EllipticParaboloid(equation);
    } else if (isHyperbolicParaboloid(equation)) {
      return new HyperbolicParaboloid(equation);
    } else if (isEllipticCylinder(equation)) {
      return new EllipticCylinder(equation);
    } else if (isImaginaryEllipticCylinder(equation)) {
      return new ImaginaryEllipticCylinder(equation);
    } else if (isPairOfImaginaryIntersectedPlanes(equation)) {
      return new PairOfImaginaryIntersectedPlanes(equation);
    } else if (isHyperbolicCylinder(equation)) {
      return new HyperbolicCylinder(equation);
    } else if (isPairOfIntersectedPlanes(equation)) {
      return new PairOfIntersectedPlanes(equation);
    } else if (isParabolicCylinder(equation)) {
      return new ParabolicCylinder(equation);
    } else if (isPairOfParallelPlanes(equation)) {
      return new PairOfParallelPlanes(equation);
    } else if (isPairOfImaginaryParallelPlanes(equation)) {
      return new PairOfImaginaryParallelPlanes(equation);
    } else if (isPairOfMatchingPlanes(equation)) {
      return new PairOfMatchingPlanes(equation);
    } else {
      return new Surface(equation);
    }
  }

  private static boolean isElipsoid(Equation equation) {
    return equation.checkCondition(e -> e.a > 0 && e.b > 0 && e.c > 0 && e.d == 0 && e.e == 0
            && e.f == 0
            && e.g == 0 && e.h == 0 && e.k == 0 && e.l < 0);
  }

  private static boolean isImaginaryElipsoid(Equation equation) {
    return equation.checkCondition(e -> e.a > 0 && e.b > 0 && e.c > 0 && e.d == 0 && e.e == 0
            && e.f == 0
            && e.g == 0 && e.h == 0 && e.k == 0 && e.l > 0);
  }

  private static boolean isImaginaryCone(Equation equation) {
    return equation.checkCondition(e -> e.a > 0 && e.b > 0 && e.c > 0 && e.d == 0 && e.e == 0
            && e.f == 0
            && e.g == 0 && e.h == 0 && e.k == 0 && e.l == 0);
  }

  public static boolean isSingleCavityHyperboloid(Equation equation) {
    return equation.checkCondition(e -> e.a > 0 && e.b > 0 && e.c < 0 && e.d == 0 && e.e == 0
            && e.f == 0
            && e.g == 0 && e.h == 0 && e.k == 0 && e.l > 0);
  }

  public static boolean isDoubleCavityHyperboloid(Equation equation) {
    return equation.checkCondition(e -> e.a > 0 && e.b > 0 && e.c < 0 && e.d == 0 && e.e == 0
            && e.f == 0
            && e.g == 0 && e.h == 0 && e.k == 0 && e.l < 0);
  }

  public static boolean isCone(Equation equation) {
    return equation.checkCondition(e -> e.a > 0 && e.b > 0 && e.c < 0 && e.d == 0 && e.e == 0
            && e.f == 0
            && e.g == 0 && e.h == 0 && e.k == 0 && e.l == 0);
  }

  public static boolean isEllipticParaboloid(Equation equation) {
    return equation.checkCondition(e -> e.a > 0 && e.b > 0 && e.c == 0 && e.d == 0 && e.e == 0
            && e.f == 0
            && e.g == 0 && e.h == 0 && e.k < 0 && e.l == 0);
  }

  public static boolean isHyperbolicParaboloid(Equation equation) {
    return equation.checkCondition(e -> e.a > 0 && e.b < 0 && e.c == 0 && e.d == 0 && e.e == 0
            && e.f == 0
            && e.g == 0 && e.h == 0 && e.k < 0 && e.l == 0);
  }

  public static boolean isEllipticCylinder(Equation equation) {
    return equation.checkCondition(e -> e.a > 0 && e.b > 0 && e.c == 0 && e.d == 0 && e.e == 0
            && e.f == 0
            && e.g == 0 && e.h == 0 && e.k == 0 && e.l < 0);
  }

  public static boolean isImaginaryEllipticCylinder(Equation equation) {
    return equation.checkCondition(e -> e.a > 0 && e.b > 0 && e.c == 0 && e.d == 0 && e.e == 0
            && e.f == 0
            && e.g == 0 && e.h == 0 && e.k == 0 && e.l > 0);
  }

  public static boolean isPairOfImaginaryIntersectedPlanes(Equation equation) {
    return equation.checkCondition(e -> e.a > 0 && e.b > 0 && e.c == 0 && e.d == 0 && e.e == 0
            && e.f == 0
            && e.g == 0 && e.h == 0 && e.k == 0 && e.l == 0);
  }

  public static boolean isHyperbolicCylinder(Equation equation) {
    return equation.checkCondition(e -> e.a > 0 && e.b < 0 && e.c == 0 && e.d == 0 && e.e == 0
            && e.f == 0
            && e.g == 0 && e.h == 0 && e.k == 0 && e.l < 0);
  }

  public static boolean isPairOfIntersectedPlanes(Equation equation) {
    return equation.checkCondition(e -> e.a > 0 && e.b < 0 && e.c == 0 && e.d == 0 && e.e == 0
            && e.f == 0
            && e.g == 0 && e.h == 0 && e.k == 0 && e.l == 0);
  }

  public static boolean isParabolicCylinder(Equation equation) {
    return equation.checkCondition(e -> e.a == 0 && e.b > 0 && e.c == 0 && e.d == 0 && e.e == 0
            && e.f == 0
            && e.g < 0 && e.h == 0 && e.k == 0 && e.l == 0);
  }

  public static boolean isPairOfParallelPlanes(Equation equation) {
    return equation.checkCondition(e -> e.a == 0 && e.b > 0 && e.c == 0 && e.d == 0 && e.e == 0
            && e.f == 0
            && e.g == 0 && e.h == 0 && e.k == 0 && e.l < 0);
  }

  public static boolean isPairOfImaginaryParallelPlanes(Equation equation) {
    return equation.checkCondition(e -> e.a == 0 && e.b > 0 && e.c == 0 && e.d == 0 && e.e == 0
            && e.f == 0
            && e.g == 0 && e.h == 0 && e.k == 0 && e.l > 0);
  }

  public static boolean isPairOfMatchingPlanes(Equation equation) {
    return equation.checkCondition(e -> e.a == 0 && e.b > 0 && e.c == 0 && e.d == 0 && e.e == 0
            && e.f == 0
            && e.g == 0 && e.h == 0 && e.k == 0 && e.l == 0);
  }
}
