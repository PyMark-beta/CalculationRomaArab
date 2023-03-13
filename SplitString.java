import java.util.Scanner;

public class SplitString {
    static Scanner sc = new Scanner(System.in);
    static String[] expression = sc.nextLine().split(" ", 5);

    public String examination(String str1) {
        if (examination()) {
            return expression[0];
        } else {
            throw new OperationException("Строка не является математической операцией или неверно введена");
        }
    }

    public String examination(String str1, String str2) {
        return expression[1];
    }

    public String examination(String str1, String str2, String str3) {
        return expression[2];
    }

    public boolean examination() {
        return expression.length == 3;
    }
}