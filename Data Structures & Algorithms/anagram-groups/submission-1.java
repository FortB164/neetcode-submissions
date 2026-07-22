class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            map.putIfAbsent(getSortedKey(s), new ArrayList<>()); // create a bucket by putting down sorted string as key and arraylist as value
            map.get(getSortedKey(s)).add(s); // gets the sorted key of string s, which gets the value aka the arraylist and then just add string s to that arraylist.
        }
        return new ArrayList<>(map.values()); // return the buckets
    }

    public static String getSortedKey(String x){  // returns the string sorted alphabetically that becomes the hashmap key
        char [] str = x.toCharArray();            // cat becomes act, tree becomes eert
        Arrays.sort(str);
        String y = new String(str);
        return y;
    }
}
