/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutoring;

/**
 *
 * @author Walt
 */
public class ArraySet<T extends Comparable> {

    protected T[] arr;
    protected int length;

    public ArraySet() {
        arr = (T[]) new Comparable[1];
        length = 0;
    }

    public void add(T addition) {
        if (!this.exists(addition)) {
            this.ensureCapacity();
            arr[length++] = addition;
        }
    }

    private boolean exists(T addition) {
        if (length > 0) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].compareTo(addition) == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public T get(int target) {
        return arr[target];
    }

    public void remove(int target) {
        length--;
        T[] newArr = (T[]) new Comparable[length];
        for (int i = 0; i < length; i++) {
            if (i >= target) {
                newArr[i] = arr[i + 1];
            } else {
                newArr[i] = arr[i];
            }
        }
        arr = newArr;
    }

    public void clear() {
        arr = (T[]) new Comparable[1];
        length = 0;
    }

    public int size() {
        return length;
    }

    public String toString() {
        String str = "";
        for (int i = 0; i < length; i++) {
            str += arr[i].toString() + "\n";
        }
        return str;
    }

    private void ensureCapacity() {
        T[] newArr = (T[]) new Comparable[length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }
}
