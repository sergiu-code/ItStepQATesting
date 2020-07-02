package com.ItStep.Lesson._10;

public class Practice {
    public static void main(String[] args) {
//        CharList charList = new CharList("acb123123");
//        CharList charList2 = new CharList("13456");

//
//        System.out.println(charList);
//        System.out.println(charList.indexOf('c'));
//        System.out.println(charList.length());
//        System.out.println(charList.charAt(3));
//        System.out.println(charList.subString(2, 5));
//
//        charList.removeFirst('1');
//        System.out.println(charList);
//
//        charList.removeAll('1');
//        System.out.println(charList);
//
//        System.out.println(charList.contains('q'));
//        System.out.println(charList.contains('a'));
//
//        ArrayList<Character> charList1 = new ArrayList<>();
//        Collections.addAll(charList1, 'a', 'c', 'b', '1', '2', '3', '1', '2', '3');
//        System.out.println(charList1);
//
//        charList1.clear();
//        System.out.println("cleared list" + charList1);
//
//        Collections.sort(charList1);
//        System.out.println(charList1);
//
//        Collections.reverse(charList1);
//        System.out.println(charList1);
//
//        Collections.shuffle(charList1);
//        System.out.println(charList1);
//
//        String fullTxt ="";
//        for (Character ch : charList1) {
//            fullTxt = fullTxt + ch;
//        }
//        System.out.println(fullTxt);
//
//        ArrayList<Character> chars1 = new ArrayList<>();
//        Collections.addAll(chars1, '1', '1', '2', '3', '3', '3', '4', '5', '6', '6', '6', '7', '8');
//        System.out.println(chars1);
//        LinkedHashSet<Character> hashSet = new LinkedHashSet<>(chars1);
//        ArrayList<Character> removeDuplicates = new ArrayList<>(hashSet);
//        System.out.println(removeDuplicates);
        CharList c1 = new CharList("  12345  ");
        System.out.println(c1.toString());
        CharList c1Trim=c1.trim();
        System.out.println(c1Trim.toString());

    }
}
