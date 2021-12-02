package ch03.item13;

public class HashTableTesterV2 {
    public static void main(String[] args) {
        HashTableV2 hashTable = new HashTableV2();
        hashTable.addBucket(1);
        hashTable.addBucket(2);
        hashTable.addBucket(3);
        hashTable.addBucket(4);
        hashTable.addBucket(5);
        System.out.println(hashTable);

        HashTableV2 clone = hashTable.clone();
        System.out.println(clone);

        hashTable.editBucket(1,10);
        System.out.println(hashTable);
        System.out.println(clone);//deep copy 성공!!

    }
}
