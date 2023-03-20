class CountArab {
    public String countArab(String operandFirst, String operandSecond, String operation) throws OperationException {

        FinalCount finalCount = new FinalCount();
        int operandFirstArab = Integer.parseInt(operandFirst);
        int operandSecondArab = Integer.parseInt(operandSecond);

        return Integer.toString(finalCount.calculation(operandFirstArab, operandSecondArab, operation));
    }
}