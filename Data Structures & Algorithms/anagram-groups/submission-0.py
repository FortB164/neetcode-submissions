class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagram_map = {} # Dictionary to store grouped anagrams
        for s in strs:
            sorted_key = tuple(sorted(s)) # Sort the string to create a key
            
            # Group strings with the same sorted key
            if sorted_key not in anagram_map:
                anagram_map[sorted_key] = []
            anagram_map[sorted_key].append(s)
        
        # Return the grouped anagrams as a list of lists
        return list(anagram_map.values())