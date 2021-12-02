package ch03.item13;

public class HashTableTester {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable();
        hashTable.addBucket(1);
        hashTable.addBucket(2);
        hashTable.addBucket(3);
        hashTable.addBucket(4);
        hashTable.addBucket(5);
        System.out.println(hashTable);

        HashTable clone = hashTable.clone();
        System.out.println(clone);

        hashTable.editBucket(1,10);
        System.out.println(hashTable);
        System.out.println(clone); //같이 바뀌고 있다....

    }
}
