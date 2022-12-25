package com.example.application.models.main;

public class Surface {
  private Equation equation;

  public Surface(Equation equation) {
    this.equation = equation;
  }

  public String name() {
    return "Дане рівняння не відповідає жодній поверхні другого порядку";
  }

  public String toString() {
    return equation.toString();
  }

  public String imageSrc() {
    return "images/num0.png";
  }
}

class Elipsoid extends Surface {
  public Elipsoid(Equation equation) {
    super(equation);
  }

  public String name() {
    return "Еліпсоїд";
  }

  public String imageSrc() {
    return "images/num1.png";
  }
}

class ImaginaryElipsoid extends Surface {
  public ImaginaryElipsoid(Equation equation) {
    super(equation);
  }

  public String name() {
    return "Уявний еліпсоїд";
  }

  public String imageSrc() {
    return "images/num2.png";
  }
}

class ImaginaryCone extends Surface {
  public ImaginaryCone(Equation equation) {
    super(equation);
  }

  public String name() {
    return "Уявний конус";
  }

  public String imageSrc() {
    return "images/num3.png";
  }
}

class SingleCavityHyperboloid extends Surface {
  public SingleCavityHyperboloid(Equation equation) {
    super(equation);
  }

  public String name() {
    return "Однопорожнинний гіперболоїд";
  }

  public String imageSrc() {
    return "images/num4.png";
  }
}

class DoubleCavityHyperboloid extends Surface {
  public DoubleCavityHyperboloid(Equation equation) {
    super(equation);
  }

  public String name() {
    return "Двопорожнинний гіперболоїд";
  }

  public String imageSrc() {
    return "images/num5.png";
  }
}

class Cone extends Surface {
  public Cone(Equation equation) {
    super(equation);
  }

  public String name() {
    return "Конус";
  }

  public String imageSrc() {
    return "images/num6.png";
  }
}

class EllipticParaboloid extends Surface {
  public EllipticParaboloid(Equation equation) {
    super(equation);
  }

  public String name() {
    return "Еліптичний параболоїд";
  }

  public String imageSrc() {
    return "images/num7.png";
  }
}

class HyperbolicParaboloid extends Surface {
  public HyperbolicParaboloid(Equation equation) {
    super(equation);
  }

  public String name() {
    return "Гіперболічний параболоїд";
  }

  public String imageSrc() {
    return "images/num8.png";
  }
}

class EllipticCylinder extends Surface {
  public EllipticCylinder(Equation equation) {
    super(equation);
  }

  public String name() {
    return "Еліптичний циліндр";
  }

  public String imageSrc() {
    return "images/num9.png";
  }
}

class ImaginaryEllipticCylinder extends Surface {
  public ImaginaryEllipticCylinder(Equation equation) {
    super(equation);
  }

  public String name() {
    return "Уявний еліптичний циліндр";
  }

  public String imageSrc() {
    return "images/num10.png";
  }
}

class PairOfImaginaryIntersectedPlanes extends Surface {
  public PairOfImaginaryIntersectedPlanes(Equation equation) {
    super(equation);
  }

  public String name() {
    return "Пара уявних площин, що перетинаються";
  }

  public String imageSrc() {
    return "images/num11.png";
  }
}

class HyperbolicCylinder extends Surface {
  public HyperbolicCylinder(Equation equation) {
    super(equation);
  }

  public String name() {
    return "Гіперболічний циліндр";
  }

  public String imageSrc() {
    return "images/num12.png";
  }
}

class PairOfIntersectedPlanes extends Surface {
  public PairOfIntersectedPlanes(Equation equation) {
    super(equation);
  }

  public String name() {
    return "Пара площин, що перетинаються";
  }

  public String imageSrc() {
    return "images/num13.png";
  }
}

class ParabolicCylinder extends Surface {
  public ParabolicCylinder(Equation equation) {
    super(equation);
  }

  public String name() {
    return "Параболічний циліндр";
  }

  public String imageSrc() {
    return "images/num14.png";
  }
}

class PairOfParallelPlanes extends Surface {
  public PairOfParallelPlanes(Equation equation) {
    super(equation);
  }

  public String name() {
    return "Пара паралельних площин";
  }

  public String imageSrc() {
    return "images/num15.png";
  }
}

class PairOfImaginaryParallelPlanes extends Surface {
  public PairOfImaginaryParallelPlanes(Equation equation) {
    super(equation);
  }

  public String name() {
    return "Пара уявних паралельних площин";
  }

  public String imageSrc() {
    return "images/num16.png";
  }
}

class PairOfMatchingPlanes extends Surface {
  public PairOfMatchingPlanes(Equation equation) {
    super(equation);
  }

  public String name() {
    return "Пара співпадаючих площин";
  }

  public String imageSrc() {
    return "images/num17.png";
  }
}
