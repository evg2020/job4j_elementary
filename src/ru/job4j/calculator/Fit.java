package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height){
        return  (height - 100) * 1.15;
            }
    public static double womanWeight(short height) {
        return (height - 110) * 1.15;
            }
        public static void main (String[]args){
            short height = 187;
            double waight = Fit.manWeight(height);
            System.out.println("Для мужиков не должен превышать " + waight + " кг"  );
            double waight1 = Fit.womanWeight(height);
            System.out.println("Для женщин шне должен превышать " + waight1 + " кг");
        }
    }


