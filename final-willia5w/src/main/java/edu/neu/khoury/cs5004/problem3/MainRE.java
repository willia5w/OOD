package edu.neu.khoury.cs5004.problem3;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static javafx.scene.input.KeyCode.Z;

/**
 * The MainRE class uses Regex to match patterns against input strings.
 */
public class MainRE {

    /**
     * findMatch adds each match group to the resultingList individually.
     * @param stringToMatch a string to match
     * @return the list of match groups if matches made
     */
    public static List findMatch(String stringToMatch) {
        List resultingList = new ArrayList();

        Pattern re = Pattern.compile("(CS)(\\s)(\\d\\d\\d\\d)(\\s)([a-zA-Z]*)");
        Matcher matcher = re.matcher(stringToMatch);

        if (matcher.matches()) {

            for (int i = 1; i <= 5; i++) {
                resultingList.add(matcher.group(i));
            }
          return resultingList;
        }
      else return null;
    }

    /**
     * checkFormat compares a string against a Regex pattern, returning true if any matches are found.
     * @param stringToCheck a string to check
     * @return true if any
     */
    public static Boolean checkFormat(String stringToCheck) {
        Pattern format = Pattern.compile("(\\d\\d\\d)(\\s\\s\\s\\s)([A-Z]\\d[X]\\d\\d)");
        Matcher matcher = format.matcher(stringToCheck);
        if (matcher.matches()) {
            return true;
        } else {
            return false;
        }
    }
}
