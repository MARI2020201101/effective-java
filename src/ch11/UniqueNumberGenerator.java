package ch11;

public class UniqueNumberGenerator {
    private static int uniqueNum;

    public int generateUniqueNum(){
        return uniqueNum++;
    }
}
