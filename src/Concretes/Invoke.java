package Concretes;

import Interface.CommandIF;

public class Invoke {
    CommandIF c;

    public void storeCommand (CommandIF c){
        this.c = c;
    }

    public void invoke(){c.execute();
    }

}
