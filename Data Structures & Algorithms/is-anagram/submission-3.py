class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        sMap = {}
        tMap = {}
        for letter in s :
            if letter in sMap:
                sMap[letter] = sMap[letter] + 1
            else :
                sMap[letter] = 1

        for letter in t :
            if letter in tMap:
                tMap[letter] = tMap[letter] + 1
            else :
                tMap[letter] = 1
        
        return sMap == tMap
