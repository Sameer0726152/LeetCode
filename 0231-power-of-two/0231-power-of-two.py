class Solution(object):
    def isPowerOfTwo(self, n):
        if n <= 0:
            return False
        idk = n & (n - 1)
        if idk == 0:
            return True
        return False
        

# Synced seamlessly with LeetHub Pro
# Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
# Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna