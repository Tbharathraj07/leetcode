class Solution:
    def removeDuplicates(self, nums):
        hs = set()
        k = 0

        for val in nums:
            if val not in hs:
                hs.add(val)
                nums[k] = val
                k += 1

        return k