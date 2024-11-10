package use_case.note.TranslateText;

import use_case.note.TranslateTextInputData;

/**
 * Input Boundary for actions which are related to signing up.
 */
public interface TranslateTextInputBoundary {

    /**
     * Executes the signup use case.
     * @param translateTextInputData the input data
     */
    void execute(TranslateTextInputData translateTextInputData);

    /**
     * Executes the switch to login view use case.
     */
    void switchToLoginView();
}