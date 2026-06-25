class Solution(object):
    def removeDuplicates(self, nums):
        write = 1
        if len(nums) == 0:
            return 0
        for i in range(1, len(nums)):
            if nums[i] != nums[i-1]:
                nums[write] = nums[i]
                write += 1
        return write