import java.io.*;
import java.util.*;


public class Compressing {

public static void main(String[] args) {

  System.out.println("Welcome to the TextCompressor5000!");
  System.out.println("You are compressing \"test1.txt\"!\n\n ====================== \n");

  StringBuilder sb = new StringBuilder();

  try {
    File file = new File("test1.txt");
    Scanner fr = new Scanner(file);

    while (fr.hasNext()){
      String temp = fr.next();
      if (temp == null) {
        break;
      }
      else {
        sb.append(temp);
        sb.append("_");
      }
    }

    //System.out.println("your file:\n" + sb);
  }
  catch (FileNotFoundException e) {
    e.printStackTrace();
  }

int x = 3;

HashMap<String, Integer> comps = new HashMap<String, Integer>();
ArrayList<Integer> keys = new ArrayList<Integer>();
String temp = "";
int count = 0;
String next = "";

for (int i = 0; i < sb.length(); i++) {
  count = 0;
  next = sb.substring(i,i+x);

  for (int k = i; k < sb.length() - x; k++) {
    temp = sb.substring(k, k+x);
    if(temp.equals(next)) {
      count++;
    }
  }
  if (count > 2) {
    comps.put(i, next);
    keys.add(i);
  }
}

String example = sb.toString();
String original = example;

for (int i = 0; i < keys.size(); i++) {
  example = example.replaceAll(sb.substring(i, i+x), keys.get(i).toString());
}

for (int  y = 0; y < comps.size(); y++) {
  if(y == keys.get(x)) {
  original = original.replaceAll(example.substring(y, y+1), comps.get(y));
  }
}

System.out.println("Original:\n" + sb.toString());
System.out.println("Compressed:\n" + example);
System.out.println("Decompressed:\n" + original);

  try {
    BufferedWriter writer = new BufferedWriter(new FileWriter("testOutput.txt"));
    writer.write(sb.toString());
    writer.close();
  }
  catch (IOException e) {
    e.printStackTrace();
  }
}


}

// to reverse loop through everything in the original and find numbers and replce that number iwith that value from the hashmap
