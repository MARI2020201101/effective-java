package ch03.item13;

import java.util.Arrays;

public class HashTable implements Cloneable{
    private Entry[] buckets = new Entry[10];

    private static class Entry{
        private int key;
        private int value;
        private Entry next;

        public Entry(int key, int value, Entry next){
            this.key=key;
            this.value=value;
            this.next=next;
        }
        @Override
        public String toString() {
            return "["+key + "," + value + "]";
        }

    }
    public void addBucket(int value){
        int hashCode = Integer.hashCode(value);
        buckets[hashCode] = new Entry(hashCode,value,null);
    }

    public void editBucket(int key, int value){
        Entry bucket = buckets[key];
        bucket.value = value;

    }


    @Override
    public HashTable clone(){
        try{
            return (HashTable) super.clone();
        }catch (CloneNotSupportedException e){
            throw new RuntimeException(e.getCause());
        }

    }

    @Override
    public String toString() {
        return Arrays.toString(buckets);
    }
}
