package hashSet.test;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

public class HashSetTest {
   public static void main(String[] args) {
      final int SIZE = 30_000_000;
      final List<Integer> arrayList = new ArrayList<>(SIZE);   
      final Set<Integer> hashSet = new HashSet(SIZE);
      final int data = 29_000_000;
      
      IntStream.range(0, SIZE).forEach(value -> {
         arrayList.add(value);
         hashSet.add(value);
      });
      
      Instant start = Instant.now();
      arrayList.contains(data);
      Instant end = Instant.now();
      long elaspsedTime = Duration.between(start, end).toMillis();
      System.out.println("arrayList search Time: " + elaspsedTime * 0.01 + "√ ");
      
      start = Instant.now();
      hashSet.contains(data);
      end = Instant.now();
      elaspsedTime = Duration.between(start, end).toMillis();
      System.out.println("hashSet search Time: " + elaspsedTime * 0.01 + "√ ");
      
      
   }
}












