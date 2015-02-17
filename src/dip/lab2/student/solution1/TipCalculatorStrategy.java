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
public interface TipCalculatorStrategy {
    public static final double GOOD_PERCENT = 0.20;
    public static final double OK_PERCENT = 0.15;
    public static final double LOW_PERCENT = 0.10;
    
    public abstract double getTipAmount();
    public abstract double getTotalAmountWithTip();
}
