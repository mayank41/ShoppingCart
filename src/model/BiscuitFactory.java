package model;

import model.impl.BourbonBiscuit;
import model.impl.ParleGBiscuit;

public class BiscuitFactory {

    public static Item getSpecificBiscuitObject(String biscuitType) throws Exception {
        switch(BiscuitTypes.valueOf(biscuitType))
        {
            case BOURBON :
                return new BourbonBiscuit();
            case PARLEG :
                return new ParleGBiscuit();
        }
        throw new Exception();

    }
}
