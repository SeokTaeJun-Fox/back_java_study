package lambdaTask4;

public class LambdaTask4 {
//  1. 정수를 입력하면 정수에 해당하는 구구단을 출력해주는 람다
//  입력 예시)
//  3
//  출력 예시)
//  3 x 1 = 3
//  ...
//  3 x 9 = 27 
//  GuGuDan gugudan = (dan) -> {
//     for(int i = 0; i < 9; i++) {
//        int num = i + 1;
//        System.out.printf("%d x %d = %d\n", dan, num, dan * num);
//     }
//  };
//  
//  gugudan.multiple(9);
//  
////  2. 두 개의 정수와 연산자를 전달하면 식을 완성시켜주는 람다
////  입력 예시1)
////  10, 20, "+"
//  Calculator calculator = (num1, num2, oper) -> {
//     
//     int result = 0;
//     switch(oper) {
//     case "+":
//        result = num1 + num2;
//        break;
//     case "-":
//        result = num1 - num2;
//        break;
//     case "*":
//        result = num1 * num2;
//        break;
//     case "/":
//        result = num1 / num2;
//        break;
//     default:
//        result = -1;
//        break;
//     }
//     
//     return result;
//  };
//  
//  System.out.println(calculator.calc(10, 20, "-"));
//  
////  출력 예시1)
////  30
//  
////  입력 예시2)
////  10, 20, "-"
////  
////  출력 예시2)
////  -10
//  
////  3. 배열에 10개의 무작위 정수를 전달하면,
////  큰수부터(내림차순) 정렬하여 배열에 담아 리턴(반환)해주는 메서드
////  입력 예시)
////  {10, 3, 7, 8, 0, 9}
//  
////  출력 예시)
////  {10, 9, 8, 7, 3, 0}
//  
////  선택 정렬 알고리즘
//  Sort sort = (arr) -> {
//     
//     for(int i = 0; i < arr.length -1; i++) {
//        
//        int maxIndex = i;
//        
//        for(int j = i + 1; j < arr.length; j++) {
//           if(arr[j] > arr[maxIndex]) {
//              maxIndex = j;
//           }
//        }
//        
////        swap
//        int temp = arr[i];
//        arr[i] = arr[maxIndex];
//        arr[maxIndex] = temp;
//        
//     }
//     
//     return arr;
//  };
//  
//  
//  int[] numbers = {10, 3, 7, 8, 0, 9};
//  
//  numbers = sort.sort(numbers);
//  for(int number: numbers) {
//     System.out.print(number + " ");
//  }
  
  
  
}
