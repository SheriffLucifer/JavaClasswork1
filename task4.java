public class task4 {
    public static void main(String[] args) {
        System.out.println(ex3("Добро пожаловать на курс по JAVA"));
    }

    static String ex3(String text) {
        /*
         * Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном
         * порядке.
         */
        String res = "";
        String[] temp = text.split(" ");
        for (int i = temp.length - 1; i >= 0; i--) {
            res += temp[i] + " ";
        }
        return res;
    }
}
