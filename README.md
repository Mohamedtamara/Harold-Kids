# Harold-Kids

# Best Case

# Worst Case
In the worst case, the array is sorted backwards. This means partition will be called n times, and it has an O(n) runtime, so the overall runtime for the worst case will be O(n^2)

# Average Case
In the average case, each successive partition will split the array into groups in some way. In the worst case, one of these groups would be of length 0, so partition would be called n times. But in an average case, the partitioning will cut the list in half (if run enough times). This would mean partition would only need to be called roughly logn times. So, the overall average runtime is O(nlogn)
