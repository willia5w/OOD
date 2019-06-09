package edu.neu.khoury.cs5004.problem3;

import java.util.ArrayList;

public class Theater implements ITheater{
  private String theaterName;
  private Integer numRows;
  private ArrayList<Row> theaterRows;


  public Theater(String theaterName, Integer numRows, ArrayList <Row> theaterRows) {
    this.theaterName = theaterName;
    this.numRows = numRows;
    this.theaterRows = theaterRows;
  }

  public Boolean validateRows() {
//    if (theaterRows contains())
    for (int i = 0; i < numRows; i++) {
      ArrayList<Seat> row = theaterRows.get(i);
      if (((Row) row).getAccessible() == true) {
        return true;
      }
    }
    return false;
  }
}
