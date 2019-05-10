package models;

import models.impl.BourbonBiscuit;
import models.impl.ParleGBiscuit;

public class BiscuitFactory {

    public static Item getSpecificBiscuitObject(String biscuitTypeString, float price, float taxPercent ) throws Exception {
        switch(BiscuitTypes.valueOf(biscuitTypeString))
        {
            case BOURBON :
                return new BourbonBiscuit(price, taxPercent);
            case PARLEG :
                return new ParleGBiscuit(price, taxPercent);
        }
        throw new Exception();

    }
}
