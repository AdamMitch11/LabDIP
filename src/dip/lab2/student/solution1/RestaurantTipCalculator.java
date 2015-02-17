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
public final class RestaurantTipCalculator implements TipCalculatorStrategy{
    private double billAmount;
    private QualityOfService service;
    
    //set amounts for the tip percentage
    //No longer needed, used in interface
//    private final static double GOOD_PERCENT = 0.20;
//    private final static double OK_PERCENT = 0.15;
//    private final static double LOW_PERCENT = 0.10;
//    
    public RestaurantTipCalculator(double billAmount,QualityOfService service){
       setBillAmount(billAmount);
       setService(service);
    }

    //getters and setters
    public final QualityOfService getService() {
        return service;
    }

    public final void setService(QualityOfService service) {
        this.service = service;
    }

    public final double getBillAmount() {
        return billAmount;
    }

    public final void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
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
        tip=billAmount*getQualityPercentage(service);
        return tip;
    }
    
    private double calculateTotalWithTip() {
        double tip;
        double total;
        tip=billAmount*getQualityPercentage(service);
        total = billAmount + tip;
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
