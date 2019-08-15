package edu.neu.khoury.cs5004.problem2;

import java.util.ArrayList;
import java.util.List;

public class StringTruncator {

  public static List<TruncatedString> truncate(List<String> strings){
    List processedStrings = new ArrayList();
    for (int i = 0; i < strings.size(); i++) {
      String curString = strings.get(i);
      Integer origLen = curString.length();
      if (origLen > 8) {
        curString.substring(0,7);
      }
      TruncatedString truncated = new TruncatedString(curString);
      processedStrings.add(curString + ", ");
      processedStrings.add(truncated + ", ");
      String info = "length: " + origLen.toString();
      processedStrings.add(info);
    }
    return processedStrings;
  }
}
