package marketStore.exceptions;

public class NegativeTurnoverException extends Exception
{
    public NegativeTurnoverException()
    {
        super();
    }
    public NegativeTurnoverException(double value)
    {
        super("Negative Turnover: " + value + " You should change the turnover to a positive number.");
    }
}
