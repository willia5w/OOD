package edu.neu.khoury.cs5004.problem3;

import java.util.ArrayList;
import java.util.Objects;

/**
 * This class represents a Seat in a Theater.
 *
 */
public class Seat implements ISeat{
  private String seatName;
  private String reservedFor;

  /**
   * Creates a Seat given it's Name and who it is reserved for.
   * @param seatName
   * @param reservedFor
   */
  public Seat(String seatName, String reservedFor) {
    this.seatName = seatName;
    this.reservedFor = reservedFor;
  }

  /**
   * Get the name of the Seat.
   * @return the name of the Seat
   */
  public String getSeatName() {
    return seatName;
  }

  /**
   * Get the name of the person who reserved the Seat.
   * @return the person who reserved the Seat.
   */
  public String getReservedFor() {
    return reservedFor;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Seat)) return false;
    Seat seat = (Seat) o;
    return seatName.equals(seat.seatName) &&
        Objects.equals(reservedFor, seat.reservedFor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(seatName, reservedFor);
  }

  @Override
  public String toString() {
    return super.toString();
  }
}
