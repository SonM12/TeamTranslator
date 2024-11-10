package interface_adapter.TranslateText;

import use_case.note.TranslateTextInputBoundary;
import use_case.note.TranslateTextInputData;

/**
 * The controller for the Login Use Case.
 */
public class TranslateTextController implements TranslateTextInputBoundary {

    private final TranslateTextInputBoundary translateTextUseCaseInteractor;

    public TranslateTextController(TranslateTextInputBoundary translateTextUseCaseInteractor) {
        this.translateTextUseCaseInteractor = translateTextUseCaseInteractor;
    }

    /**
     * Executes the Login Use Case.
     * @param username the username of the user translate text
     * @param password the password of the user translate text
     * @param inputLanguage the language of the input text
     * @param inputText the input text for the translation
     */
    public void execute(String username, String password, String inputLanguage, String inputText) {
        final TranslateTextInputData translateTextInputData = new TranslateTextInputData(
                username, password, inputLanguage, inputText);

        translateTextUseCaseInteractor.execute(translateTextInputData);
    }
}
