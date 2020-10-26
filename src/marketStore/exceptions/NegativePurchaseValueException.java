package marketStore.exceptions;

public class NegativePurchaseValueException extends Exception
{
    public NegativePurchaseValueException()
    {
        super();
    }
    public NegativePurchaseValueException(double value)
    {
        super("Negative purchase value: " + value +
                " You should change the purchase value to a positive number.");
    }
}
