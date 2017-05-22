package behaviorparameterization;

import java.util.Random;

/**
 * Created by xbbl7bx on 5/22/17.
 */
public class BoxFactory {

  private static BoxFactory ourInstance = new BoxFactory();

  public static BoxFactory getInstance() {
    return ourInstance;
  }

  public Box createBox(){
    Random randomGenerator = new Random();
    double randomLength = randomGenerator.nextInt(1000) + 1;
    double randomWidth = randomGenerator.nextInt(1000) + 1;

    return new Box(randomLength, randomWidth);
  }

  private BoxFactory() {

  }
}
