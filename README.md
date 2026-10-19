<div align="center">

# 🧠 LeetCode Solutions in Java

**181 LeetCode problems solved, organized by data structure and algorithm pattern**

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![LeetCode](https://img.shields.io/badge/LeetCode-FFA116?style=for-the-badge&logo=leetcode&logoColor=black)
![Solutions](https://img.shields.io/badge/solutions-181-2ea44f?style=for-the-badge)
![Topics](https://img.shields.io/badge/topics-8-blue?style=for-the-badge)

</div>

---

## 📌 About

This repository is my personal problem-solving log: solutions I wrote while learning data structures and
algorithms in Java. Problems are grouped by **topic** and **difficulty** so it is easy to see which patterns
I have practiced and to revisit them before interviews.

## 📊 At a glance

| 🟢 Easy | 🟡 Medium | 🔴 Hard |
|:-:|:-:|:-:|
| **144** | **33** | **4** |

| Topic | Solutions | Share |
|:--|:-:|:--|
| 🧮 Arrays | **83** | `█████████░░░░░░░░░░░` |
| 🔃 Sorting (counting & cyclic sort) | **7** | `█░░░░░░░░░░░░░░░░░░░` |
| 🔤 Strings | **77** | `█████████░░░░░░░░░░░` |
| 🔍 Binary Search | **7** | `█░░░░░░░░░░░░░░░░░░░` |
| 🪟 Sliding Window | **2** | `█░░░░░░░░░░░░░░░░░░░` |
| 🧩 Dynamic Programming | **2** | `█░░░░░░░░░░░░░░░░░░░` |
| 🔗 Linked List | **2** | `█░░░░░░░░░░░░░░░░░░░` |
| 📥 Queue | **1** | `█░░░░░░░░░░░░░░░░░░░` |

> Problem titles and difficulty levels link to the official LeetCode problem pages.

## ⭐ Highlights

A few solutions that show the main techniques I use:

| # | Problem | Level | Key idea | Code |
|:-:|:--|:-:|:--|:-:|
| 4 | Median of Two Sorted Arrays | 🔴 Hard | Two-pointer merge of both sorted arrays, then pick the middle | [Java](./src/arrays/hard/Median_Two_Sorted_Array_4.java) |
| 41 | First Missing Positive | 🔴 Hard | Cyclic sort places each value at its index — O(n) time, O(1) space | [Java](./src/arrays/sorting/cyclicSort/_41_First_Missing_Positive_Num.java) |
| 154 | Find Minimum in Rotated Sorted Array II | 🔴 Hard | Modified binary search that handles duplicates at both ends | [Java](./src/binarySearch/_154_Find_Minimum_Rotated_Sorted_Array_2.java) |
| 224 | Basic Calculator | 🔴 Hard | Stack stores running result and sign at each parenthesis | [Java](./src/strings/hard/_224_Basic_Calculator.java) |
| 3 | Longest Substring Without Repeating Characters | 🟡 Medium | Sliding window with a last-seen HashMap | [Java](./src/strings/medium/_3_Longest_Substring_Without_Repeating_Characters.java) |
| 15 | 3Sum | 🟡 Medium | Sort, then two pointers for each fixed element | [Java](./src/arrays/medium/ThreeSum_15.java) |
| 91 | Decode Ways | 🟡 Medium | 1-D dynamic programming with O(1) space | [Java](./src/strings/medium/_91_Decode_Ways.java) |
| 209 | Minimum Size Subarray Sum | 🟡 Medium | Variable-size sliding window | [Java](./src/slidingwindow/_209_Minimum_Size_Subarray_Sum.java) |
| 438 | Find All Anagrams in a String | 🟡 Medium | Fixed window with 26-letter frequency arrays | [Java](./src/strings/medium/_438_Find_All_Anagrams_String.java) |
| 838 | Push Dominoes | 🟡 Medium | Two pointers between forces, fill each segment | [Java](./src/strings/medium/_838_Push_Dominoes.java) |

## 🧰 Patterns practiced

`Two Pointers` · `Sliding Window` · `Binary Search` · `Cyclic Sort` · `Counting Sort` · `HashMap / HashSet` ·
`Stack` · `Prefix & Suffix arrays` · `Dynamic Programming` · `Linked List manipulation` · `Bit manipulation (XOR)`

## 📂 Repository structure

```
src/
├── arrays/
│   ├── easy/  medium/  hard/
│   ├── countingSort/
│   └── sorting/cyclicSort/
├── strings/
│   └── easy/  medium/  hard/
├── binarySearch/
├── slidingwindow/
├── dynamicProgramming/
├── linkedList/
├── queue/
└── practice/          # scratch work and warm-up exercises
```

## 📚 Full problem index

Click a topic to expand it.

<details>
<summary><b>🧮 Arrays</b> — 83 solutions</summary>

| # | Problem | Level | Solution |
|:-:|:--|:-:|:-:|
| 4 | [Median of Two Sorted Arrays](https://leetcode.com/problems/median-of-two-sorted-arrays/) | 🔴 Hard | [Java](./src/arrays/hard/Median_Two_Sorted_Array_4.java) |
| 11 | [Container With Most Water](https://leetcode.com/problems/container-with-most-water/) | 🟡 Medium | [Java](./src/arrays/medium/Container_With_Most_Water_11.java) |
| 15 | [3Sum](https://leetcode.com/problems/3sum/) | 🟡 Medium | [Java](./src/arrays/medium/ThreeSum_15.java) |
| 26 | [Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/) | 🟢 Easy | [Java](./src/arrays/easy/Remove_Duplicate_SortedArray_26.java) |
| 27 | [Remove Element](https://leetcode.com/problems/remove-element/) | 🟢 Easy | [Java](./src/arrays/easy/Remove_Element_27.java) |
| 75 | [Sort Colors](https://leetcode.com/problems/sort-colors/) | 🟡 Medium | [Java](./src/arrays/easy/Sort_Colors_75.java) |
| 88 | [Merge Sorted Array](https://leetcode.com/problems/merge-sorted-array/) | 🟢 Easy | [Java](./src/arrays/easy/Merge_Sorted_Array_88.java) |
| 121 | [Best Time to Buy and Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/) | 🟢 Easy | [Java](./src/arrays/easy/Best_Time_BuySell_121.java) |
| 136 | [Single Number](https://leetcode.com/problems/single-number/) | 🟢 Easy | [Java](./src/arrays/easy/SingleNum_136.java) |
| 137 | [Single Number II](https://leetcode.com/problems/single-number-ii/) | 🟡 Medium | [Java](./src/arrays/medium/Single_Number_137.java) |
| 167 | [Two Sum II - Input Array Is Sorted](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/) | 🟡 Medium | [Java](./src/arrays/easy/Two_Sum2_167.java) |
| 169 | [Majority Element](https://leetcode.com/problems/majority-element/) | 🟢 Easy | [Java](./src/arrays/easy/MajorityElement_169.java) |
| 189 | [Rotate Array](https://leetcode.com/problems/rotate-array/) | 🟡 Medium | [Java](./src/arrays/easy/RotateArray.java) |
| 219 | [Contains Duplicate II](https://leetcode.com/problems/contains-duplicate-ii/) | 🟢 Easy | [Java](./src/arrays/easy/ContainsDuplicate2_219.java) |
| 240 | [Search a 2D Matrix II](https://leetcode.com/problems/search-a-2d-matrix-ii/) | 🟡 Medium | [Java](./src/arrays/medium/Search_2D_Matrix2_240.java) |
| 283 | [Move Zeroes](https://leetcode.com/problems/move-zeroes/) | 🟢 Easy | [Java](./src/arrays/easy/Move_Zeroes_283.java) |
| 350 | [Intersection of Two Arrays II](https://leetcode.com/problems/intersection-of-two-arrays-ii/) | 🟢 Easy | [Java](./src/arrays/easy/IntersectionArray2_350.java) |
| 414 | [Third Maximum Number](https://leetcode.com/problems/third-maximum-number/) | 🟢 Easy | [Java](./src/arrays/easy/ThirdMax_414.java) |
| 496 | [Next Greater Element I](https://leetcode.com/problems/next-greater-element-i/) | 🟢 Easy | [Java](./src/arrays/easy/NextGreaterElement1_496.java) |
| 500 | [Keyboard Row](https://leetcode.com/problems/keyboard-row/) | 🟢 Easy | [Java](./src/arrays/easy/KeyboardRow_500.java) |
| 532 | [K-diff Pairs in an Array](https://leetcode.com/problems/k-diff-pairs-in-an-array/) | 🟡 Medium | [Java](./src/arrays/medium/_532_KDiff_Pairs_Array.java) |
| 575 | [Distribute Candies](https://leetcode.com/problems/distribute-candies/) | 🟢 Easy | [Java](./src/arrays/easy/_575_Distribute_Candies.java) |
| 628 | [Maximum Product of Three Numbers](https://leetcode.com/problems/maximum-product-of-three-numbers/) | 🟢 Easy | [Java](./src/arrays/easy/_628_Max_Product_Three_Numbers.java) |
| 643 | [Maximum Average Subarray I](https://leetcode.com/problems/maximum-average-subarray-i/) | 🟢 Easy | [Java](./src/arrays/easy/MaximumAvgSubArray.java) |
| 645 | [Set Mismatch](https://leetcode.com/problems/set-mismatch/) | 🟢 Easy | [Java](./src/arrays/easy/_645_Set_Mismatch.java) |
| 682 | [Baseball Game](https://leetcode.com/problems/baseball-game/) | 🟢 Easy | [Java](./src/arrays/easy/BaseballGame.java) |
| 747 | [Largest Number At Least Twice of Others](https://leetcode.com/problems/largest-number-at-least-twice-of-others/) | 🟢 Easy | [Java](./src/arrays/easy/_747_Largest_Number_At_Least_Twice.java) |
| 905 | [Sort Array By Parity](https://leetcode.com/problems/sort-array-by-parity/) | 🟢 Easy | [Java](./src/arrays/easy/SortArrayParity_905.java) |
| 961 | [N-Repeated Element in Size 2N Array](https://leetcode.com/problems/n-repeated-element-in-size-2n-array/) | 🟢 Easy | [Java](./src/arrays/easy/RepeatedElement_961.java) |
| 977 | [Squares of a Sorted Array](https://leetcode.com/problems/squares-of-a-sorted-array/) | 🟢 Easy | [Java](./src/arrays/easy/SquaresSortedArray_977.java) |
| 985 | [Sum of Even Numbers After Queries](https://leetcode.com/problems/sum-of-even-numbers-after-queries/) | 🟡 Medium | [Java](./src/arrays/medium/SumOfEvenQueries_985.java) |
| 1002 | [Find Common Characters](https://leetcode.com/problems/find-common-characters/) | 🟢 Easy | [Java](./src/arrays/easy/_1002_Find_Common_Characters.java) |
| 1051 | [Height Checker](https://leetcode.com/problems/height-checker/) | 🟢 Easy | [Java](./src/arrays/easy/HeightChecker_1051.java) |
| 1207 | [Unique Number of Occurrences](https://leetcode.com/problems/unique-number-of-occurrences/) | 🟢 Easy | [Java](./src/arrays/easy/UniqNumOccurance_1207.java) |
| 1295 | [Find Numbers with Even Number of Digits](https://leetcode.com/problems/find-numbers-with-even-number-of-digits/) | 🟢 Easy | [Java](./src/arrays/easy/EvenDigitNumber.java) |
| 1299 | [Replace Elements with Greatest Element on Right Side](https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/) | 🟢 Easy | [Java](./src/arrays/easy/ReplaceElement_RightGreatest_1299.java) |
| 1304 | [Find N Unique Integers Sum up to Zero](https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/) | 🟢 Easy | [Java](./src/arrays/easy/Unique_Int_Sum_Zero_1304.java) |
| 1346 | [Check If N and Its Double Exist](https://leetcode.com/problems/check-if-n-and-its-double-exist/) | 🟢 Easy | [Java](./src/arrays/easy/CheckNM_1346.java) |
| 1365 | [How Many Numbers Are Smaller Than the Current Number](https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/) | 🟢 Easy | [Java](./src/arrays/easy/CountSmallerNum.java) |
| 1380 | [Lucky Numbers in a Matrix](https://leetcode.com/problems/lucky-numbers-in-a-matrix/) | 🟢 Easy | [Java](./src/arrays/easy/LuckyNumMatrix_1380.java) |
| 1389 | [Create Target Array in the Given Order](https://leetcode.com/problems/create-target-array-in-the-given-order/) | 🟢 Easy | [Java](./src/arrays/easy/CreateTargetArray.java) |
| 1431 | [Kids With the Greatest Number of Candies](https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/) | 🟢 Easy | [Java](./src/arrays/easy/GreatNumCandies_1431.java) |
| 1441 | [Build an Array With Stack Operations](https://leetcode.com/problems/build-an-array-with-stack-operations/) | 🟡 Medium | [Java](./src/arrays/easy/BuildArrayStack_1441.java) |
| 1450 | [Number of Students Doing Homework at a Given Time](https://leetcode.com/problems/number-of-students-doing-homework-at-a-given-time/) | 🟢 Easy | [Java](./src/arrays/easy/DoingHomeWork_1450.java) |
| 1464 | [Maximum Product of Two Elements in an Array](https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/) | 🟢 Easy | [Java](./src/arrays/easy/MaxProductArr_1464.java) |
| 1470 | [Shuffle the Array](https://leetcode.com/problems/shuffle-the-array/) | 🟢 Easy | [Java](./src/arrays/ShuffleArray.java) |
| 1480 | [Running Sum of 1d Array](https://leetcode.com/problems/running-sum-of-1d-array/) | 🟢 Easy | [Java](./src/arrays/easy/RunningSum.java) |
| 1486 | [XOR Operation in an Array](https://leetcode.com/problems/xor-operation-in-an-array/) | 🟢 Easy | [Java](./src/arrays/easy/XOROperationArray_1486.java) |
| 1491 | [Average Salary Excluding the Minimum and Maximum Salary](https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/) | 🟢 Easy | [Java](./src/arrays/easy/AverageSalary_1491.java) |
| 1528 | [Shuffle String](https://leetcode.com/problems/shuffle-string/) | 🟢 Easy | [Java](./src/arrays/easy/ShuffleString_1528.java) |
| 1572 | [Matrix Diagonal Sum](https://leetcode.com/problems/matrix-diagonal-sum/) | 🟢 Easy | [Java](./src/arrays/easy/DiagonalSum.java) |
| 1588 | [Sum of All Odd Length Subarrays](https://leetcode.com/problems/sum-of-all-odd-length-subarrays/) | 🟢 Easy | [Java](./src/arrays/easy/SumOfOddLengthSubArr_1588.java) |
| 1672 | [Richest Customer Wealth](https://leetcode.com/problems/richest-customer-wealth/) | 🟢 Easy | [Java](./src/arrays/RichestCustomer.java) |
| 1720 | [Decode XORed Array](https://leetcode.com/problems/decode-xored-array/) | 🟢 Easy | [Java](./src/arrays/easy/DecodeXORedArray.java) |
| 1732 | [Find the Highest Altitude](https://leetcode.com/problems/find-the-highest-altitude/) | 🟢 Easy | [Java](./src/arrays/easy/HighestAltitudes.java) |
| 1748 | [Sum of Unique Elements](https://leetcode.com/problems/sum-of-unique-elements/) | 🟢 Easy | [Java](./src/arrays/easy/SumUniElement.java) |
| 1816 | [Truncate Sentence](https://leetcode.com/problems/truncate-sentence/) | 🟢 Easy | [Java](./src/arrays/easy/TruncateSentence_1816.java) |
| 1827 | [Minimum Operations to Make the Array Increasing](https://leetcode.com/problems/minimum-operations-to-make-the-array-increasing/) | 🟢 Easy | [Java](./src/arrays/easy/MakingArrIncreasing_1827.java) |
| 1913 | [Maximum Product Difference Between Two Pairs](https://leetcode.com/problems/maximum-product-difference-between-two-pairs/) | 🟢 Easy | [Java](./src/arrays/easy/MaxProductDifference.java) |
| 1920 | [Build Array from Permutation](https://leetcode.com/problems/build-array-from-permutation/) | 🟢 Easy | [Java](./src/arrays/easy/BuildArrayPermutation.java) |
| 1929 | [Concatenation of Array](https://leetcode.com/problems/concatenation-of-array/) | 🟢 Easy | [Java](./src/arrays/easy/ConcatArray_1929.java) |
| 1936 | [Add Minimum Number of Rungs](https://leetcode.com/problems/add-minimum-number-of-rungs/) | 🟡 Medium | [Java](./src/arrays/medium/MinNumRungs_1936.java) |
| 2006 | [Count Number of Pairs With Absolute Difference K](https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k/) | 🟢 Easy | [Java](./src/arrays/easy/_2006_Count_NumOfPairs_With_Absolute_Difference.java) |
| 2011 | [Final Value of Variable After Performing Operations](https://leetcode.com/problems/final-value-of-variable-after-performing-operations/) | 🟢 Easy | [Java](./src/arrays/easy/FinalValue_2011.java) |
| 2032 | [Two Out of Three](https://leetcode.com/problems/two-out-of-three/) | 🟢 Easy | [Java](./src/arrays/easy/_2032_Two_Out_Of_Three.java) |
| 2053 | [Kth Distinct String in an Array](https://leetcode.com/problems/kth-distinct-string-in-an-array/) | 🟢 Easy | [Java](./src/arrays/easy/_2053_Kth_Distinct_String_Array.java) |
| 2057 | [Smallest Index With Equal Value](https://leetcode.com/problems/smallest-index-with-equal-value/) | 🟢 Easy | [Java](./src/arrays/easy/_2057_Smallest_Index_With_Equal_Value.java) |
| 2085 | [Count Common Words With One Occurrence](https://leetcode.com/problems/count-common-words-with-one-occurrence/) | 🟢 Easy | [Java](./src/arrays/easy/_2085_Count_Common_Words_With_One_Occurrence.java) |
| 2091 | [Removing Minimum and Maximum From Array](https://leetcode.com/problems/removing-minimum-and-maximum-from-array/) | 🟡 Medium | [Java](./src/arrays/medium/_2091_Removing_Min_Max_From_Array.java) |
| 2100 | [Find Good Days to Rob the Bank](https://leetcode.com/problems/find-good-days-to-rob-the-bank/) | 🟡 Medium | [Java](./src/arrays/medium/GoodDays_To_Rob_2100.java) |
| 2108 | [Find First Palindromic String in the Array](https://leetcode.com/problems/find-first-palindromic-string-in-the-array/) | 🟢 Easy | [Java](./src/arrays/easy/Find_First_Palindrome_String_2108.java) |
| 2114 | [Maximum Number of Words Found in Sentences](https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/) | 🟢 Easy | [Java](./src/arrays/easy/MaxWord_2114.java) |
| 2154 | [Keep Multiplying Found Values by Two](https://leetcode.com/problems/keep-multiplying-found-values-by-two/) | 🟢 Easy | [Java](./src/arrays/easy/_2154_Keep_Multiplying_Found_Values.java) |
| 2176 | [Count Equal and Divisible Pairs in an Array](https://leetcode.com/problems/count-equal-and-divisible-pairs-in-an-array/) | 🟢 Easy | [Java](./src/arrays/easy/_2176_Count_Equal_Divisible_Pairs.java) |
| 2256 | [Minimum Average Difference](https://leetcode.com/problems/minimum-average-difference/) | 🟡 Medium | [Java](./src/arrays/medium/_2256_Minimum_Average_Difference.java) |
| 2325 | [Decode the Message](https://leetcode.com/problems/decode-the-message/) | 🟢 Easy | [Java](./src/arrays/easy/_2325_Decode_Message.java) |
| 2341 | [Maximum Number of Pairs in Array](https://leetcode.com/problems/maximum-number-of-pairs-in-array/) | 🟢 Easy | [Java](./src/arrays/easy/_2341_Maximum_Number_Pairs.java) |
| 2357 | [Make Array Zero by Subtracting Equal Amounts](https://leetcode.com/problems/make-array-zero-by-subtracting-equal-amounts/) | 🟢 Easy | [Java](./src/arrays/easy/_2357_Make_Array_Zero_By_Subtracting.java) |
| 2367 | [Number of Arithmetic Triplets](https://leetcode.com/problems/number-of-arithmetic-triplets/) | 🟢 Easy | [Java](./src/arrays/easy/_2367_Number_Of_Arithmetic_Triplets.java) |
| 2418 | [Sort the People](https://leetcode.com/problems/sort-the-people/) | 🟢 Easy | [Java](./src/arrays/easy/_2418_Sort_The_People.java) |
| 2529 | [Maximum Count of Positive Integer and Negative Integer](https://leetcode.com/problems/maximum-count-of-positive-integer-and-negative-integer/) | 🟢 Easy | [Java](./src/arrays/easy/_2529_Max_Count_Pos_And_Neg_Integer.java) |
| 2535 | [Difference Between Element Sum and Digit Sum of an Array](https://leetcode.com/problems/difference-between-element-sum-and-digit-sum-of-an-array/) | 🟢 Easy | [Java](./src/arrays/easy/_2535_Difference_Between_Element_Sum_and_Digit_Sum.java) |
| 2553 | [Separate the Digits in an Array](https://leetcode.com/problems/separate-the-digits-in-an-array/) | 🟢 Easy | [Java](./src/arrays/easy/_2553_Separate_Digits_From_Array.java) |

</details>

<details>
<summary><b>🔃 Sorting (counting & cyclic sort)</b> — 7 solutions</summary>

| # | Problem | Level | Solution |
|:-:|:--|:-:|:-:|
| 41 | [First Missing Positive](https://leetcode.com/problems/first-missing-positive/) | 🔴 Hard | [Java](./src/arrays/sorting/cyclicSort/_41_First_Missing_Positive_Num.java) |
| 268 | [Missing Number](https://leetcode.com/problems/missing-number/) | 🟢 Easy | [Java](./src/arrays/sorting/cyclicSort/_268_FindMissingNumber.java) |
| 287 | [Find the Duplicate Number](https://leetcode.com/problems/find-the-duplicate-number/) | 🟡 Medium | [Java](./src/arrays/sorting/cyclicSort/_287_Find_Duplicate_Number.java) |
| 442 | [Find All Duplicates in an Array](https://leetcode.com/problems/find-all-duplicates-in-an-array/) | 🟡 Medium | [Java](./src/arrays/sorting/cyclicSort/_442_Find_All_Duplicate.java) |
| 448 | [Find All Numbers Disappeared in an Array](https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/) | 🟢 Easy | [Java](./src/arrays/sorting/cyclicSort/_448_Find_All_Disappeared_Number.java) |
| 561 | [Array Partition](https://leetcode.com/problems/array-partition/) | 🟢 Easy | [Java](./src/arrays/countingSort/Array_Partition_561.java) |
| 1636 | [Sort Array by Increasing Frequency](https://leetcode.com/problems/sort-array-by-increasing-frequency/) | 🟢 Easy | [Java](./src/arrays/sorting/Sort_Arr_Increasing_Frequency_1636.java) |

</details>

<details>
<summary><b>🔤 Strings</b> — 77 solutions</summary>

| # | Problem | Level | Solution |
|:-:|:--|:-:|:-:|
| 3 | [Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/) | 🟡 Medium | [Java](./src/strings/medium/_3_Longest_Substring_Without_Repeating_Characters.java) |
| 13 | [Roman to Integer](https://leetcode.com/problems/roman-to-integer/) | 🟢 Easy | [Java](./src/strings/easy/RomanToInteger_13.java) |
| 20 | [Valid Parentheses](https://leetcode.com/problems/valid-parentheses/) | 🟢 Easy | [Java](./src/strings/easy/ValidParenthes.java) |
| 43 | [Multiply Strings](https://leetcode.com/problems/multiply-strings/) | 🟡 Medium | [Java](./src/strings/medium/MultiplyString_43.java) |
| 58 | [Length of Last Word](https://leetcode.com/problems/length-of-last-word/) | 🟢 Easy | [Java](./src/strings/easy/LastWordLength.java) |
| 91 | [Decode Ways](https://leetcode.com/problems/decode-ways/) | 🟡 Medium | [Java](./src/strings/medium/_91_Decode_Ways.java) |
| 151 | [Reverse Words in a String](https://leetcode.com/problems/reverse-words-in-a-string/) | 🟡 Medium | [Java](./src/strings/medium/_151_Reverse_Words_String.java) |
| 168 | [Excel Sheet Column Title](https://leetcode.com/problems/excel-sheet-column-title/) | 🟢 Easy | [Java](./src/strings/easy/_168_Excel_Sheet_Column_Title.java) |
| 171 | [Excel Sheet Column Number](https://leetcode.com/problems/excel-sheet-column-number/) | 🟢 Easy | [Java](./src/strings/easy/_171_Excel_Sheet_Column_Number.java) |
| 205 | [Isomorphic Strings](https://leetcode.com/problems/isomorphic-strings/) | 🟢 Easy | [Java](./src/strings/easy/Isomorphic_205.java) |
| 224 | [Basic Calculator](https://leetcode.com/problems/basic-calculator/) | 🔴 Hard | [Java](./src/strings/hard/_224_Basic_Calculator.java) |
| 227 | [Basic Calculator II](https://leetcode.com/problems/basic-calculator-ii/) | 🟡 Medium | [Java](./src/strings/medium/_227_Basic_Calculator.java) |
| 242 | [Valid Anagram](https://leetcode.com/problems/valid-anagram/) | 🟢 Easy | [Java](./src/strings/easy/ValidAnagram.java) |
| 290 | [Word Pattern](https://leetcode.com/problems/word-pattern/) | 🟢 Easy | [Java](./src/strings/easy/WordPattern.java) |
| 345 | [Reverse Vowels of a String](https://leetcode.com/problems/reverse-vowels-of-a-string/) | 🟢 Easy | [Java](./src/strings/easy/Reverse_Vowel_345.java) |
| 383 | [Ransom Note](https://leetcode.com/problems/ransom-note/) | 🟢 Easy | [Java](./src/strings/easy/RansomNote_383.java) |
| 387 | [First Unique Character in a String](https://leetcode.com/problems/first-unique-character-in-a-string/) | 🟢 Easy | [Java](./src/strings/easy/FirstUniqChar_387.java) |
| 389 | [Find the Difference](https://leetcode.com/problems/find-the-difference/) | 🟢 Easy | [Java](./src/strings/easy/FindDifference_389.java) |
| 392 | [Is Subsequence](https://leetcode.com/problems/is-subsequence/) | 🟢 Easy | [Java](./src/strings/easy/_392_Is_Subsequence.java) |
| 394 | [Decode String](https://leetcode.com/problems/decode-string/) | 🟡 Medium | [Java](./src/strings/medium/_394_Decode_String.java) |
| 415 | [Add Strings](https://leetcode.com/problems/add-strings/) | 🟢 Easy | [Java](./src/strings/easy/Add_String_415.java) |
| 438 | [Find All Anagrams in a String](https://leetcode.com/problems/find-all-anagrams-in-a-string/) | 🟡 Medium | [Java](./src/strings/medium/_438_Find_All_Anagrams_String.java) |
| 443 | [String Compression](https://leetcode.com/problems/string-compression/) | 🟡 Medium | [Java](./src/strings/medium/StringCompression.java) |
| 451 | [Sort Characters By Frequency](https://leetcode.com/problems/sort-characters-by-frequency/) | 🟡 Medium | [Java](./src/strings/medium/_451_Sort_Characters_By_Frequency.java) |
| 485 | [Max Consecutive Ones](https://leetcode.com/problems/max-consecutive-ones/) | 🟢 Easy | [Java](./src/strings/easy/MaxConsecutiveOnes_485.java) |
| 520 | [Detect Capital](https://leetcode.com/problems/detect-capital/) | 🟢 Easy | [Java](./src/strings/easy/DetectCapital.java) |
| 541 | [Reverse String II](https://leetcode.com/problems/reverse-string-ii/) | 🟢 Easy | [Java](./src/strings/easy/_541_Reverse_String_2.java) |
| 557 | [Reverse Words in a String III](https://leetcode.com/problems/reverse-words-in-a-string-iii/) | 🟢 Easy | [Java](./src/strings/easy/ReverseWords.java) |
| 657 | [Robot Return to Origin](https://leetcode.com/problems/robot-return-to-origin/) | 🟢 Easy | [Java](./src/strings/easy/RobortReturn_657.java) |
| 680 | [Valid Palindrome II](https://leetcode.com/problems/valid-palindrome-ii/) | 🟢 Easy | [Java](./src/strings/easy/Valid_Palindrome_680.java) |
| 771 | [Jewels and Stones](https://leetcode.com/problems/jewels-and-stones/) | 🟢 Easy | [Java](./src/strings/easy/JewelsAndStones.java) |
| 838 | [Push Dominoes](https://leetcode.com/problems/push-dominoes/) | 🟡 Medium | [Java](./src/strings/medium/_838_Push_Dominoes.java) |
| 856 | [Score of Parentheses](https://leetcode.com/problems/score-of-parentheses/) | 🟡 Medium | [Java](./src/strings/medium/ScoreOfParentheses_856.java) |
| 884 | [Uncommon Words from Two Sentences](https://leetcode.com/problems/uncommon-words-from-two-sentences/) | 🟢 Easy | [Java](./src/strings/easy/_884_Uncommon_Words_Two_Sentences.java) |
| 1021 | [Remove Outermost Parentheses](https://leetcode.com/problems/remove-outermost-parentheses/) | 🟢 Easy | [Java](./src/strings/easy/RemoveOuterParenthese.java) |
| 1047 | [Remove All Adjacent Duplicates In String](https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/) | 🟢 Easy | [Java](./src/strings/easy/RemoveAllDuplicates_1047.java) |
| 1071 | [Greatest Common Divisor of Strings](https://leetcode.com/problems/greatest-common-divisor-of-strings/) | 🟢 Easy | [Java](./src/strings/easy/_1071_Greatest_Common_Divisor_of_Strings.java) |
| 1154 | [Day of the Year](https://leetcode.com/problems/day-of-the-year/) | 🟢 Easy | [Java](./src/strings/easy/_1154_Day_Of_The_Year.java) |
| 1209 | [Remove All Adjacent Duplicates in String II](https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string-ii/) | 🟡 Medium | [Java](./src/strings/medium/_1209_Remove_All_Adjacent_Duplicates_String_2.java) |
| 1309 | [Decrypt String from Alphabet to Integer Mapping](https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/) | 🟢 Easy | [Java](./src/strings/easy/DecryptIntMapping_1309.java) |
| 1332 | [Remove Palindromic Subsequences](https://leetcode.com/problems/remove-palindromic-subsequences/) | 🟢 Easy | [Java](./src/strings/easy/RemovePalindromeSub_1332.java) |
| 1370 | [Increasing Decreasing String](https://leetcode.com/problems/increasing-decreasing-string/) | 🟢 Easy | [Java](./src/strings/easy/IncreasDecreasString_1370.java) |
| 1374 | [Generate a String With Characters That Have Odd Counts](https://leetcode.com/problems/generate-a-string-with-characters-that-have-odd-counts/) | 🟢 Easy | [Java](./src/strings/easy/GenerateStringOddCount_1374.java) |
| 1436 | [Destination City](https://leetcode.com/problems/destination-city/) | 🟢 Easy | [Java](./src/strings/easy/DestinationCity_1436.java) |
| 1446 | [Consecutive Characters](https://leetcode.com/problems/consecutive-characters/) | 🟢 Easy | [Java](./src/strings/easy/ConsecutiveCharacter.java) |
| 1544 | [Make The String Great](https://leetcode.com/problems/make-the-string-great/) | 🟢 Easy | [Java](./src/strings/easy/_1544_Make_The_String_Great.java) |
| 1556 | [Thousand Separator](https://leetcode.com/problems/thousand-separator/) | 🟢 Easy | [Java](./src/strings/easy/ThousandSeparator.java) |
| 1614 | [Maximum Nesting Depth of the Parentheses](https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/) | 🟢 Easy | [Java](./src/strings/easy/MaxNestingDepth.java) |
| 1647 | [Minimum Deletions to Make Character Frequencies Unique](https://leetcode.com/problems/minimum-deletions-to-make-character-frequencies-unique/) | 🟡 Medium | [Java](./src/strings/medium/_1647_Min_Deletions_Make_Character_Frequencies_Unique.java) |
| 1657 | [Determine if Two Strings Are Close](https://leetcode.com/problems/determine-if-two-strings-are-close/) | 🟡 Medium | [Java](./src/strings/medium/_1657_Determine_Two_Strings_Are_Close.java) |
| 1684 | [Count the Number of Consistent Strings](https://leetcode.com/problems/count-the-number-of-consistent-strings/) | 🟢 Easy | [Java](./src/strings/easy/CountConsistStrings_1684.java) |
| 1704 | [Determine if String Halves Are Alike](https://leetcode.com/problems/determine-if-string-halves-are-alike/) | 🟢 Easy | [Java](./src/strings/easy/AlikeString_1704.java) |
| 1768 | [Merge Strings Alternately](https://leetcode.com/problems/merge-strings-alternately/) | 🟢 Easy | [Java](./src/strings/easy/MergeString_1768.java) |
| 1773 | [Count Items Matching a Rule](https://leetcode.com/problems/count-items-matching-a-rule/) | 🟢 Easy | [Java](./src/strings/easy/CountItemMatchs.java) |
| 1812 | [Determine Color of a Chessboard Square](https://leetcode.com/problems/determine-color-of-a-chessboard-square/) | 🟢 Easy | [Java](./src/strings/easy/ChessboardColor_1812.java) |
| 1832 | [Check if the Sentence Is Pangram](https://leetcode.com/problems/check-if-the-sentence-is-pangram/) | 🟢 Easy | [Java](./src/strings/easy/CheckPanagrams.java) |
| 1844 | [Replace All Digits with Characters](https://leetcode.com/problems/replace-all-digits-with-characters/) | 🟢 Easy | [Java](./src/strings/easy/ReplaceAllDigitChar.java) |
| 1859 | [Sorting the Sentence](https://leetcode.com/problems/sorting-the-sentence/) | 🟢 Easy | [Java](./src/strings/easy/SortingSentence.java) |
| 1869 | [Longer Contiguous Segments of Ones than Zeros](https://leetcode.com/problems/longer-contiguous-segments-of-ones-than-zeros/) | 🟢 Easy | [Java](./src/strings/easy/ContigiousSegment_1869.java) |
| 1903 | [Largest Odd Number in String](https://leetcode.com/problems/largest-odd-number-in-string/) | 🟢 Easy | [Java](./src/strings/easy/LargestOddString_1903.java) |
| 1935 | [Maximum Number of Words You Can Type](https://leetcode.com/problems/maximum-number-of-words-you-can-type/) | 🟢 Easy | [Java](./src/strings/easy/MaxWordType_1935.java) |
| 1941 | [Check if All Characters Have Equal Number of Occurrences](https://leetcode.com/problems/check-if-all-characters-have-equal-number-of-occurrences/) | 🟢 Easy | [Java](./src/strings/easy/AllEqualChar_1941.java) |
| 1945 | [Sum of Digits of String After Convert](https://leetcode.com/problems/sum-of-digits-of-string-after-convert/) | 🟢 Easy | [Java](./src/strings/easy/SumOfString_1945.java) |
| 1967 | [Number of Strings That Appear as Substrings in Word](https://leetcode.com/problems/number-of-strings-that-appear-as-substrings-in-word/) | 🟢 Easy | [Java](./src/strings/easy/SubString_Word_1967.java) |
| 2000 | [Reverse Prefix of Word](https://leetcode.com/problems/reverse-prefix-of-word/) | 🟢 Easy | [Java](./src/strings/easy/ReversePrefixWord_2000.java) |
| 2042 | [Check if Numbers Are Ascending in a Sentence](https://leetcode.com/problems/check-if-numbers-are-ascending-in-a-sentence/) | 🟢 Easy | [Java](./src/strings/easy/Ascending_Num_Sentence_2042.java) |
| 2047 | [Number of Valid Words in a Sentence](https://leetcode.com/problems/number-of-valid-words-in-a-sentence/) | 🟢 Easy | [Java](./src/strings/easy/Valid_Word_2047.java) |
| 2124 | [Check if All A's Appears Before All B's](https://leetcode.com/problems/check-if-all-as-appears-before-all-bs/) | 🟢 Easy | [Java](./src/strings/easy/Check_All_A_2124.java) |
| 2129 | [Capitalize the Title](https://leetcode.com/problems/capitalize-the-title/) | 🟢 Easy | [Java](./src/strings/easy/_2129_Capitalize_Title.java) |
| 2194 | [Cells in a Range on an Excel Sheet](https://leetcode.com/problems/cells-in-a-range-on-an-excel-sheet/) | 🟢 Easy | [Java](./src/strings/easy/_2194_Cells_Range_Excel_Sheet.java) |
| 2278 | [Percentage of Letter in String](https://leetcode.com/problems/percentage-of-letter-in-string/) | 🟢 Easy | [Java](./src/strings/easy/_2278_Percentage_Letter_String.java) |
| 2283 | [Check if Number Has Equal Digit Count and Digit Value](https://leetcode.com/problems/check-if-number-has-equal-digit-count-and-digit-value/) | 🟢 Easy | [Java](./src/strings/easy/_2283_Number_Has_Equal_Digit_Count_Digit_Value.java) |
| 2309 | [Greatest English Letter in Upper and Lower Case](https://leetcode.com/problems/greatest-english-letter-in-upper-and-lower-case/) | 🟢 Easy | [Java](./src/strings/easy/_2309_Greatest_English_Letter_Upper_Lower_Case.java) |
| 2351 | [First Letter to Appear Twice](https://leetcode.com/problems/first-letter-to-appear-twice/) | 🟢 Easy | [Java](./src/strings/easy/_2351_First_Letter_Appear_Twice.java) |
| 2399 | [Check Distances Between Same Letters](https://leetcode.com/problems/check-distances-between-same-letters/) | 🟢 Easy | [Java](./src/strings/easy/_2399_Check_Distances_Between_Same_Letters.java) |
| 2423 | [Remove Letter To Equalize Frequency](https://leetcode.com/problems/remove-letter-to-equalize-frequency/) | 🟢 Easy | [Java](./src/strings/easy/_2423_Remove_Letter_To_Equalize_Frequency.java) |
| 2586 | [Count the Number of Vowel Strings in Range](https://leetcode.com/problems/count-the-number-of-vowel-strings-in-range/) | 🟢 Easy | [Java](./src/strings/easy/_2586_Count_Num_Of_Vowel_Strings_In_Range.java) |

</details>

<details>
<summary><b>🔍 Binary Search</b> — 7 solutions</summary>

| # | Problem | Level | Solution |
|:-:|:--|:-:|:-:|
| 153 | [Find Minimum in Rotated Sorted Array](https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/) | 🟡 Medium | [Java](./src/binarySearch/_153_Find_Minimum_Rotated_Sorted_Array.java) |
| 154 | [Find Minimum in Rotated Sorted Array II](https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/) | 🔴 Hard | [Java](./src/binarySearch/_154_Find_Minimum_Rotated_Sorted_Array_2.java) |
| 349 | [Intersection of Two Arrays](https://leetcode.com/problems/intersection-of-two-arrays/) | 🟢 Easy | [Java](./src/binarySearch/easy/Intersection_Of_Two_Array_349.java) |
| 367 | [Valid Perfect Square](https://leetcode.com/problems/valid-perfect-square/) | 🟢 Easy | [Java](./src/binarySearch/_367_Valid_Perfect_Square.java) |
| 744 | [Find Smallest Letter Greater Than Target](https://leetcode.com/problems/find-smallest-letter-greater-than-target/) | 🟢 Easy | [Java](./src/binarySearch/easy/_744_Find_Smallest_Letter_Greater_Than_Target.java) |
| 852 | [Peak Index in a Mountain Array](https://leetcode.com/problems/peak-index-in-a-mountain-array/) | 🟡 Medium | [Java](./src/binarySearch/easy/Mountain_Array_Index_852.java) |
| 1351 | [Count Negative Numbers in a Sorted Matrix](https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/) | 🟢 Easy | [Java](./src/binarySearch/easy/CountNegNum_1351.java) |

</details>

<details>
<summary><b>🪟 Sliding Window</b> — 2 solutions</summary>

| # | Problem | Level | Solution |
|:-:|:--|:-:|:-:|
| 209 | [Minimum Size Subarray Sum](https://leetcode.com/problems/minimum-size-subarray-sum/) | 🟡 Medium | [Java](./src/slidingwindow/_209_Minimum_Size_Subarray_Sum.java) |
| 1876 | [Substrings of Size Three with Distinct Characters](https://leetcode.com/problems/substrings-of-size-three-with-distinct-characters/) | 🟢 Easy | [Java](./src/slidingwindow/_1876_Substrings_Of_Size_Three_Distinct_Characters.java) |

</details>

<details>
<summary><b>🧩 Dynamic Programming</b> — 2 solutions</summary>

| # | Problem | Level | Solution |
|:-:|:--|:-:|:-:|
| 70 | [Climbing Stairs](https://leetcode.com/problems/climbing-stairs/) | 🟢 Easy | [Java](./src/dynamicProgramming/easy/ClimbingStairs_70.java) |
| 1137 | [N-th Tribonacci Number](https://leetcode.com/problems/n-th-tribonacci-number/) | 🟢 Easy | [Java](./src/dynamicProgramming/easy/TribunacciNumber_1137.java) |

</details>

<details>
<summary><b>🔗 Linked List</b> — 2 solutions</summary>

| # | Problem | Level | Solution |
|:-:|:--|:-:|:-:|
| 83 | [Remove Duplicates from Sorted List](https://leetcode.com/problems/remove-duplicates-from-sorted-list/) | 🟢 Easy | [Java](./src/linkedList/RemoveDuplicates_83.java) |
| 876 | [Middle of the Linked List](https://leetcode.com/problems/middle-of-the-linked-list/) | 🟢 Easy | [Java](./src/linkedList/MiddleNode_876.java) |

</details>

<details>
<summary><b>📥 Queue</b> — 1 solutions</summary>

| # | Problem | Level | Solution |
|:-:|:--|:-:|:-:|
| 232 | [Implement Queue using Stacks](https://leetcode.com/problems/implement-queue-using-stacks/) | 🟢 Easy | [Java](./src/queue/easy/QueueUsingStack_232.java) |

</details>


## ▶️ How to run

Every solution is a self-contained Java class, most with a `main` method containing a sample input.

```bash
# Option 1 — IntelliJ IDEA: open the folder as a project, right-click any file → Run
# Option 2 — command line (JDK 8+):
cd src
javac strings/hard/_224_Basic_Calculator.java
java strings.hard._224_Basic_Calculator
```

---

<div align="center">

**Monira Meem** · Final-year B.Sc. Computer Science & Technology, Wuhan Institute of Technology

[GitHub profile](https://github.com/Monira-Meem) · [LeetCode solutions](https://github.com/Monira-Meem/LeetCode) · [HackerRank solutions](https://github.com/Monira-Meem/HackerRank) · [GeeksforGeeks solutions](https://github.com/Monira-Meem/GeeksforGeeks)

⭐ If you find a solution useful, a star is appreciated.

</div>
