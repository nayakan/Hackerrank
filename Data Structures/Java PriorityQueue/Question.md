
You have to deal with 2 types of events: ENTER (a student enters the queue) or SERVED.

A unique token is assigned to any student entering the queue. The queue serves the students based on the following criteria:

1. The student having the highest Cumulative Grade Point Average (CGPA) is served first.
2. Any students having the same CGPA will be served by name in ascending case-sensitive alphabetical order.
3. Any students having the same CGPA and name will be served in ascending token order.

Given a sequence of n events, print the names of students who are yet to be served(based on above criteria). 
If the queue is empty, print EMPTY.

Input Format

The first line contains an integer, n, denoting the total number of events. Each of the n subsequent lines will be of the following two forms:

1. ENTER name CGPA token - The student to be inserted into the priority queue.
2. SERVED - The highest priority student in the queue was served.

Output Format

Print the names (based on the criteria) of the students who are not served at all after executing all n events; 
if every student in the queue was served, then print EMPTY.

Sample Input

12
ENTER John 3.75 50
ENTER Mark 3.8 24
ENTER Shafaet 3.7 35
SERVED
SERVED
ENTER Samiha 3.85 36
SERVED
ENTER Ashley 3.9 42
ENTER Maria 3.6 46
ENTER Anik 3.95 49
ENTER Dan 3.95 50
SERVED
Sample Output

Dan
Ashley
Shafaet
Maria
