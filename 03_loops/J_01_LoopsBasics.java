public class J_01_LoopsBasics {

    public static void main(String[] args) {

        // LOOPS

        for (int i = 0; i < 11; i = i + 1) {
            System.out.println(i);
        }
        // for (int i = 0; ; i = i + 1) {
        // System.out.println(i);
        // } // This is a infinite loops bcz condition is missing that reason loops is
        // not stop .

        int i = 0;
        while (i < 11) {
            System.out.print(i + " ");
            i++; // i=i+1 ==> i++
        }
        System.out.println();

        do {
            System.out.print(i + " "); // this is for print out put in one line with space
            i++; // i=i+1 ==> i++
        } while (i < 21);
        // In do-while loops execute atlest one time bcz condition is checked after
        // execuete loops 1 time
        // where another side that while loops execute after condition is true .

        // int i = 0;
        // while (i < 11) {
        // System.out.print(i + " ");
        // } //This is a infinite loops bcz dcondition is allways true.

    }
}
