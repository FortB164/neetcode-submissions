class Solution {
    final static char delimiter = (char) 1;
    public String encode(List<String> strs) {
        String send = "";
        for(int i = 0 ; i < strs.size(); i++){
            send += strs.get(i) + delimiter;
        }
        return send;
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
