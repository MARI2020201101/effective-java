package ch03.item13;

import java.util.Arrays;

public class HashTableV2 implements Cloneable{
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

        public Entry deepCopy(){
            return new Entry(key,value,next);
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

    public HashTableV2(){
        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new Entry(0,0,null);
        }
    }


    @Override
    public HashTableV2 clone(){
        try{
            HashTableV2 clone = (HashTableV2) super.clone();
            Entry[] buckets = clone.buckets;
            Entry[] newBuckets = new Entry[buckets.length];
            for (int i = 0; i < buckets.length; i++) {
                Entry entry = buckets[i].deepCopy();
                newBuckets[i] = entry;
            }
            clone.buckets = newBuckets;
            return clone;

        }catch (CloneNotSupportedException e){
            throw new RuntimeException(e.getCause());
        }

    }

    @Override
    public String toString() {
        return Arrays.toString(buckets);
    }
}
