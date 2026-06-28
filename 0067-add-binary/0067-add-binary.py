class Solution(object):
    def addBinary(self, a, b):
        sum = []
        carry = 0
        length = max(len(a), len(b))
        for i in range(1, length + 1):
            if i <= len(a):
                digitA = int(a[-i])
            else:
                digitA = 0

            if i <= len(b):
                digitB = int(b[-i])
            else:
                digitB = 0
            total = digitA + digitB + carry
            result = total % 2
            carry= total // 2
            sum.insert(-i, str(total % 2))
        if carry == 1:
            sum.insert(0, "1")
        sum = "".join(sum)
        return sum
            
        