class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        a = nums1+nums2
        a.sort()
        if len(a) % 2 == 0:
            b = len(a) // 2
            c = (len(a) // 2) - 1
            d = (a[b] + a[c]) / 2
            return round(d,5)
        else:
            return (round(a[len(a)//2],5))