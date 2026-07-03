class Solution:
    def isAnagram(self, s1: str, s2:str) -> bool:
        key_s1 = self.alphabetFrequency(s1)
        key_s2 = self.alphabetFrequency(s2)
        
        if key_s1 == key_s2:
            return True
        else:
            return False
    
    def alphabetFrequency(self, s:str) -> {}:
        d = {}
        lst = list(s)
        for c in range(len(s)):
            d[lst[c]] = d.get(lst[c], 0) + 1
        return d