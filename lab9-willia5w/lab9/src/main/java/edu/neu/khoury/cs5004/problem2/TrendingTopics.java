package edu.neu.khoury.cs5004.problem2;

// Inspired by Mkyong.com example from class using identity() method from Function interface

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TrendingTopics {
//      • Seattle → 3
//      • wildfires → 2
//      • DEFCON26 → 2
//      • NEU → 3
  List<String> topics =
      Arrays.asList("Seattle", "wildfires", "DEFCON26", "NEU", "NEU", "Seattle", "Seattle", "NEU", "DEFCON26",
          "wildfires" );

  /**
   * Prints count of each unique topic in the list of topics
   * @param topics, an input List of Strings
   * @return number of occurences of every String in the input list
   */
  public static void countTopics(List <String> topics) {

      Map<String, Long> counts =
          topics.stream().collect(
              Collectors.groupingBy(
                  Function.identity(), Collectors.counting()
              )
          );
      System.out.println(counts);
  }
}
