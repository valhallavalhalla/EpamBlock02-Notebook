package view;

import model.NotebookModel;

/**
 * Class provides simple text user interface that consist of
 * messages for user, to inform him which data need to be
 * entered for using {@link NotebookModel} model.
 *
 * @author Andrii Shchavinskyi
 * @version 1.0
 */
public class NotebookView {

    // Text's constants
    public static final String GREETING = "Welcome to your notebook!";
    public static final String CREATE_NEW_NOTE = "Try to create note about contact info of some person " +
            "(follow the instructions).";
    public static final String LAST_NAME_INPUT = "Enter last name (for example: Smith, Shevchenko): ";
    public static final String FIRST_NAME_INPUT = "Enter first name (for example: Bill, Al'ar, Anne-Marie): ";
    public static final String MIDDLE_NAME_INPUT = "Enter middle name (for example: Ivanovich, d'Arc): ";
    public static final String NICKNAME_INPUT = "Enter nickname (for example: JAVA_GURU-10500): ";
    public static final String COMMENT_INPUT = "Enter comment (optional): ";
    public static final String GROUP_INPUT = "Enter contact group (family, friends, work or other): ";
    public static final String HOME_PHONE_INPUT = "Enter home phone number " +
            "(for example: +38(800)555-35-35): ";
    public static final String MOBILE_PHONE_INPUT = "Enter mobile phone number " +
            "(for example: +38(800)555-35-35): ";
    public static final String EMAIL_INPUT = "Enter email address: ";
    public static final String SKYPE_NAME_INPUT = "Enter skype name: ";
    public static final String POSTAL_CODE_INPUT = "Enter postal code (for example: 08200): ";
    public static final String CITY_NAME_INPUT = "Enter city name: ";
    public static final String STREET_NAME_INPUT = "Enter street name: ";
    public static final String BUILDING_NUMBER_INPUT = "Enter building number (for example: 221b, 77): ";
    public static final String APARTMENT_NUMBER_INPUT = "Enter apartment number (for example: 14): ";
    public static final String INVALID_INPUT = "Invalid input! Try again.";
    public static final String NOTE_SUCCESSFULLY_CREATED = "New note successfully created!";
    public static final String BYE = "Program closing. Bye!";

    public void printMessage(String message){
        System.out.println(message);
    }

}
