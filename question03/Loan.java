/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question03;

/**
 *
 * @author S542298
 */
public class Loan {
    
    private final double principleAmount;
    private final double rateOfInterest;
    private final int repaymentPeriod;

    public Loan(double principleAmount, double rateOfInterest, int repaymentPeriod) {
        this.principleAmount = principleAmount;
        this.rateOfInterest = rateOfInterest;
        this.repaymentPeriod = repaymentPeriod;
    }

    public double getPrincipleAmount() {
        return principleAmount;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public int getRepaymentPeriod() {
        return repaymentPeriod;
    }
    
    public double calculateEMI(){
      double x=Math.pow((1+rateOfInterest),repaymentPeriod);  
    double emi=(principleAmount*rateOfInterest*x)/(x-1);
    return emi;
    }

    @Override
    public String toString() {
        return "principle Amount is: " + principleAmount + "\nrate Of Interest is: " + rateOfInterest + "\nrepayment Period: " + repaymentPeriod +"years"+
                "\nemi paid for month: "+calculateEMI();
    }
    


}
