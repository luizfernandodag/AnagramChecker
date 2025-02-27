public class AnagramChecker {

    public static boolean isAnagram(String s1, String s2)
    {
        System.out.println(s1);
        System.out.println(s2);
        int l1 = s1.length(), l2 = s2.length();

        if(l1 != l2) return false;

        int i = 0, j = l1 -1;

        while(i != j)
        {
            System.out.println("i: " + i + "j: " + j);
            System.out.println("s1.charAt(i): " + s1.charAt(i));
            System.out.println("s2.charAt(i): " + s2.charAt(i));
            if(s1.charAt(i) != s2.charAt(j)) return false;

            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args) {

        System.out.println(isAnagram("abcde", "edcba" ));
        System.out.println(isAnagram("rock", "aaaaaa" ));
        
    }

}
