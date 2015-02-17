/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

/**
 *
 * @author amitchell8
 */
public class Startup {
    public static void main(String[] args) {
        TipCalculatorStrategy baggageTip = new BaggageTipCalculator(2,QualityOfService.GOOD_QUALITY);
        TipCalculatorStrategy restaurantTip = new RestaurantTipCalculator(30.00,QualityOfService.GOOD_QUALITY);
        
        TipManager tManager = new TipManager();
        
        //Baggage Calculator
        System.out.println("$" + tManager.getTip(baggageTip));
        //tManager.getTip(baggageTip);
        System.out.println("$" + tManager.getTotalWithTip(baggageTip));
        
        //Restaurant Calculator
        System.out.println("---------------");
        System.out.println("$" + tManager.getTip(restaurantTip));
        System.out.println("$" + tManager.getTotalWithTip(restaurantTip));
    }
}
