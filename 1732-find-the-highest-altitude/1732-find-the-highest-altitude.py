class Solution(object):
    def largestAltitude(self, gain):
        altitude = [0] * (len(gain) + 1)
        for i in range(len(gain)):
            altitude[i+1] = altitude[i] + gain[i]
        highest = max(altitude)
        return highest
    