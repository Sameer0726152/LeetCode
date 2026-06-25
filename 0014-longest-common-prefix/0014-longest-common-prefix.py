class Solution(object):
    def longestCommonPrefix(self, strs):
        prefix = ""
        first = strs[0]
        for i in range(len(first)):
            for word in strs:
                if i >= len(word) or word[i] != first[i]:
                    return prefix
            prefix += first[i]
        return prefix
            
        