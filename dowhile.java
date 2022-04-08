public class dowhile {
    public static void main(String arg[]) {
        int i = 1, count = 0;
        do {
            System.out.println("before  if loop " + i + "= " + count);
            if (i % 2 == 0) {
                count++;
                System.out.println(" in if loop " + i + " = " + count);

            }
            i++;
        } while (i <= 10);
        System.out.println(count);
    }

}
