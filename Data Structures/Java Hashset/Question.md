
In computer science, a set is an abstract data type that can store certain values, without any particular order, 
and no repeated values(Wikipedia). {1,2,3} is an example of a set, but {1,2,2} is not a set. 

You are given n pairs of strings. Two pairs (a,b) and (c,d) are identical if a = c and b = d. That also implies (a,b) is 
not same as (b,a). After taking each pair as input, you need to print number of unique pairs you currently have.

Complete the code in the editor to solve this problem.

Input Format

In the first line, there will be an integer T denoting number of pairs. Each of the nextT  lines will contain two strings 
seperated by a single space.

Output Format

Print T lines. In the ith line, print number of unique pairs you have after taking ith pair as input.

Sample Input

5
john tom
john mary
john tom
mary anna
mary anna
Sample Output

1
2
2
3
3
