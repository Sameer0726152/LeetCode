class Solution(object):
    def containsDuplicate(self, nums):
        freq = set(nums)
        if len(freq) == len(nums):
            return False
        return True
        