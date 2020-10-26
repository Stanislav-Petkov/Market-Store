package marketStore.models;

import marketStore.exceptions.NegativeTurnoverException;

public class Card {
    private double turnover;
    private double discountRate;

    Card(){
    }

    public double getTurnover() {
        return turnover;
    }

    public void setTurnover(double turnover) throws NegativeTurnoverException {
        if(turnover < 0){
            throw new NegativeTurnoverException(turnover);
        }
        this.turnover = turnover;
    }

    public double getDiscountRate() {
        return this.discountRate;
    }

    public void setDiscountRate(double discountRate)  {
        this.discountRate = discountRate;
    }
}
