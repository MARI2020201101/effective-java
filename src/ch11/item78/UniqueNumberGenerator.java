package ch11.item78;

public class UniqueNumberGenerator {
    private static int uniqueNum;

    public int generateUniqueNum(){
        return uniqueNum++;
    }
}
