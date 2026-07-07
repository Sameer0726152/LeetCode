class Solution(object):
    def sumAndMultiply(self, n):
        num = str(n)
        idk = ""
        sum = 0
        if n == 0:
            return 0
        for i in num:
            if i != "0":
                idk += i
                sum += int(i)
            else:
                continue
        return int(idk) * sum