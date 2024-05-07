class Solution:
    def rotate(self, arr: List[int], k: int) -> None:
        n = len(arr)
        k = k % n
        Solution.reverse(arr, 0, n - 1)
        Solution.reverse(arr, 0, n - k - 1)
        Solution.reverse(arr, n - k, n - 1)

    def reverse(arr, start, end):
        while start < end:
            arr[start], arr[end] = arr[end], arr[start]
            start += 1
            end -= 1