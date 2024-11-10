package interface_adapter.note;

import use_case.note.TranslateTextInputBoundary;

/**
 * Controller for our Note related Use Cases.
 */
public class TranslateTextController {

    private final TranslateTextInputBoundary noteInteractor;

    public TranslateTextController(TranslateTextInputBoundary noteInteractor) {
        this.noteInteractor = noteInteractor;
    }

    /**
     * Executes the Note related Use Cases.
     * @param note the note to be recorded
     */
    public void execute(String note) {
        if (note != null) {
            noteInteractor.executeSave(note);
        }
        else {
            noteInteractor.executeRefresh();
        }
    }
}
