package ve.com.abicelis.creditcardexpensemanager.enums;

/**
 * Created by Alex on 6/8/2016.
 */
public enum CreditCardType {

    AMEX("American Express"),
    DISCOVER("Discover"),
    MASTERCARD("Master-Card"),
    VISA("Visa");

    private String mFriendlyName;

    CreditCardType(String friendlyName) {
        mFriendlyName = friendlyName;
    }

    public String getCode(){
        return this.name();
    }

    public String getFriendlyName() {
        return mFriendlyName;
    }

    @Override
    public String toString() {
        return mFriendlyName;
    }
}
