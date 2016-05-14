package constans;

/**
 * Contains regex that used to validate user input data.
 *
 * @author Andrii Shchavinskyi
 * @version 1.0
 */
public interface RegularExpressionsConstants {

    String NAME = "[a-zA-z]+(['-][a-zA-Z]+)*";
    String COMMENT = ".*";
    String NICKNAME="^[A-Za-z0-9_-]+$";
    String GROUP = "family|friends|work|other";
    String PHONE = "^\\+\\d{2}\\(\\d{3}\\)\\d{3}-\\d{2}-\\d{2}$";
    String EMAIL = "^[a-z0-9_-]*(\\.[a-z0-9_-]*)*@([a-z0-9_-]\\.*)*[a-z]{2,6}$";
    String SKYPE = "[a-zA-Z][a-zA-Z0-9\\.,\\-_]{5,31}";
    String POSTAL_CODE = "\\d{5}";
    String CITY = "[a-zA-Z]+";
    String STREET = "[a-zA-Z]+";
    String BUILDING = "^[0-9]{1,3}[a-z]?$";
    String APARTMENT = "^[0-9]{1,3}$";

}
