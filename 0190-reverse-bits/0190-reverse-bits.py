class Solution:
    def reverseBits(self, n: int) -> int:
        bin_str = '{:032b}'.format(n)
        rev_str = bin_str[::-1]
        return int(rev_str, 2)
        