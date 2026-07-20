class Solution(object):
    def shiftGrid(self, grid, k):
        m = len(grid)
        n = len(grid[0])
        k = k % (m * n)
        ans = [[0] * n for _ in range(m)]
        for i in range(m):
            for j in range(n):
                nindex = (i * n + j + k) % (m * n)
                nrow = nindex // n
                ncolumn = nindex % n
                ans[nrow][ncolumn] = grid[i][j]
        return ans

# Synced seamlessly with LeetHub Pro
# Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
# Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna