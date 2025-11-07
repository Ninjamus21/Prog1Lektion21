package opgave03;

public class app {
    public static void main(String[] args) {
        NumberList numberList = new NumberList();
        var numbers = numberList.getTxtnumber();
        numberList.printArrayList(numberList.reverseArrayList(numbers));
    }
}
