class Solution(object):
    def containsDuplicate(self, nums):
        freq = set()
        for i in nums:
            if i in freq:
                return True
            freq.add(i)
        return False
        