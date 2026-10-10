class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int highspd = Arrays.stream(piles).max().getAsInt();
        int lowspd = 1, minspd = highspd;
        while(lowspd < highspd){
            long hours = 0;
            int mid  = lowspd + (highspd - lowspd)/2;
            for(int i = 0 ; i < piles.length ; i++) hours += Math.ceil((double) piles[i]/mid);
            if(hours > h){
                lowspd = mid + 1;
                continue;
            }
            minspd = Math.min(mid, highspd);
            highspd = mid;   
        }
        return minspd;
    }
}