package edu.neu.khoury.cs5004.problem4;

import java.util.List;

/*Class AlpineSkier contains information about an alpine skier, and the list of 
their times, as defined for racing discipline: slalom time, giant slalom time, 
super giant slalom time, combined time and downhill time.
 */
public class AlpineSkier implements Comparable<AlpineSkier> {

  private String name;
  private List<Double> slalomTime;
  private List<Double> giantSlalomTime;
  private List<Double> superGiantSlalomTime;
  private List<Double> combinedTIme;
  private List<Double> downhillTime;

  /*
   * Constructor for an object AlpineSkier, based on the provided input arguments.
   * @param name - String, skier's name
   * @param model - String, make of a vehicle
   * @param slalomTime - list of skier's slalom times
   * @param giantSlalomTime - list of skier's giant slalom times
   * @param superGiantSlalomTime - list of skier's super giant slalom times
   * @param combinedTime - list of skier's combined times
   * @param downhillTime - list of skier's downhill times
   */
  public AlpineSkier(String name, List<Double> slalomTime, List<Double> giantSlalomTime,
                                  List<Double> superGiantSlalomTime, List<Double> combinedTIme,
                                  List<Double> downhillTime) {
    this.name = name;
    this.slalomTime = slalomTime;
    this.giantSlalomTime = giantSlalomTime;
    this.superGiantSlalomTime = superGiantSlalomTime;
    this.combinedTIme = combinedTIme;
    this.downhillTime = downhillTime;
  }

  public String getName() {
    return name;
  }

  public List<Double> getSlalomTime() {
    return slalomTime;
  }

  public List<Double> getGiantSlalomTime() {
    return giantSlalomTime;
  }

  public List<Double> getSuperGiantSlalomTime() {
    return superGiantSlalomTime;
  }

  public List<Double> getCombinedTIme() {
    return combinedTIme;
  }

  public List<Double> getDownhillTime() {
    return downhillTime;
  }

  @Override
  public int compareTo(AlpineSkier otherSkier) {
    Double thisRunner5kTotal = this.fiveKRaceTimes.stream().mapToDouble(Double::doubleValue).sum();
    Double thisRunner5kAvg = thisRunner5kTotal/this.fiveKRaceTimes.size();

    Double otherRunner5kTotal = otherRunner.getFiveKRaceTimes().stream().mapToDouble(Double::doubleValue).sum();
    Double otherRunner5kAvg = otherRunner5kTotal/otherRunner.getFiveKRaceTimes().size();

    if (thisRunner5kAvg.equals(otherRunner5kAvg)) {
      return 0;
    } else if (thisRunner5kAvg > otherRunner5kAvg) {
      return 1;
    } else {
      return -1;
    }





    return 0;
  }
}
