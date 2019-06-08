package edu.neu.khoury.cs5004.problem2;

public interface IService {

  String toString();

  int hashCode();

  boolean equals(Object obj);

  void baseFee();

  void additionalFee();

  void frequencyDiscount();

  Double calculatePrice();

}
