package edu.neu.khoury.cs5004.problem3;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;
import java.util.Objects;

/**
 * This class represents a row of Seats in a Theater.
 */
public class Row extends ArrayList<Seat> implements IRow {
  private Integer rowNum;
  private Integer numSeats;
  private Boolean accessible;

  /**
   * Creates a Row of seats in a Theater given the Row Number, Number of Seats, and whether it is Accessible.
   * @param initialCapacity
   * @param rowNum
   * @param numSeats
   * @param accessible
   */
  public Row(int initialCapacity, Integer rowNum, Integer numSeats, Boolean accessible) {
    super(initialCapacity);
    this.rowNum = rowNum;
    this.numSeats = numSeats;
    this.accessible = accessible;
  }

  /**
   * Get the Row Number.
   * @return the Row Number.
   */
  public Integer getRowNum() {
    return rowNum;
  }

  /**
   * Get Seat from a certain part of a Row.
   * @param s Spot in the Row of Seats.
   * @return Seat from a certain part of a Row.
   */
  public Seat getSeatObject(Integer s) {
    return this.get(s);
  }

  /**
   * Get the number of Seats.
   * @return the number of Seats.
   */
  public Integer getNumSeats() {
    return numSeats;
  }

  /**
   * Get info on whether or not the Row is handicapped customer accessible.
   * @return info on whether or not the Row is handicapped customer accessible.
   */
  public Boolean getAccessible() {
    return accessible;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Row)) return false;
    if (!super.equals(o)) return false;
    Row seats = (Row) o;
    return getRowNum().equals(seats.getRowNum()) &&
        getNumSeats().equals(seats.getNumSeats()) &&
        getAccessible().equals(seats.getAccessible());
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), getRowNum(), getNumSeats(), getAccessible());
  }

  @Override
  public String toString() {
    return "Row{" +
        "rowNum=" + rowNum +
        ", numSeats=" + numSeats +
        ", accessible=" + accessible +
        '}';
  }
}
