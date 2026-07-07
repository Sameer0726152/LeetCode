class Solution(object):
    def sumAndMultiply(self, n):
        x = ""
        total = 0
        for i in str(n):
            if i != "0":
                x += i
                total += int(i)
        if x == "":
            return 0
        return int(x) * total