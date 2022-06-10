package io.michaelarnold.commander;

import java.io.IOException;

/**
 * Commander is an interface that allows the caller to execute arbitrary shell commands
 */
public interface Commander {
    void setCommand(String command);
    void execute();
}
