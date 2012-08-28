public class Exercise_1_1_11 {
    public static void main(String[] args) {
        boolean[][] bdarray = {
            {false, true, false},
            {false, false, false},
            {true, true, true},
            {false, true, true}
        };
        System.out.println(bdarray.length + ", " + bdarray[0].length);
        for (int i = 0; i < bdarray.length; i++) {
            for (int j = 0; j < bdarray[i].length; j++)
                System.out.print("|" + (bdarray[i][j] ? "*" : " "));
            System.out.println("|");
        }
    }
}