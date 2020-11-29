package Concretes;

import Interface.CommandIF;
import Interface.ReceiverIF;

public class CommandConcrete implements CommandIF {
    ReceiverIF r;

    public CommandConcrete (ReceiverIF r){
        this.r = r;
    }

    @Override
    public void execute() {
        r.Execute();
    }
}
