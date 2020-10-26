package marketStore.models;

import marketStore.exceptions.NegativeTurnoverException;

public class Silver extends Card {

    public Silver(double turnover) {
        try {
            super.setTurnover(turnover);
        } catch (NegativeTurnoverException n) {
            n.printStackTrace();
        }
        this.setDiscountRate();
    }

    public void setDiscountRate() {
        if (super.getTurnover() > 300) {
            super.setDiscountRate(0.035);
        } else {
            super.setDiscountRate(0.02);
        }
    }
}
