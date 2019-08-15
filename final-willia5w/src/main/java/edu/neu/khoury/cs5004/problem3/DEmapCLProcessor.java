package edu.neu.khoury.cs5004.problem3;

import com.sun.tools.corba.se.idl.InvalidArgument;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DEmapCLProcessor {

  public static void main(String[] args) throws IllegalArgumentException {

    if (args.length < 7) {

        List <String> arguments = new ArrayList <>(Arrays.asList(args));

        Boolean containsEmail = false;

        for (int i = 0; i < arguments.size(); i++) {
          if (arguments.get(i).contains("@")) {
            String ipAddress = arguments.get(i);
            containsEmail = true;
            arguments.remove(i);
          }
        }

        if (containsEmail == false) {
          throw new IllegalArgumentException("Error: Email not provided.");
        }
        String protocolTypeFlag = "UDP";

        while (arguments.size() >= 1) {
          String currentArg = arguments.remove(0);
          switch (currentArg) {
            case "f":
              Boolean scanTypeFlag = true;
            case "p":
              Integer port = Integer.parseInt(arguments.remove(0));
            case "sT":
              protocolTypeFlag = "TCP";
            case "SU":
              protocolTypeFlag = "UDP";
            default:
              String outputFlag = currentArg;
          }
        }
        return new DEMapData(ipAddress, protocolTypeFlag, scanTypeFlag, port, outputFlag);
      } else{
        throw new IllegalArgumentException("Too many args.");
      }
    }
  }
}
