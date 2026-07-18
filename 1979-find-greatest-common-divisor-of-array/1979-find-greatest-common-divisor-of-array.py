class Solution(object):
    def findGCD(self, nums):
        max = nums[0]
        min = nums[0]
        for i in nums:
            if i > max:
                max = i
            elif i < min:
                min = i
        for i in range(max, 1, -1):
            if max % i == 0:
                if min % i == 0:
                    return i
        return 1
        