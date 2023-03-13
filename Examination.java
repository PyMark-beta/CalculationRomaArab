import java.util.Arrays;

public class Examination {
    SplitString splitString = new SplitString();
    CountRoma countRoma = new CountRoma();
    CountArab countArab = new CountArab();
    String examinationNumberFirst = splitString.examination(SplitString.expression[0]).toUpperCase();
    String examinationNumberSecond = splitString.examination
            (SplitString.expression[0],
                    SplitString.expression[1],
                    SplitString.expression[2]).toUpperCase();
    String examinationChar = splitString.examination(SplitString.expression[0], SplitString.expression[1]);

    String[] romaNumber = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
    boolean examinationRoma =
            Arrays.asList(romaNumber).contains(examinationNumberFirst) &&
                    Arrays.asList(romaNumber).contains(examinationNumberSecond);
    String[] arabNumber = {"", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    boolean examinationArab =
            Arrays.asList(arabNumber).contains(examinationNumberFirst) &&
                    Arrays.asList(arabNumber).contains(examinationNumberSecond);

    public String examination() throws OperationException {
        if (examinationRoma && !examinationArab) {
            return countRoma.countRoma
                    (examinationNumberFirst,
                            examinationNumberSecond,
                            examinationChar);
        } else if (examinationArab) {
            return countArab.countArab
                    (examinationNumberFirst,
                            examinationNumberSecond,
                            examinationChar);
        } else {
            throw new OperationException("Используются одновременно разные системы счисления " +
                    ": Неподходящее число " +
                    ": Неправильно введённое выражение");
        }
    }
}