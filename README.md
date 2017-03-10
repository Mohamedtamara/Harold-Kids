# Harold-Kids
Testing for the runtime of QuickSort

# Worst Case
In the worst case, the array is sorted backwards. This means partition will be called n times, and it has an O(n) runtime, so the overall runtime for the worst case will be O(n^2)

# Average Case
In the average case, each successive partition will split the array into groups in some way. In the worst case, one of these groups would be of length 0, so partition would be called n times. But in an average case, the partitioning will cut the list in half (if run enough times). This would mean partition would only need to be called roughly logn times. So, the overall average runtime is O(nlogn)

# Best Case
With the best case, each partition will split the array exactly in half. This will make the runtime exactly O(nlogn). This case will not occur when the array is already sorted, we believe. When it is already sorted, each partition will split the array into two very unequal sections, just like in the worst case. We ran qsort on an already sorted array, and it had to call partition() n times.

# Methodology
We ran quicksort on arrays of varying length. For each lenght, we ran quicksort 100 times. After all the arrays were sorted, an average time was calculated. 

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
When partition() is called the first time on a comletely randomized array, pivot position won't matter at all because each element at each position is equaly likely to belong somewhere in the middle. However, after pivot has been called a number of times, and the array has some sort of order to it, the values that belong in the middle are more likely to actually be closer to the middle. So you will be more likly to pick a middle value if you pick a pivot position that is halfway between your two bounds.
