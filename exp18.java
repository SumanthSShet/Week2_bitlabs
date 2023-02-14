class ArmstrongNumbers {
    public static void main(String[] args) {
        for (int num = 1; num <= 100; num++) {
            int original = num, remainder, result = 0;
            int n = String.valueOf(num).length();

            while (original != 0) {
                remainder = original % 10;
                result += Math.pow(remainder, n);
                original /= 10;
            }

            if (result == num) {
                System.out.println(num + " is an Armstrong number.");
            }
        }
    }
}
