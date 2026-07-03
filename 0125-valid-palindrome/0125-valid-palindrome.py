class Solution(object):
    def isPalindrome(self, s):
        cleaned = ""
        for char in s.lower():
            if char.isalnum():
                cleaned += char
        return cleaned == cleaned[::-1]

        