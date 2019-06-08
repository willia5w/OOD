package edu.neu.khoury.cs5004.problem2;

import com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel;

public class InvoiceSystem {
  private static final Integer BASE_RATE = 80;
  private Cleaning cleaningInvoice;
  private Painting paintingInvoice;
  private Gardening gardeningInvoice;
  private WindowCleaning windowCleaningInvoice;

  public InvoiceSystem(Cleaning cleaningInvoice, Painting paintingInvoice,
                       Gardening gardeningInvoice, WindowCleaning windowCleaningInvoice) {
    this.cleaningInvoice = cleaningInvoice;
    this.paintingInvoice = paintingInvoice;
    this.gardeningInvoice = gardeningInvoice;
    this.windowCleaningInvoice = windowCleaningInvoice;
  }

  public Cleaning getCleaningInvoice() {
    return cleaningInvoice;
  }

  public Painting getPaintingInvoice() {
    return paintingInvoice;
  }

  public Gardening getGardeningInvoice() {
    return gardeningInvoice;
  }

  public WindowCleaning getWindowCleaningInvoice() {
    return windowCleaningInvoice;
  }

  @Override
  public String toString() {
    return "InvoiceSystem{" +
        "cleaningInvoice=" + "$" + cleaningInvoice.calculatePrice() +
        ", paintingInvoice=" + "$" + paintingInvoice.calculatePrice() +
        ", gardeningInvoice=" + "$" + gardeningInvoice.calculatePrice() +
        ", windowCleaningInvoice=" + "$" + windowCleaningInvoice.calculatePrice() +
        '}';
  }
}
