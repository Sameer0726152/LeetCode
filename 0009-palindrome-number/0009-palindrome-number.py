class Solution(object):
    def isPalindrome(self, x):
        if x < 0:
            return False
        reverse = 0
        original = x
        ispalindrome = False
        while x > 0:
            digit = x % 10
            reverse = reverse * 10 + digit
            x = x/10
        if original == reverse:
            ispalindrome = True
            return ispalindrome
        if original != reverse:
            ispalindrome = False
            return ispalindrome
        
        