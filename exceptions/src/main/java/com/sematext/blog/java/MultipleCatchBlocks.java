package com.sematext.blog.java;

import java.io.FileNotFoundException;
import java.text.ParseException;

public class MultipleCatchBlocks {
  public void run(String file) {
    try {
      readAndParse(file);
    } catch (FileNotFoundException ex) {
      // do something when file is not found
    } catch (ParseException ex) {
      // do something if the parsing fails
    }
  }

  public void runSingleCatch(String file) {
    try {
      readAndParse(file);
    } catch (FileNotFoundException | ParseException ex) {
      // do something when file is not found
    }
  }

  public void readAndParse(String file) throws FileNotFoundException, ParseException {
    // some business code
  }
}
