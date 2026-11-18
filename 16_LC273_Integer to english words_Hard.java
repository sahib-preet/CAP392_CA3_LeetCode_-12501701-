class Solution {

    String[] ones = {"", "One", "Two", "Three", "Four", "Five",
            "Six", "Seven", "Eight", "Nine", "Ten", "Eleven",
            "Twelve", "Thirteen", "Fourteen", "Fifteen",
            "Sixteen", "Seventeen", "Eighteen", "Nineteen"};

    String[] tens = {"", "", "Twenty", "Thirty", "Forty",
            "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    public String numberToWords(int num) {

        if (num == 0) {
            return "Zero";
        }

        String ans = "";

        if (num >= 1000000000) {
            ans += convert(num / 1000000000) + " Billion ";
            num = num % 1000000000;
        }

        if (num >= 1000000) {
            ans += convert(num / 1000000) + " Million ";
            num = num % 1000000;
        }

        if (num >= 1000) {
            ans += convert(num / 1000) + " Thousand ";
            num = num % 1000;
        }

        if (num > 0) {
            ans += convert(num);
        }

        return ans.trim().replaceAll(" +", " ");
    }

    public String convert(int num) {

        String ans = "";

        if (num >= 100) {
            ans += ones[num / 100] + " Hundred ";
            num = num % 100;
        }

        if (num >= 20) {
            ans += tens[num / 10] + " ";
            num = num % 10;
        }

        if (num > 0) {
            ans += ones[num] + " ";
        }

        return ans;
    }
}
