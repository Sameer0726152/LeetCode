class Solution(object):
    def gcdOfOddEvenSums(self, n):
        sumOdd = 0
        sumEven = 0
        for i in range(n):
            if i % 2 == 0:
                sumOdd += i
            else:
                sumEven += i
        return n