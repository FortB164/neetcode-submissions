class Solution {
    public boolean isAnagram(String s, String t) {
        if ((s.length() != t.length()) || s.length()<=0 || t.length()<=0) return false;

        char [] s1 = s.toCharArray();
        char [] t1 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);

        return Arrays.equals(t1,s1);
    }
}
