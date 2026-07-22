class Solution {
    // instead of wasting string space on encoding length just use a delimiter that cant be printed
    // and a character that cant be printed probably wont be included in the given strings
    private final static char delimiter = (char) 1; // same delimiter for both encoding and decoding
    public String encode(List<String> strs) {
        StringBuilder send = new StringBuilder();
        for (String s : strs) {
            send.append(s).append(delimiter); // use append here cos if you use += it creates new string (slower)
        }   
        return send.toString();
    }

    public List<String> decode(String str) {
        List<String> ls = new ArrayList<String>();
        int p1 = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == delimiter){
                ls.add(str.substring(p1, i));
                p1=i+1;
            }
        }
        return ls;
    }
}
