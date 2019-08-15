package edu.neu.khoury.cs5004.problem2;

import java.util.Objects;

public class TruncatedString {
  private String shortenedString;

  public TruncatedString(String shortenedString) {
    this.shortenedString = shortenedString;
  }

  public String getShortenedString() {
    return shortenedString;
  }

  @Override
  public String toString() {
    return "TruncatedString{" +
        "shortenedString='" + shortenedString + '\'' +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof TruncatedString)) return false;
    TruncatedString that = (TruncatedString) o;
    return Objects.equals(getShortenedString(), that.getShortenedString());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getShortenedString());
  }
}
