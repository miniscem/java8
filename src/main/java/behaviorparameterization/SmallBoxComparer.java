package behaviorparameterization;

/**
 * Created by xbbl7bx on 5/22/17.
 */
public class SmallBoxComparer implements BoxPredicate {

  public boolean test(Box box){
    return box.getLength() < 100 || box.getWidth() < 100;
  }
}
