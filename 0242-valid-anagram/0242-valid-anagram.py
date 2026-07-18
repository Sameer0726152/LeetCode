class Solution(object):
    def isAnagram(self, s, t):
        sfreq = {}
        tfreq = {}
        for i in s:
            if i in sfreq:
                sfreq[i] += 1
            else:
                sfreq[i] = 1
        for i in t:
            if i in tfreq:
                tfreq[i] += 1
            else:
                tfreq[i] = 1
        return sfreq == tfreq
