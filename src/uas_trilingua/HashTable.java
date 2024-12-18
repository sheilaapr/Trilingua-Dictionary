/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uas_trilingua;

/**
 *
 * @author zxsyn
 */
class HashTable {
    private Data[] hashArray;
    private int size;

    public HashTable(int size) {
        this.size = size;
        hashArray = new Data[size];
    }

    public int hashFunc(String key) {
        int hash = 0;
        for (int i = 0; i < key.length(); i++) {
            hash += key.charAt(i);
        }
        return hash % size;
    }

    public void insert(String indonesian, String english, String jawa, String ket) {
        Data item = new Data(indonesian, english, jawa, ket);
        int hashVal = hashFunc(indonesian);
        while (hashArray[hashVal] != null) {
            ++hashVal;
            hashVal %= size;
        }
        hashArray[hashVal] = item;
    }

    public Data find(String indonesian) {
        int hashVal = hashFunc(indonesian);
        while (hashArray[hashVal] != null) {
            if (hashArray[hashVal].getIndonesian().equals(indonesian)) {
                return hashArray[hashVal];
            }
            ++hashVal;
            hashVal %= size;
        }
        return null;
    }

    public Data[] getAllData() {
        return hashArray;
    }
}
