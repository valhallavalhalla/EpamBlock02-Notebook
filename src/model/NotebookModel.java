package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Class represents a simple notebook functionality.
 *
 * @author Shchavinskyi Andrii
 * @version 1.0
 */
public class NotebookModel {

    private List<Note> notes;

    public NotebookModel() {
        this.notes = new ArrayList<>();
    }

    public void addNote(Note note) {
        notes.add(note);
    }

    // TODO: 14.05.16 Add more functionality

}
