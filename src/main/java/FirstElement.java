class Getter {
    static <Gen> String getFirstElement(Gen[] array) {
        return array[0] != null ? array[0].toString() : null;
    }
}

public class FirstElement {
    public static void main(String[] args) {
        Integer[] inputInt = { 1, 2, 3 };
        Integer[] inputEmpty = new Integer[5];
        String[] inputStr = { "Cake", "Donut", "Cupcake" };

        System.out.println(Getter.getFirstElement(inputInt)); // 1
        System.out.println(Getter.getFirstElement(inputEmpty)); // null
        System.out.println(Getter.getFirstElement(inputStr)); // Cake
    }
}
