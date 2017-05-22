package behaviorparameterization;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xbbl7bx on 5/22/17.
 */
public class BehaviorParameterization {

  public static void main(String[] args){
    BoxFactory boxFactory = BoxFactory.getInstance();

    List<Box> inventory = new ArrayList<Box>();
    for(int i = 0; i < 100; i++){
      inventory.add(boxFactory.createBox());
    }

    System.out.println("Total number of boxes = " + inventory.size());

    BoxPredicate bigBoxPredicate = new BigBoxComparer();
    List<Box> bigBoxes = Box.filterBoxes(inventory, bigBoxPredicate);

    System.out.println("The number of 'big' boxes = " + bigBoxes.size());

    BoxPredicate smallBoxPredicate = new SmallBoxComparer();
    List<Box> smallBoxes = Box.filterBoxes(inventory, smallBoxPredicate);

    System.out.println("The number of 'small' boxes = " + smallBoxes.size());

    List<Box> mediumBoxes = Box.filterBoxes(inventory, new BoxPredicate(){
      public boolean test(Box b){
        return (b.getLength() > 100 && b.getLength() < 500) ||
            (b.getWidth() > 100 && b.getWidth() < 500);
      }
    });

    System.out.println("The number of 'medium' boxes = " + mediumBoxes.size());
  }

}
