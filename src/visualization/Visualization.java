package visualization;

import chackSolution.CheckSolution;
import solution.Solution;

public class Visualization {
   int example, num;
   String expected, roman;

   void setExample(int example){
       this.example = example;
   }
   void setNum(int num){
       this.num = num;
   }
   void setExpected(String expected){
       this.expected = expected;
   }
   void setRoman(){
       Solution solution = new Solution();
       this.roman = solution.intToRoman(num);
   }

   public void setVizualization(int example, int num, String expected){
       setExample(example);
       setNum(num);
       setExpected(expected);
   }

   void printCheck(){
       CheckSolution checkSolution = new CheckSolution();
       checkSolution.setChceckSolution(expected, roman);
       if ((checkSolution.checkSolution())) {
           System.out.println(" Верный ответ");
       } else {
           System.out.println(" Не верный ответ");
       }
   }

   public void printVizualization(){
       System.out.println("============ Тест №" + example + "============");
       System.out.println(" Входное число: " + num);
       System.out.println(" Ожидаемый результат: " + expected);
       setRoman();
       System.out.println(" Полученный результат: " + roman);
       System.out.println("============ Проверка ===========");
       printCheck();
       System.out.println("============ Конец теста ===========\n");
   }
}
