package edu.neu.khoury.cs5004.problem3;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TheaterTest {
  public Theater theater;
  public Row row;

  @Before
  public void setUp() throws Exception {
    theaterRows = new ArrayList <Row>();

    theater = new Theater("AMC", 3, theaterRows);

  }

  @Test
  public Boolean validateRows() {

    for (int i = 0; i < numRows - 1; i++) { // For Rows in Theater
      // First Row will be accessible
      if (i == 0) {
        ArrayList <Row> row = new ArrayList <Seat>(row.getNumSeats(), row.getRowNum(), true);
        for (Integer j = 0; j = row.getNumSeats - 1; j++) { // For Seats in Row
          Seat seat = new Seat(Character.toString((char) (j + 'A')), null);
          row.add(seat);
        }
      }

      if (i > 0) {
        ArrayList <Row> row = new ArrayList <Seat>(row.getNumSeats(), row.getRowNum(), false);
        for (Integer j = 0; j = row.getNumSeats - 1; j++) {
          Seat seat = new Seat(Character.toString((char) (j + 'A')), null);
          Row.add(seat);
        }
      }
    }
    assert true;
  }
}