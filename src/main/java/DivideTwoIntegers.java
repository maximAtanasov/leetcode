class DivideTwoIntegers {

    public int divide(int dividend, int divisor) {
        long result = 1;

        if (dividend == 0) {
            return 0;
        }
        if (dividend == divisor) {
            return 1;
        }

        int op1 = 0;
        if (dividend == Integer.MIN_VALUE) {
            op1 = dividend;
        } else {
            op1 = -Math.abs(dividend);
        }

        int op2 = 0;
        if (divisor == Integer.MIN_VALUE) {
            op2 = divisor;
        } else {
            op2 = -Math.abs(divisor);
        }

        if (op2 == -1) {
            result = op1;
        } else if (op2 == -2) {
            return dividend >> 1;
        } else if (op2 == -3) {
            result = 0;
            while (op1 < -3) {
                result -= -op1 >>> 2;
                op1 = -((-op1 >>> 2) + (-op1 & 3));
            }
            if (op1 == -3) {
                result--;
            }
        } else if (op2 == -4) {
            return dividend >> 2;
        } else {
            while (op1 <= 0) {
                op1 = op1 - op2;
                result -= 1;
            }
        }

        if ((dividend > 0 && divisor > 0) || (dividend < 0 && divisor < 0)) {
            result = -result;
        }

        if (result > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        if (result < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        return (int) result;
    }
}