class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length<1) return 0;
        HashSet<Integer> hashSet = new HashSet<>();

        for(int i : nums){
            hashSet.add(i); // add all nums to hashset for O 1 lookup
        }

        int maxStreak = 0; // holds the largest streak recorded 
        for(int i : nums){
            int currentStreak = 0; // to record the streak that begins with i
            int currentNum = i;
            while(hashSet.contains(currentNum)){ // for each num check if it exists
                currentNum++; // if it does, update the current to look for the 1 larger number
                currentStreak++; // every time it finds a next number, the consecutive is updated
            }
            maxStreak = Math.max(maxStreak, currentStreak); //update current streak with largest streak
        }

        return maxStreak; // return largest streak
    }
}
