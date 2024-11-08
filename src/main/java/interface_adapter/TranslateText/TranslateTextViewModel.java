package interface_adapter.TranslateText;

import interface_adapter.ViewModel;

/**
 * The View Model for the Login View.
 */
public class TranslateTextViewModel extends ViewModel<TranslateTextState> {

    public TranslateTextViewModel() {
        super("log in");
        setState(new TranslateTextState());
    }

}
