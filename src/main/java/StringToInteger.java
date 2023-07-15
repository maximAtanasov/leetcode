class StringToInteger {

    public int myAtoi(String s) {
        char[] ch = s.toCharArray();

        int startOffset = 0;
        while (startOffset < ch.length && (ch[startOffset] == ' ')) {
            ++startOffset;
        }

        int positive = 1;
        if (startOffset < ch.length && (ch[startOffset] == '-' || ch[startOffset] == '+')) {
            positive = (~(ch[startOffset] >> 2) - 10) & 1;
            ++startOffset;
        }
        int neg = ~positive & 1;
        int absLimit = Integer.MIN_VALUE + positive;
        int absLimitDiv = absLimit / 10;
        int result = 0;
        while (startOffset < ch.length) {
            int digit = ch[startOffset++] - 48;
            if (digit < 0 || digit > 9) {
                if (result < 0) {
                    break;
                }
                return 0;
            }
            if (result < absLimitDiv) {
                return Integer.MAX_VALUE + neg;
            }
            result *= 10;
            if (result < absLimit + digit) {
                return Integer.MAX_VALUE + neg;
            }
            result -= digit;
        }
        return neg * result + positive * -result;
    }
}