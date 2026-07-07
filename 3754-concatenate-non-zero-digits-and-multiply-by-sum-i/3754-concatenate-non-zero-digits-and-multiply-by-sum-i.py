class Solution(object):
    def sumAndMultiply(self, n):
        x = 0
        total = 0
        place = 1
        while n > 0:
            digit = n % 10
            if digit != 0:
                x += digit * place
                total += digit
                place *= 10
            n //= 10
        return x * total