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
public class TipManager {
    private TipCalculatorStrategy tipCalculator;
    
    public double getTip(TipCalculatorStrategy tipCalculator){
        return tipCalculator.getTipAmount();
    }
    
    public double getTotalWithTip(TipCalculatorStrategy tipCalculator){
        return tipCalculator.getTotalAmountWithTip();
    }
}
