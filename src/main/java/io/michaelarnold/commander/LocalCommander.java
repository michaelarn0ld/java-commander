package io.michaelarnold.commander;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class LocalCommander implements Commander {

    @Setter
    private String command;

    @Override
    public void execute() {
    }

}
