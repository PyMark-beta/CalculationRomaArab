import java.util.Arrays;


class Main {
    static CountRoma countRoma = new CountRoma();
    static CountArab countArab = new CountArab();

    public static String examination(String input) throws OperationException {
        String result;
        String[] expression = input.split(" ", 5);
        String examinationNumberFirst = expression[0].toUpperCase();
         String examinationNumberSecond = expression[2].toUpperCase();
         String examinationChar =expression[1];

         String[] romaNumber = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
         boolean examinationRoma =
                Arrays.asList(romaNumber).contains(examinationNumberFirst) &&
                        Arrays.asList(romaNumber).contains(examinationNumberSecond);
         String[] arabNumber = {"", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
         boolean examinationArab =
                Arrays.asList(arabNumber).contains(examinationNumberFirst) &&
                        Arrays.asList(arabNumber).contains(examinationNumberSecond);
        if (examinationRoma) {
            result = countRoma.countRoma
                    (examinationNumberFirst,
                            examinationNumberSecond,
                            examinationChar);;
            return result;
        } else if (examinationArab) {
            result = countArab.countArab
                    (examinationNumberFirst,
                            examinationNumberSecond,
                            examinationChar);;
            return result;
        } else {
            throw new OperationException("Используются одновременно разные системы счисления " +
                    ": Неподходящее число " +
                    ": Неправильно введённое выражение");
        }
    }
}