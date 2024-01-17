package sets_and_maps.states.lookup;

public class IfElseStateLookup implements IStateLookup {
    @Override
    public String getState(String abbreviation) {
        if (abbreviation.equalsIgnoreCase("VT"))
            return "Vermont";
        else if (abbreviation.equalsIgnoreCase("MA"))
            return "Massachusetts";
        else if (abbreviation.equalsIgnoreCase("ME"))
            return "Maine";
        else if (abbreviation.equalsIgnoreCase("NH"))
            return "New Hampshire";
        else if (abbreviation.equalsIgnoreCase("CT"))
            return "Connecticut";
        else if (abbreviation.equalsIgnoreCase("RI"))
            return "Rhode Island";
        else
            return "Sorry, I only know New England states.";
    }
}
