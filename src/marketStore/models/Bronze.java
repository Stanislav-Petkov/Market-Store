package marketStore.models;

import marketStore.exceptions.NegativeTurnoverException;

public class Bronze extends Card {

    public Bronze(double turnover) {
        try {
            super.setTurnover(turnover);
        } catch (NegativeTurnoverException n) {
            n.printStackTrace();
        }
        this.setDiscountRate();
    }

    public void setDiscountRate() {
        if (super.getTurnover() < 100) {
            super.setDiscountRate(0);
        } else if (super.getTurnover() >= 100 && super.getTurnover() <= 300) {
            super.setDiscountRate(0.01);
        } else if (super.getTurnover() > 300) {
            super.setDiscountRate(0.025);
        }
    }
}