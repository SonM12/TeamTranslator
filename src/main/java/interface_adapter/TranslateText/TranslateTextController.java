package interface_adapter.TranslateText;

import use_case.note.TranslateTextInputBoundary;
import use_case.note.TranslateTextInputData;

/**
 * The controller for the Login Use Case.
 */
public class TranslateTextController {

    private final TranslateTextInputBoundary translateTextUseCaseInteractor;

    public TranslateTextController(TranslateTextInputBoundary translateTextUseCaseInteractor) {
        this.translateTextUseCaseInteractor = translateTextUseCaseInteractor;
    }

    /**
     * Executes the Login Use Case.
     * @param username the username of the user translate text
     * @param password the password of the user translate text
     * @param repeatPassword the repeatPassword
     */
    public void execute(String username, String password) {
        final TranslateTextInputData translateTextInputData = new TranslateTextInputData(
                username, password, repeatPassword, inputLanguage, inputText);

        translateTextUseCaseInteractor.execute(translateTextInputData);
    }
}
