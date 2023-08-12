Case Study: Lottery
The lottery program involves generating random numbers, comparing digits, and 
using Boolean operators.
 Suppose you want to develop a program to play lottery. The program randomly generates a 
lottery of a two-digit number, prompts the user to enter a two-digit number, and determines 
whether the user wins according to the following rules:
1. If the user input matches the lottery number in the exact order, the award is $10,000.
2. If all digits in the user input match all digits in the lottery number, the award is $3,000.
3. If one digit in the user input matches a digit in the lottery number, the award is $1,000.
Note the digits of a two-digit number may be 0. If a number is less than 10, we assume that 
the number is preceded by a 0 to form a two-digit number. For example, number 8 is treated 
as 08, and number 0 is treated as 00 in the program. Listing 3.8 gives the complete program.

The program generates a lottery using the random() method (line 6) and prompts the user 
to enter a guess (line 11). Note guess % 10 obtains the last digit from guess and guess 
/10 obtains the first digit from guess, since guess is a two-digit number (lines 18 and 19).
The program checks the guess against the lottery number in this order:
1. First, check whether the guess matches the lottery exactly (line 24).
2. If not, check whether the reversal of the guess matches the lottery (lines 26 and 27).
3. If not, check whether one digit is in the lottery (lines 29–32).
4. If not, nothing matches and display "Sorry, no match" (lines 34 and 35).
