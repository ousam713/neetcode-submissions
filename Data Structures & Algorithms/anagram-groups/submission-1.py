class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        mydict={}
        for str in strs:
            key = "".join(sorted(str))
            if key not in mydict:
                mydict[key] = []
            mydict[key].append(str)

        return list(mydict.values())
