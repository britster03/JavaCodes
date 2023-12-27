class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder str = new StringBuilder();

        int i = num1.length() - 1, j = num2.length() - 1, carry = 0, sum;

        while (i >= 0 || j >= 0 || carry > 0) {
            int digit1 = (i >= 0) ? num1.charAt(i--) - '0' : 0;
            int digit2 = (j >= 0) ? num2.charAt(j--) - '0' : 0;

            sum = digit1 + digit2 + carry;
            str.append(sum % 10);
            carry = sum / 10;
        }

        return str.reverse().toString();
    }
}




// Initialization:

// num1 = "456"
// num2 = "77"
// str is a StringBuilder used to build the result.
// i = 2 (index for num1)
// j = 1 (index for num2)
// carry = 0
// Main Loop:

// The loop continues until both i and j are less than 0, and there is no remaining carry.
// First iteration:
// digit1 = 6 (last digit of num1)
// digit2 = 7 (last digit of num2)
// sum = 6 + 7 + 0 = 13
// Append sum % 10 to str, which is 3.
// Update carry to sum / 10, which is 1.
// Move to the next iteration with i = 1 and j = 0.
// Second iteration:
// digit1 = 5 (second-to-last digit of num1)
// digit2 = 7 (second-to-last digit of num2)
// sum = 5 + 7 + 1 = 13
// Append sum % 10 to str, which is 3.
// Update carry to sum / 10, which is 1.
// Move to the next iteration with i = 0 and j = -1.
// Third iteration:
// digit1 = 4 (first digit of num1)
// digit2 = 0 (no more digits in num2)
// sum = 4 + 0 + 1 = 5
// Append sum % 10 to str, which is 5.
// Update carry to sum / 10, which is 0.
// Move to the next iteration with i = -1 and j = -2.
// The loop exits as both i and j are less than 0, and there is no remaining carry.
// Result:

// Reverse the str, which is "533".
// Returning Result:

// Return the string "533" as the output.
// Explanation: The code simulates the addition of two numbers digit by digit using the StringBuilder and handles the carry appropriately. It iterates through both input strings from the least significant digit to the most significant digit, adding corresponding digits along with the carry. The result is then reversed and returned as a string. In this specific case, for the input num1 = "456" and num2 = "77", the output is "533", which is the correct sum of the two numbers.