package hashMap.task;

import java.util.HashMap;

@FunctionalInterface
public interface MyFilter {
   public void printFilterText(String findText, HashMap<String, String> datas);
}
