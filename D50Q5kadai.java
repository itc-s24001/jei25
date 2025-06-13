public class D50Q5kadai {
    public static void main(String[] args) {
        int[] num = new int[args.length];

        // 引数を整数に変換
        for (int i = 0; i < args.length; i++) {
            num[i] = Integer.parseInt(args[i]);
        }

        int tmp;
        for (int i = 1; i < num.length; i++) {
            for (int j = i - 1; j >= 0 && num[j] > num[j + 1]; j--) {
                // 値の交換
                tmp = num[j];
                num[j] = num[j + 1];
                num[j + 1] = tmp;

                // ソート途中の配列出力
                System.out.print("ソート途中:");
                for (int k = 0; k < num.length; k++) {
                    System.out.print(num[k]);
                    if (k < num.length - 1) System.out.print(" ");
                }
                System.out.println();
            }
        }

        // 結果出力
        System.out.println("-------------------");
        System.out.print("ソート結果:");
        for (int val : num) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
