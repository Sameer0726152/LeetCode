class Solution(object):
    def isPowerOfTwo(self, n):
        if n <= 0:
            return False
        while n > 1:
            if n % 2 != 0:
                return False
            n //= 2
        return True
        

# Synced seamlessly with LeetHub Pro
# Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
# Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna