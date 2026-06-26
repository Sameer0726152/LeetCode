class Solution(object):
    def lengthOfLastWord(self, s):
        idk = s.split()
        word = idk[-1]
        length = len(word)
        return length
        