class StrongNumbers {
    public static void main(String[] args) {
        for (int num = 1; num <= 100; num++) {
            int original = num, remainder, sum = 0;

            while (original != 0) {
                int factorial = 1;
                remainder = original % 10;

                for (int i = 1; i <= remainder; i++) {
                    factorial *= i;
                }

                sum += factorial;
                original /= 10;
            }

            if (sum == num) {
                System.out.println(num + " is a strong number.");
            }
        }
    }
}

