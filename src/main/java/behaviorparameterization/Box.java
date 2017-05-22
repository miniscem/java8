package behaviorparameterization;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xbbl7bx on 5/22/17.
 */
public class Box {

  private double length;
  private double width;

  public double getLength() {
    return length;
  }

  public double getWidth() {
    return width;
  }

  Box(double length, double width){
    this.length = length;
    this.width = width;
  }

  public static List<Box> filterBoxes(List<Box> boxes, BoxPredicate predicate){
    List<Box> returnedBoxes = new ArrayList<Box>();

    for(Box box : boxes){
      if(predicate.test(box)){
        returnedBoxes.add(box);
      }
    }

    return returnedBoxes;
  }

  public String toString(){
    return "length = " + length + ", width=" + width;
  }

}
