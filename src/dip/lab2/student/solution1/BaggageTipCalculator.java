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
public class BaggageTipCalculator implements TipCalculatorStrategy {
    private QualityOfService service;
    private int numberOfBags;
    
    //Would be available for editing if desired, missing getter/setter if needed
    private final double baseRate=5.00;
    
    //set amounts for the tip percentage
    //changed interface so these are no longer required
//    private final static double GOOD_PERCENT = 0.20;
//    private final static double OK_PERCENT = 0.15;
//    private final static double LOW_PERCENT = 0.10;
    public BaggageTipCalculator(int numberOfBags,QualityOfService service){
       setNumberOfBags(numberOfBags);
       setService(service);
    }

    public final QualityOfService getService() {
        return service;
    }

    public final void setService(QualityOfService service) {
        this.service = service;
    }

    public final int getNumberOfBags() {
        return numberOfBags;
    }

    public final void setNumberOfBags(int numberOfBags) {
        this.numberOfBags = numberOfBags;
    }
    
    //Override the method from the interface
    
    @Override
    public double getTipAmount() {
        return calculateTip();
    }
    
    @Override
    public double getTotalAmountWithTip(){
        return calculateTotalWithTip();
    }
    
    //hidden methods used for tip calculations
    private double calculateTip() {
        double tip;
        tip=baseRate*numberOfBags*getQualityPercentage(service);
        return tip;
    }
    
    private double calculateTotalWithTip() {
        double tip;
        double total;
        tip=baseRate*numberOfBags*getQualityPercentage(service);
        total = baseRate*numberOfBags + tip;
        return total;
    }
    
    private double getQualityPercentage(QualityOfService service) {
        switch (service) {
            case GOOD_QUALITY:
                return GOOD_PERCENT;
            case OK_QUALITY:
                return OK_PERCENT;
            case LOW_QUALITY:
                return LOW_PERCENT;
            default:
                return 0.00;
        }
    }
    
}
