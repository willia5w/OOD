package edu.neu.khoury.cs5004.problem2;

public class MatrixUtils {
  private static Integer constant;
  private static Integer[][] matrix ;

  public static Integer[][] constantMultiplication(Integer[][] matrix, Integer constant) {
//    Multiplies each element of the matrix by a constant
  for () {

  }
  }

  public static Integer[][] add(Integer[][] matrixA, Integer[][] matrixB) throws IllegalArgumentException {
//    Adds 2 matrices together. Matrices must be same size
    if (matrixA.x != matrixB.x || matrixA.y != matrixB.y) {
      throw IllegalArgumentException("Error: Matrices must be same size.");
    } else {
      int new_x = matrixA.x * matrixB.x;
      int new_y = matrixA.y * matrixB.y;
      return new Integer[new_x][new_y];
    }
  }
  public static Integer[][] transpose(Integer[][] matrixA) {
//    Transposes the matrix
  }
}
