package com.sematext.blog.java;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesExample {
  public void readFile(String filePath) {
    try (FileReader reader = new FileReader(filePath)) {
      // do something
    } catch (FileNotFoundException ex) {
      // do something when file is not found
    } catch (IOException ex) {
      // do something when issues during reader close happens
    }
  }
}
