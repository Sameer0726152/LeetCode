class Solution(object):
    def summaryRanges(self, nums):
        if len(nums) == 0:
            return []
        start = nums[0]
        result = []
        for i in range(len(nums)):
            if i == len(nums) - 1 or nums[i] + 1 != nums[i + 1]:
                if nums[i] == start:
                    result.append(str(start))
                else:
                    result.append(str(start) + "->" + str(nums[i]))
                if i != len(nums) - 1:
                    start = nums[i + 1]
        return result