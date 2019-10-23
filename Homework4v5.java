public class Homework4v5 {
    public static void main(String[] args){
        int [] loc = {25, 11, 250, 5};
        int max = loc[0];
        int min = loc[0];
        for(int i = 0; i != loc.length; i ++){
            if(loc[i] > max){
                max = loc[i];
            }
            if(loc[i] < min){
                min = loc[i];
            }
        }
        System.out.println(" min :"  + min + " " + " max : " + max);
  
   //Створіть масив, наповніть його даниими в хаотичному порядку, знайдіть найбільше та
  //      найменше значення масиву. 
    
    
    } 
}