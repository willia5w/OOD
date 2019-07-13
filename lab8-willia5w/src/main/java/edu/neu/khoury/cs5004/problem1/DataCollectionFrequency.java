package edu.neu.khoury.cs5004.problem1;


// Class with a list of Integers
// Has a method that returns a List of doubles based off of the freq of each number in input list

// If map contains integer as a key, increment it
// Else, add it to the Map

// Relative frequency iterator divides count of each element by the length of the entire list

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
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
    countFrequencies(list);
  }
}

/*
---------------------------------HASH SET-----------------------------------------
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;


public class DataCollectionFrequency {
  public static void countFrequencies(ArrayList<Integer> list)
  {

    // Hash set is created and elements of
    // ArrayList are inserted into it
    Set<Integer> st = new HashSet<Integer>(list);
    for (Integer s : st)
      System.out.println(s + ": " + Collections.frequency(list, s));
  }

  public static void main(Integer[] args)
  {
    ArrayList<Integer> list = new ArrayList<Integer>();
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
    countFrequencies(list);
  }
}
*/

