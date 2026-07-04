class Solution(object):
    def singleNumber(self, nums):
        freq = {}
        for i in nums:
            if i in freq:
                freq[i] += 1
            else:
                freq[i] = 1
        for key in freq:
            if freq[key] == 1:
                return key
        