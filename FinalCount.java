class FinalCount {
    public int calculation(int operandFirst, int operandSecond, String operator) throws OperationException {
        int result = 0;

        switch (operator) {
            case "+":
                result = operandFirst + operandSecond;
                break;
            case "-":
                result = operandFirst - operandSecond;
                break;
            case "/":
                result = operandFirst / operandSecond;
                break;
            case "*":
                result = operandFirst * operandSecond;
                break;
            default:
                throw new OperationException("Неверно введённый оператор");
        }

        return result;
    }
}