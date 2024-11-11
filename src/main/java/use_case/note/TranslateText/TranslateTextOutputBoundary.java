package use_case.note.TranslateText;

/**
 * The output boundary for the Signup Use Case.
 */
public interface TranslateTextOutputBoundary {

    /**
     * Prepares the success view for the Signup Use Case.
     * @param outputData the output data
     */
    void prepareSuccessView(TranslateTextOutputData outputData);

    /**
     * Prepares the failure view for the Signup Use Case.
     * @param errorMessage the explanation of the failure
     */
    void prepareFailView(String errorMessage);

    /**
     * Switches to the Login View.
     */
    void switchToLoginView();
}
