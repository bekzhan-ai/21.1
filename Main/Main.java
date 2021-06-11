package Main;

import java.util.ArrayList;


public class Main {
    static void calculationOfCylinderVolume(int baseRadius, int height) throws NegativeValueException {

        if(baseRadius < 0 || height < 0){
            throw new NegativeValueException("\nОшибка! Число ниже нуля! Ошибка произошла из-за: " + "\nbaseRadius: " + baseRadius + "\nheight: " + height);




        }

        System.out.println("baseRadius: " + baseRadius + "\nheight: " + height);

    }

    public static void main(String[] args) {
        ArrayList<Integer>baseRadiusArrList = new ArrayList<>();
        ArrayList<Integer>heightArrList = new ArrayList<>();

        baseRadiusArrList.add(3);
        baseRadiusArrList.add(-6);
        baseRadiusArrList.add(11);
        baseRadiusArrList.add(-5);
        baseRadiusArrList.add(22);
        heightArrList.add(11);
        try {
            calculationOfCylinderVolume(baseRadiusArrList.get(0), heightArrList.get(0));
            calculationOfCylinderVolume(baseRadiusArrList.get(1), heightArrList.get(0));
            calculationOfCylinderVolume(baseRadiusArrList.get(2), heightArrList.get(0));
            calculationOfCylinderVolume(baseRadiusArrList.get(3), heightArrList.get(0));
            calculationOfCylinderVolume(baseRadiusArrList.get(4), heightArrList.get(0));
        }catch (NegativeValueException ex) {
            System.out.println(ex.getMessage());
        }








    }


}

