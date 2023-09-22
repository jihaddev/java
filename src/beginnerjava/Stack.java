package beginnerjava;

import java.util.ArrayDeque;
// ei code ti te stack use kora hoyeche
public class Stack {
    public static void main(String[] args) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.size()); // স্ট্যাকের সাইজ প্রিন্ট করে দেখানো হল
        System.out.println(stack.isEmpty()); // স্ট্যাক খালি কিনা পরীক্ষা করে দেখানো হল
    }
}
