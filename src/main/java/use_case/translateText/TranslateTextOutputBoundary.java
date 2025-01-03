package use_case.translateText;

/**
 * The output boundary  for the Translate Text Use Case.
 */
public interface TranslateTextOutputBoundary {
    /**
     * Prepares the success view for the TranslateText related Use Cases.
     * @param translateTextOutputData the output data
     */
    void prepareSuccessView(TranslateTextOutputData translateTextOutputData);

    /**
     * Prepares the failure view for the TranslateText related Use Cases.
     * @param errorMessage the explanation of the failure
     */
    void prepareFailView(String errorMessage);
}
