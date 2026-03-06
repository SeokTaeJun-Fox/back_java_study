package collectionTest2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class CollectionTest2 {
	public static void main(String[] args) {
		ArrayList<ObjTest> ar = new ArrayList<ObjTest>();
		ar.add(new ObjTest("¿äÄÚÇÏ¸¶½Ã ½Å¸²µ¿", "šÃ¹ú³ğ1"));
		ar.add(new ObjTest("¾ÆÀÌÄ¡Çö ¿ª»ïµ¿", "šÃ¹ú³ğ2"));
		ar.add(new ObjTest("¿äÄÚÇÏ¸¶½Ã ºÀÃµµ¿", "šÃ¹ú³ğ3"));
		ar.add(new ObjTest("½ÅÁÖÄí±¸ Àá½Çµ¿", "šÃ¹ú³ğ4"));
		ar.add(new ObjTest("ÀÏº» ÀÌ½Ã¹«¶ó", "šÃ¹ú³ğ5"));
		ar.add(new ObjTest("ÀÏº» È«´ë", "šÃ¹ú³ğ6"));
		ar.add(new ObjTest("´ÏÈ¥¹Ù½Ã ÇÕÁ¤µ¿", "šÃ¹ú³ğ7"));
		ar.add(new ObjTest("¾ÆÀÌÄ¡Çö ³íÇöµ¿ ", "šÃ¹ú³ğ8"));
		ar.add(new ObjTest("¾ÆÀÌÄ¡Çö ³íÇöµ¿ ", "šÃ¹ú³ğ81"));
		ar.add(new ObjTest("ÀÏº» ¿©ÀÇµµ", "šÃ¹ú³ğ9"));
		ar.removeIf(x -> x.id.contains("¿äÄÚÇÏ¸¶½Ã"));
		
		List<String> nl = ar.stream().map(x -> x.id).filter(x -> x.contains("ÀÏº»")).toList();
		
	}
}
