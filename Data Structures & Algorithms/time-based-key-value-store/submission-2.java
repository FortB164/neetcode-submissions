class TimeMap {
    HashMap<String, List<TimeStatePair>> hs;
    public TimeMap() {
        hs = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        // just add cos all incoming timestamps are sorted anyway
        hs.computeIfAbsent(key, v -> new ArrayList()).addLast(new TimeStatePair(value, timestamp));
    }
    
    public String get(String key, int timestamp) {
        List<TimeStatePair> values = hs.getOrDefault(key, new ArrayList<>());
        String res = "";
        int low = 0;
        int high = values.size()-1;

        while(low<=high){
            int mid = low + (high - low) / 2;

            TimeStatePair currentPair = values.get(mid);

            if(currentPair.getTime() <= timestamp){
                res = currentPair.getState();
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        return res;
    }
}

class TimeStatePair{
    String state;
    int time;

    public TimeStatePair(String state, int time){
        this.state = state;
        this.time = time;
    }

    public int getTime(){
        return time;
    }
    public String getState(){
        return state;
    }
}