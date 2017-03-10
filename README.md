# Harold-Kids

# Best Case

# Worst Case
In the worst case, the array is sorted backwards. This means partition will be called n times, and it has an O(n) runtime, so the overall runtime for the worst case will be O(n^2)

# Average Case
In the average case, each successive partition will split the array into groups in some way. In the worst case, one of these groups would be of length 0, so partition would be called n times. But in an average case, the partitioning will cut the list in half (if run enough times). This would mean partition would only need to be called roughly logn times. So, the overall average runtime is O(nlogn)

# Methodology

# Time Measures
Length 100: 0.04 milliseconds  
Length 1000: 0.06 milliseconds  
Length 10000: 0.82 milliseconds  
Length 100000: 12.06 milliseconds  
Length 500000: 101.62 milliseconds  
Length 1000000: 341.9 milliseconds  
https://www.desmos.com/calculator/fp0xqusvjw  
From this graph, you can see that our data roughly follows an nlogn curve. In the graph shown, the x axis represents the length of the array, while the y axis represents the time in milliseconds.

# Pivot Selection and Data Arrangement
