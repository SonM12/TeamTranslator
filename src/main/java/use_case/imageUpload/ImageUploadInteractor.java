package use_case.imageUpload;

import use_case.translateText.DataAccessException;

/**
 * The ImageUpload Interactor.
 */
public class ImageUploadInteractor implements ImageUploadInputBoundary {

    private final ImageUploadDataAccessInterface imageUploadDataAccess;
    private final ImageUploadOutputBoundary imageUploadOutputBoundary;

    public ImageUploadInteractor(ImageUploadDataAccessInterface imageUploadDataAccessObject,
                                 ImageUploadOutputBoundary imageUploadPresenter) {
        this.imageUploadDataAccess = imageUploadDataAccessObject;
        this.imageUploadOutputBoundary = imageUploadPresenter;
    }

    /**
     * Executes the Image Upload Use Case.
     *
     * @param imageUploadInputData the input data.
     */
    @Override
    public void execute(ImageUploadInputData imageUploadInputData) {

        try {
            final String inputText = imageUploadDataAccess.getText(imageUploadInputData.getImageFile());
            final ImageUploadOutputData outputData = new ImageUploadOutputData(inputText);
            imageUploadOutputBoundary.prepareSuccessView(outputData);
        }

        catch (DataAccessException ex) {
            imageUploadOutputBoundary.prepareFailView(ex.getMessage());
        }
    }
}