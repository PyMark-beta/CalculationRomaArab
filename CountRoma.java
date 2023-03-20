public class CountRoma {
    String[] romaResult = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X",
            "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
            "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX",
            "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
            "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L",
            "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
            "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
            "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX",
            "LXXX",
            "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII",
            "LXXXIX", "XC",
            "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};

    public String countRoma(String operandFirst, String operandSecond, String operation) throws OperationException {
        FinalCount finalCount = new FinalCount();
        RunArray runArray = new RunArray();
        int operandFirstRoma = runArray.iterationArray(operandFirst);
        int operandSecondRoma = runArray.iterationArray(operandSecond);
        if (operation.equals("-") && operandSecondRoma >= operandFirstRoma ||
                operation.equals("/") && operandSecondRoma >= operandFirstRoma) {
            throw new OperationException("В римской системе нет отрицательных чисел и нуля");
        } else {
            return romaResult[finalCount.calculation(operandFirstRoma, operandSecondRoma, operation)];
        }
    }
}