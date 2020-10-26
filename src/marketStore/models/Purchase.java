package marketStore.models;

import marketStore.exceptions.NegativePurchaseValueException;

public class Purchase {
    private double purchaseValue;
    private Card card;
    private double discountValue;
    private double totalValue;

    public Purchase(double purchaseValue,Card card) {
        try {
            this.setPurchaseValue(purchaseValue);
        }catch (NegativePurchaseValueException n){
            n.printStackTrace();
        }
        this.card = card;
    }

    public void setPurchaseValue(double purchaseValue) throws NegativePurchaseValueException {
        if(purchaseValue < 0){
            throw new NegativePurchaseValueException(purchaseValue);
        }
        this.purchaseValue = purchaseValue;
    }

    public double getPurchaseValue() {
        return this.purchaseValue;
    }

    public double getDiscountValue(){
        discountValue = this.purchaseValue * this.card.getDiscountRate();
        return discountValue;
    }

    public double getTotalValue(){
        this.totalValue = this.purchaseValue - this.discountValue;
        return this.totalValue;
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Purchase value: $")
                .append(String.format("%.2f",this.purchaseValue))
                .append(System.lineSeparator())
                .append("Discount rate: ")
                .append(String.format("%.1f",this.card.getDiscountRate() * 100))
                .append("%")
                .append(System.lineSeparator())
                .append("Discount: $")
                .append(String.format("%.2f",this.getDiscountValue()))
                .append(System.lineSeparator())
                .append("Total: $")
                .append(String.format("%.2f",this.getTotalValue()));

        return builder.toString();
    }
}
