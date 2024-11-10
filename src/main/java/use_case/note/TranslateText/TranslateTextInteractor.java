package use_case.note.TranslateText;

import entity.User;
import entity.UserFactory;

/**
 * The Signup Interactor.
 */
public class TranslateTextInteractor implements TranslateTextInputBoundary {
    private final TranslateTextUserDataAccessInterface userDataAccessObject;
    private final TranslateTextOutputBoundary userPresenter;
    private final UserFactory userFactory;

    public TranslateTextInteractor(TranslateTextUserDataAccessInterface translateTextUserDataAccessInterface,
                                   TranslateTextOutputBoundary translateTextOutputBoundary,
                                   UserFactory userFactory) {
        this.userDataAccessObject = translateTextUserDataAccessInterface;
        this.userPresenter = translateTextOutputBoundary;
        this.userFactory = userFactory;
    }

    @Override
    public void execute(TranslateTextInputData translateTextInputData) {

        if (!translateTextInputData.getPassword().equals(translateTextInputData.getRepeatPassword())) {
            userPresenter.prepareFailView("Passwords don't match.");
        }
        else {
            final User user = userFactory.create(translateTextInputData.getUsername(), translateTextInputData.getPassword());
            userDataAccessObject.save(user);

            final TranslateTextOutputData translateTextOutputData = new TranslateTextOutputData(user.getName(), false);
            userPresenter.prepareSuccessView(translateTextOutputData);
        }
    }

    @Override
    public void switchToLoginView() {
        userPresenter.switchToLoginView();
    }
}