package TenthLesson;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Sentences2App {
  public static void main(String[] args) throws FileNotFoundException {
    // read 1st
    List<String> f1 = null;
    f1 = read("subj_verb_.txt");


    // read second
    List<String> f2 = null;

      f2 = read("verb_obj_.txt");


    // convert 1st to map
    Map<String, List<String>> sv = convert(f1);
    // convert 2nd to map
    Map<String, List<String>> vo = convert(f2);
    // combine sentences
    List<Sentence> sentences = combine(sv, vo);
    // write to file
    try {
      write("combined.txt", sentences);
    } catch (IOException e) {
      System.out.println("Such a file is not here");
      e.printStackTrace();
    }
  }

  private static List<Sentence> combine(Map<String, List<String>> sv, Map<String, List<String>> vo) {
    ArrayList<Sentence> outcome = new ArrayList<>();
//    Set<Map.Entry<String, List<String>>> entries = sv.entrySet();
//    for (Map.Entry<String, List<String>>a :entries) {
//      String key = a.getKey();
//      List<String> value = a.getValue();
//    }
    Set<String> subjs = sv.keySet();
    for (String subj: subjs) {
      List<String> verbs = sv.get(subj);
      for (String verb: verbs) {
        List<String> objs = vo.get(verb);
        for (String obj: objs) {
          Sentence s = new Sentence(subj, verb, obj);
          outcome.add(s);
        }
      }
    }
    return outcome;
  }

  private static Map<String, List<String>> convert(List<String> list) {
    HashMap<String, List<String>> data = new HashMap<>();
    for (String line: list) {
      String[] splitted = line.split(":");
      // Noel : wrote, chased, slept on
      // splitted[0] = `Noel `
      // splitted[1] = ` wrote, chased, slept on`
      String[] splited2 = splitted[1].split(",");
      // [0] = ` wrote` [1] = ` chased` [2] = ` slept on`
      data.put(
          splitted[0].trim(),
          Arrays.stream(splited2).map(s -> s.trim()).collect(Collectors.toList())
          // [0] = `wrote` [1] = `chased` [2] = `slept on`
      );
    }
    return data;
  }

  private static void write(String filename, List<Sentence> sentences) throws IOException {
    File file = new File(filename);
    BufferedWriter bw = new BufferedWriter(new FileWriter(file));
    for (Sentence sentence: sentences) {
      bw.write(sentence.represent());
      bw.write("\n");
    }
    bw.close();
  }



  private static List<String> read(String filename) {
    File file = new File(filename);


    try {
      return new BufferedReader(new FileReader(file)).lines().collect(Collectors.toList());
    } catch (FileNotFoundException e) {
      List<String>list=Arrays.asList(" ");
      System.out.println("not found");
      e.printStackTrace();
      return  list;
    }
  }}


