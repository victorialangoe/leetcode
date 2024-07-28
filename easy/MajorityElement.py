from typing import List

class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        counts = dict()
        for i in nums:
            counts[i] = counts.get(i, 0) + 1

        key_max = max(zip(counts.values(), counts.keys()))[1] 

        return key_max