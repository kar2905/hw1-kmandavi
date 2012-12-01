/**
 * This file generates a Hash Set from a CSV
 */
package hw1.kmandavi;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;

public class CSVToHashMap {
  private BufferedReader in;
  FileReader file;
  private String nextSentence;
  public HashSet genes= new HashSet();


  /**
   * The public constructor reads a CSV and generates a HashSet
   */
  public CSVToHashMap(){
    try {
      //file = new FileReader("src/main/resources/genenames.csv");
      file = new FileReader("genenames.csv");

    } catch (FileNotFoundException e) {
      e.printStackTrace();
      try {
        file = new FileReader("src/main/resources/genenames.csv");
      } catch (FileNotFoundException e1) {
        // TODO Auto-generated catch block
        e1.printStackTrace();
      }
    }
    System.out.println("Generating HashSet");

    in = new BufferedReader(file);
    try {
      while ( (nextSentence = in.readLine()) != null){
        genes.add(nextSentence);
        }
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    System.out.println(genes.size());
    
  }
  
  /**
   * Checks if the string is present in the HashSet
   * @param gene string to search in the HashSet
   * @return True/False depending on whether the string is present 
   */
  public boolean findGene(String gene){
    return genes.contains(gene);
  }
  
    
  }


