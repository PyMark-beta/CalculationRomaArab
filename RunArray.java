class RunArray {
    static String[] romaNumber = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

    public int iterationArray(String str) {
        int j = 0;
        for (int i = 0; i < romaNumber.length; i++) {
            if (str.equals(romaNumber[i])) {
                j = i;
            }
        }
        return j;
    }
}