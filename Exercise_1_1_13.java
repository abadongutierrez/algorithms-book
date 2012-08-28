public class Exercise_1_1_13 {
    public static void main(String[] args) {
        int[][] bdarray = {
            {1,2,3,4,5},
            {11,22,33,44,55},
            {111,222,333,444,555}
        };

        for (int i = 0; i < 5; ++i) {
            for (int j = 0; j < 3; ++j)
                System.out.print("|"+bdarray[j][4 - i]);
            System.out.println("|");
        }
    }
}