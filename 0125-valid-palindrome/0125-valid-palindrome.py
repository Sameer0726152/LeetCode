class Solution(object):
    def isPalindrome(self, s):
        s = s.lower()
        s1 = ""
        s2 = ""
        for item in s:
            if item in "abcdefghijklmnopqrstuvwxyz1234567890":
                s2 += item
        for item in range(len(s2) - 1, -1, -1):
            s1 += s2[item]
        if s1 == s2:
            return True
        else:
            return False
        