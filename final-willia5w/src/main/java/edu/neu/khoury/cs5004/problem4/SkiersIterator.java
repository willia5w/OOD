package edu.neu.khoury.cs5004.problem4;

import java.util.*;

public class SkiersIterator implements Iterator {
  private Stack<AlpineSkier> skierStack;

  public SkiersIterator(ArrayList <AlpineSkier> skierList) {
    for (int i = 0; i < skierList.size(); i++) {
      AlpineSkier currentSkier = skierList.get(i);
      qualified(currentSkier);
    }
  }

  public Stack <AlpineSkier> getAlpineSkierStack() {
    return skierStack;
  }

  public void qualified(AlpineSkier skier) {
    int numSlalomRaces = skier.getSlalomTime().size();
    if (numSlalomRaces > 5) {
      skierStack.push(skier);
    }
  }

  @Override
  public boolean hasNext() {
    return !skierStack.isEmpty();
  }


  public Object next() {
    if (!hasNext()) {
      throw new NoSuchElementException("No more qualified skiers");
    }

    AlpineSkier nextSkier = skierStack.pop();
    qualified(nextSkier);
    return nextSkier.getName();
  }
}

