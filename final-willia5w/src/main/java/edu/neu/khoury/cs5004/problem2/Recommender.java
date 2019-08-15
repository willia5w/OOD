package edu.neu.khoury.cs5004.problem2;

import edu.neu.khoury.cs5004.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Recommender {
  private HashMap shoppingStatistics;
  private List<Item> allItems = new ArrayList <>();

  public void getAggregatesStatistics(List <Customer> customers) {
    // For each customer
    for (int i = 0; i < customers.size(); i++) {
      // For each item list
      for (int j = 0; j < customers.get(i).getBoughtItems().size(); i++) {
        allItems.add(customers.get(i).getBoughtItems().get(j));
      }
    }
    HashMap statistics = new HashMap<Item, Integer>();
    statistics =
        (HashMap) allItems.stream().collect(
            Collectors.groupingBy(
                Function.identity(), Collectors.counting()
            )
        );
    this.shoppingStatistics = statistics;
  }

  public Item recommendMostLikelyItem() {
    if (this.allItems.size() > 0) {
      return allItems.get(0);
    } else {
      return null;
    }
  }

  public Item recommendLeastLikelyItem() {
    if (this.allItems.size() > 0) {
      return allItems.get(this.allItems.size() - 1);
    } else {
      return null;
    }
  }
}
