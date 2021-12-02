package ch03.item10;

import java.util.Objects;

public class CaseIntensiveString {
    private final String s;

    public CaseIntensiveString(String s){
        this.s = Objects.requireNonNull(s);
    }

    public String getS() {
        return s;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof CaseIntensiveString){
            CaseIntensiveString target = (CaseIntensiveString) obj;
            return s.equalsIgnoreCase(target.s);
        }
        if(obj instanceof String){
            String target = (String) obj;
            return s.equalsIgnoreCase(target);
        }
        return false;
    }
}
