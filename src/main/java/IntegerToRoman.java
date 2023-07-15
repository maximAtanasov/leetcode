class IntegerToRoman {

    public String intToRoman(int num) {
        String numAsString = Integer.toString(num);
        if (numAsString.length() == 1) {
            return lastDigitToRoman(numAsString);
        }
        if (numAsString.length() == 2) {
            return secondDigitToRoman(numAsString.substring(0, 1)) + lastDigitToRoman(numAsString.substring(1, 2));
        }
        if (numAsString.length() == 3) {
            return thirdDigitToRoman(numAsString.substring(0, 1)) + secondDigitToRoman(numAsString.substring(1, 2)) + lastDigitToRoman(numAsString.substring(2, 3));
        }
        return fourthDigitToRoman(numAsString.substring(0, 1)) + thirdDigitToRoman(numAsString.substring(1, 2)) + secondDigitToRoman(numAsString.substring(2, 3)) + lastDigitToRoman(numAsString.substring(3, 4));
    }

    private String fourthDigitToRoman(String digit) {
        switch (digit) {
            case "1":
                return "M";
            case "2":
                return "MM";
            case "3":
                return "MMM";
            default:
                return "";
        }
    }

    private String thirdDigitToRoman(String digit) {
        switch (digit) {
            case "1":
                return "C";
            case "2":
                return "CC";
            case "3":
                return "CCC";
            case "4":
                return "CD";
            case "5":
                return "D";
            case "6":
                return "DC";
            case "7":
                return "DCC";
            case "8":
                return "DCCC";
            case "9":
                return "CM";
            default:
                return "";
        }
    }

    private String secondDigitToRoman(String digit) {
        switch (digit) {
            case "1":
                return "X";
            case "2":
                return "XX";
            case "3":
                return "XXX";
            case "4":
                return "XL";
            case "5":
                return "L";
            case "6":
                return "LX";
            case "7":
                return "LXX";
            case "8":
                return "LXXX";
            case "9":
                return "XC";
            default:
                return "";
        }
    }

    private String lastDigitToRoman(String digit) {
        switch (digit) {
            case "1":
                return "I";
            case "2":
                return "II";
            case "3":
                return "III";
            case "4":
                return "IV";
            case "5":
                return "V";
            case "6":
                return "VI";
            case "7":
                return "VII";
            case "8":
                return "VIII";
            case "9":
                return "IX";
            default:
                return "";
        }
    }
}