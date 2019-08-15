package edu.neu.khoury.cs5004.problem4;

import java.util.Comparator;

public class DownhillTimeComparator implements Comparator<AlpineSkier> {


  /**
   * Compares skier o1's fastest DH time VS skier o1's fastest DH
   * @param o1 skier 1
   * @param o2 skier 2
   * @return 0 if fastest times equal, 1 if skier 1 faster, 2 if skier 2 faster
   */
  @Override
  public int compare(AlpineSkier o1, AlpineSkier o2) {
    Double o1FastestDownhillTime = o1.getDownhillTime().get(0);

    Double o2FastestDownhillTime = o2.getDownhillTime().get(0);


    if (o1FastestDownhillTime .equals(o2FastestDownhillTime)) {
      return 0;
    } else if (o1FastestDownhillTime > o2FastestDownhillTime) {
      return 1;
    } else {
      return -1;
    }
  }
}
