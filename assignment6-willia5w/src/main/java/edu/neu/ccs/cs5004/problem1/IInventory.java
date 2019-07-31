package edu.neu.ccs.cs5004.problem1;

public interface IInventory {

  void addNewStockItem(StockItem newStockItem);

  Double calculateCurrentStockValue();
}
