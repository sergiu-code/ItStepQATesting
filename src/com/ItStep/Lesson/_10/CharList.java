package com.ItStep.Lesson._10;

import java.util.ArrayList;
import java.util.Collections;

public class CharList {

    public ArrayList<Character> charList;

    public CharList() {
        this.charList = new ArrayList<>();
    }

    public CharList(String line) {
//        this.charList = new ArrayList<>();
//
//        int stringLength = string.length();
//        for (int i = 0; i < stringLength; i++) {
//            charList.add(string.charAt(i));
//        }
        charList = new ArrayList<>();
        for (char ch : line.toCharArray()) {
            charList.add(ch);

        }
    }

    public CharList(ArrayList<Character> charList) {
        this.charList = charList;
    }

    public String toString() {
        String line = "";
            for (Character ch : charList) {
                line= line + ch;
            }
            return line;
        }


    public char charAt(int index) {
        return charList.get(index);
    }

    public CharList subString(int start, int end) {
        ArrayList<Character> collected = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            collected.add(charList.get(i));
        }
        return new CharList(collected);
    }

    public int indexOf(char c) {
        return charList.indexOf(c);
    }

    boolean removeFirst(Character c) {
        return charList.remove(c);
    }

    boolean removeAll(Character c) {
        return charList.removeAll(Collections.singleton(c));
    }

    public boolean isEmpty() {
        return charList.size() == 0;
    }

    boolean contains(Character c) {
        return indexOf(c) > -1;
    }

    int length() {
        return charList.size();
    }

    CharList clearList() {
        charList.clear();
        return this;
    }

    public CharList sortList() {
        Collections.sort(charList);
        return this;
    }

    public CharList reverseList() {
        Collections.reverse(charList);
        return this;
    }

    public CharList mixedList() {
        Collections.shuffle(charList);
        return this;
    }

    public CharList trim() {
        String temp = this.toString().trim();
//        String temp = toString().trim();
        return new CharList(temp);
    }
}
