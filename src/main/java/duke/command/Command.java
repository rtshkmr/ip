package duke.command;

import java.io.IOException;
import java.util.ArrayList;

import duke.TaskList;
import duke.exception.DukeException;
import duke.ui.Ui;


/**
 * A command can be executed on and can be an Exit Command
 */
public interface Command {
    String execute(TaskList tasks, Ui ui) throws DukeException, IOException;
    boolean isExit();
    /**
     * Converts an ArrayList of response lines into a single String response; default utility function used by
     * implementors of the Command Interface
     *
     * @param lines ArrayList of lines that represent a response
     *
     * @return Combined String response
     */
    static String listLinesToString(ArrayList<String> lines) {
        StringBuilder builder = new StringBuilder();
        for (String line : lines) {
            builder.append(line).append("\n");
        }
        return builder.toString();
    }
}
