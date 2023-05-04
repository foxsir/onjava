/**
 * Enum类的能力
 */
package advanced.enums;

import java.util.Arrays;

enum Shrubbery {
  GROUND(10),
  CRAWLING(10),
  HANGING(10);

  Shrubbery(Integer mo) {
  }
}


enum Planet {
  MERCURY(3.303e+23),
  VENUS(4.869e+24),
  EARTH(5.976e+24),
  MARS(6.421e+23),
  JUPITER(1.9e+27),
  SATURN(5.688e+26),
  URANUS(8.686e+25),
  NEPTUNE(1.024e+26);

  private final double value;

  Planet(double mass) {
    this.value = mass;
  }

  public Double getResponse() {
    return value;
  }
}


public class EnumClass {
  public EnumClass() {
  }

  /**
   * 当创建枚举类型时，编译器会为你生成一个辅助类，这个类自动继承自
   * java.lang.Enum。java.lang.Enum提供了下例所示的一些功能
   */
  public void enumPower() {
    System.out.println(Planet.MARS.name());
    System.out.println(Planet.MARS.ordinal());
    System.out.println(Planet.MARS.getResponse());
    System.out.println(Planet.MARS);
    System.out.println("\n");
    System.out.println(Arrays.toString(Planet.values()));
  }

  /**
   * 根据字符串名生成一个枚举值
   */
  public void fromString() {
    for(String s :
      "HANGING CRAWLING GROUND".split(" ")) {
      Shrubbery shrub =
        Enum.valueOf(Shrubbery.class, s);
      System.out.println(shrub);
    }
  }




}
