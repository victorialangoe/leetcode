from typing import List


class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        j = 0 # number of unique elements

        for i in range(len(nums)):
            if nums[i]!=nums[j]:
                j = j+1
                nums[j] = nums[i]

        return j+1