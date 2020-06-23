package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number){
       boolean prostoNumber = false ;
       for(int i = 2; i<= number;  i++ ){
       if((number%i) == 0){
           if(i == number){
           prostoNumber = true;
       }
           break;
    }
}
       return prostoNumber;
    }

}


