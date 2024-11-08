package interface_adapter.TranslateText;

import use_case.note.TranslateTextInputBoundary;
import use_case.note.TranslateTextInputData;

/**
 * The controller for the Login Use Case.
 */
public class TranslateTextController {

    private final LoginInputBoundary translateTextUseCaseInteractor;

    public TranslateTextController(LoginInputBoundary translateTextUseCaseInteractor) {
        this.translateTextUseCaseInteractor = translateTextUseCaseInteractor;
    }

    /**
     * Executes the Login Use Case.
     * @param username the username of the user logging in
     * @param password the password of the user logging in
     */
    public void execute(String username, String password) {
        final TranslateTextInputData translateTextInputData = new TranslateTextInputData(
                username, password, repeatPassword, inputLanguage, inputText);

        translateTextUseCaseInteractor.execute(translateTextInputData);
    }
}
