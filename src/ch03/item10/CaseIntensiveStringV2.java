package ch03.item10;

import java.util.Objects;

public class CaseIntensiveStringV2 {
    private final String s;

    public CaseIntensiveStringV2(String s){
        this.s = Objects.requireNonNull(s);
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof CaseIntensiveStringV2 &&
                ((CaseIntensiveStringV2) obj).s.equalsIgnoreCase(s);
    }
}
