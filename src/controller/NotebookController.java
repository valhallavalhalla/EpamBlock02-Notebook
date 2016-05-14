package controller;

import constans.RegularExpressionsConstants;
import model.*;
import view.NotebookView;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * This class represents a controller for notebook entry.
 * Controller validate user input for notebook entry and
 * create entry if all input valid.
 *
 * @author Andrii Shchavinskyi
 * @version 1.0
 */
public class NotebookController {

    // Constructor
    NotebookModel notebookModel;
    NotebookView notebookView;

    public NotebookController(NotebookModel notebookModel, NotebookView notebookView) {
        this.notebookModel = notebookModel;
        this.notebookView = notebookView;
    }

    // The Work method
    public void processUser(){
        Scanner sc = new Scanner(System.in);

        notebookView.printMessage(NotebookView.GREETING);

        String lastName = inputValueWithScannerAndValidation(sc, NotebookView.LAST_NAME_INPUT,
                RegularExpressionsConstants.NAME);

        String firstName = inputValueWithScannerAndValidation(sc, NotebookView.FIRST_NAME_INPUT,
                RegularExpressionsConstants.NAME);

        String middleName = inputValueWithScannerAndValidation(sc, NotebookView.MIDDLE_NAME_INPUT,
                RegularExpressionsConstants.NAME);

        String nickName = inputValueWithScannerAndValidation(sc, NotebookView.NICKNAME_INPUT,
                RegularExpressionsConstants.NICKNAME);

        String comment = inputValueWithScannerAndValidation(sc, NotebookView.COMMENT_INPUT,
                RegularExpressionsConstants.COMMENT);

        ContactGroup contactGroup = ContactGroup.valueOf(inputValueWithScannerAndValidation(sc,
                NotebookView.GROUP_INPUT, RegularExpressionsConstants.GROUP).toUpperCase());

        String homePhoneNumber = inputValueWithScannerAndValidation(sc, NotebookView.HOME_PHONE_INPUT,
                RegularExpressionsConstants.PHONE);

        String mobilePhoneNumber = inputValueWithScannerAndValidation(sc, NotebookView.MOBILE_PHONE_INPUT,
                RegularExpressionsConstants.PHONE);

        String emailAddress = inputValueWithScannerAndValidation(sc, NotebookView.EMAIL_INPUT,
                RegularExpressionsConstants.EMAIL);

        String skypeName = inputValueWithScannerAndValidation(sc, NotebookView.SKYPE_NAME_INPUT,
                RegularExpressionsConstants.SKYPE);

        String postalCode = inputValueWithScannerAndValidation(sc, NotebookView.POSTAL_CODE_INPUT,
                RegularExpressionsConstants.POSTAL_CODE);

        String cityName = inputValueWithScannerAndValidation(sc, NotebookView.CITY_NAME_INPUT,
                RegularExpressionsConstants.CITY);

        String streetName = inputValueWithScannerAndValidation(sc, NotebookView.STREET_NAME_INPUT,
                RegularExpressionsConstants.STREET);

        String buildingNumber = inputValueWithScannerAndValidation(sc, NotebookView.BUILDING_NUMBER_INPUT,
                RegularExpressionsConstants.BUILDING);

        String apartmentNumber = inputValueWithScannerAndValidation(sc, NotebookView.APARTMENT_NUMBER_INPUT,
                RegularExpressionsConstants.APARTMENT);

        notebookModel.addNote(new Note(lastName, firstName, middleName, nickName, comment,
                contactGroup, homePhoneNumber, mobilePhoneNumber, emailAddress, skypeName,
                postalCode, cityName, streetName, buildingNumber, apartmentNumber));

        notebookView.printMessage(NotebookView.NOTE_SUCCESSFULLY_CREATED);
        notebookView.printMessage(NotebookView.BYE);
    }

    // The Utility methods
    private String inputValueWithScannerAndValidation(Scanner sc, String infoMessage, String regex) {
        notebookView.printMessage(infoMessage);
        String inputData = sc.nextLine();
        while (!validateInputData(inputData, regex)) {
            notebookView.printMessage(NotebookView.INVALID_INPUT);
            inputData = sc.nextLine();
        }
        return inputData;
    }

    private boolean validateInputData(String data, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(data);
        return matcher.matches();
    }
}
