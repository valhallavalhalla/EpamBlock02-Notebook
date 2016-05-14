
import controller.NotebookController;
import model.*;
import view.NotebookView;

/**
 * @author Andrii Shchavinskyi
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        // Initialization
        NotebookModel notebookModel = new NotebookModel();
        NotebookView notebookView = new NotebookView();
        NotebookController notebookController = new NotebookController(notebookModel, notebookView);
        // Run
        notebookController.processUser();
    }

}
