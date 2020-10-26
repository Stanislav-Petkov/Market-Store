package marketStore.models;

import marketStore.exceptions.NegativeTurnoverException;

public class Gold extends Card {
    public Gold(double turnover) {
        try {
            super.setTurnover(turnover);
        } catch (NegativeTurnoverException n) {
            n.printStackTrace();
        }
        this.setDiscountRate();
    }

    public void setDiscountRate() {
        super.setDiscountRate(0.02);
        double turnover = super.getTurnover();
        double multiplierOfDiscount = turnover / 100;
        if (multiplierOfDiscount >= 8) {
            super.setDiscountRate(0.1);
        } else {
            double newDiscount = 0.01 * multiplierOfDiscount;
            super.setDiscountRate(super.getDiscountRate() + newDiscount);
        }
    }
}
