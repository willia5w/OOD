package edu.neu.ccs.cs5004.problem1;

public interface IStockItem {
  // if
  Boolean checkAvailableQty();
  // then
  void reduceAvailableQty();
}
