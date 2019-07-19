package edu.neu.khoury.cs5004.problem1;


// Class with a list of Integers
// Has a method that returns a List of doubles based off of the freq of each number in input list

// If map contains integer as a key, increment it
// Else, add it to the Map

// Relative frequency iterator divides count of each element by the length of the entire list

import java.util.HashMap;
import java.util.Map;
import java.util.*;

class DataCollectionFrequency {
  public static void countFrequencies(ArrayList<Integer> list)
  {
    // HashMap to store the frequency of element
    Map<Integer, Double> hm = new HashMap<Integer, Double>();

    for (Integer i : list) {
      Double j = hm.get(i);
      hm.put(i, (j == null) ? 1 : j + 1);
    }

    // displaying the occurrence of elements in the ArrayList
    for (Map.Entry<Integer, Double> val : hm.entrySet()) {
      Double freq = val.getValue() / list.size();
      System.out.println(val.getKey() + "->" + freq);
    }
  }

  public static void main(String[] args)
  {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(1);
    list.add(1);
    list.add(2);
    list.add(2);
    list.add(3);
    list.add(3);
    list.add(4);
    list.add(4);
    list.add(4);
    countFrequencies(list);  // Should print frequencies as listed in lab8 directions
  }
}