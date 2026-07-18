class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> map = new HashMap<>();
        for(String s : strs){
            map.putIfAbsent(getSortedKey(s), new ArrayList<>());
            map.get(getSortedKey(s)).add(s);
        }
        return new ArrayList<>(map.values());
    }

    public static String getSortedKey(String x){
        char [] str = x.toCharArray();
        Arrays.sort(str);
        String y = new String(str);
        return y;
    }
}
