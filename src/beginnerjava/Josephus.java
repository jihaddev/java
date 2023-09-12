package beginnerjava;

import java.util.Iterator;
import java.util.LinkedList;

public class Josephus {
    public static int josephus(int n, int k) {
        LinkedList<Integer> list = new LinkedList<>();

        // লিস্টটিতে ১ থেকে n পর্যন্ত সংখ্যা যোগ করুন
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        Iterator<Integer> it = list.iterator();
        while (list.size() > 1) {
            int count = 1; // গননা কোন সংখ্যা থেকে শুরু হবে

            while (it.hasNext() && count < k) {
                it.next();
                count++;
            }

            // বর্তমান উপাদানটি লিস্ট থেকে মুছে ফেলুন
            it.remove();

            // প্রয়োজন হলে আইটারেটর it পুনরায় বিন্দুবিন্দু সেট করতে পারেন
            if (!it.hasNext()) {
                it = list.iterator();
            }
        }

        // বাকিটি উপাদানটি দেখানো
        return list.getFirst();
    }

    public static void main(String[] args) {
        int n = 7; // মোট লোকের সংখ্যা
        int k = 3; // মোছার গননা

        int survivor = josephus(n, k);
        System.out.println("The survivor is at position: " + survivor);
    }
}
