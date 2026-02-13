package arrayTask;

import java.util.Iterator;
import java.util.Scanner;

public class ArrayTask06 {
	public static void main(String[] args) {
	//  마스터
	//  1. 배열이 다음과 같이 있을 때
	//  배열을 오름차순 정렬 후 출력하시오.
	  int[] arrData1 = {4, 2, 9, 1, 5};
	  
	//  최종 배열 안의 값: {1, 2, 4, 5, 9}
	//  출력 결과: 9 5 4 2 1
	  
	  for(int i = 0; i < arrData1.length - 1; i++) {
		  for(int j = 0; j < arrData1.length - i - 1; j++) {
			  int tmp = 0;
			  if(arrData1[j] > arrData1[j+1]) {
				  tmp = arrData1[j];
				  arrData1[j] = arrData1[j+1];
				  arrData1[j+1] = tmp;
			  }
		  }
	  }
	  
	  for(int i = 0; i < arrData1.length; i++) {
		  System.out.print(arrData1[arrData1.length - i - 1] + " ");
	  }
	  
	//  2. 4행 4열의 2차원 배열이 존재할 때
	  int n = 4;
	  int[][] arrData2 = new int[n][n];
	  
	//  아래와 같이 배열의 값을 넣고, 출력하시오
	//  출력 예시)
	//  0 1 0 1
	//  1 0 1 0
	//  0 1 0 1
	//  1 0 1 0
	  
	//  힌트)
	//  2차원 배열은 행부터 접근이 가능하다
	//  예를 들면 arrData[2][1]의 의미는 2행 1열의 데이터를 의미한다.
	  
      for(int i = 0; i < n; i++) {
          for(int j = 0; j < n; j++) {
             arrData2[i][j] = (i + j) % 2;
          }
       }
       
//       출력
       for(int i = 0; i < n; i++) {
          for(int j = 0; j < n; j++) {
             System.out.print(arrData2[i][j] + " ");
          }
          System.out.println();
       }
	  
	}
}
