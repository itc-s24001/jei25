public class D51Q5kadai {
    public static void main(String[] args) {
        double[] level = {0.0, 24.0, 57.0, Double.MAX_VALUE};
        double[] unit = {0.0, 2.0, 3.0, 5.0};
        int[] rate = {0, 20, 18, 15}; // 各単価を+1円

        if (args.length != 1) {
            System.out.println("引数の個数が不正");
            return;
        }

        double amount = Double.parseDouble(args[0]);
        if (amount < 0.0) {
            System.out.println("0.0以上の使用量を入力");
            return;
        }

        int price = 1300; // 基本料金を1200円から1300円に変更

        for (int i = 1; i < level.length; i++) {
            if (amount < level[i]) {
                price += (int) Math.ceil((amount - level[i - 1]) / unit[i]) * rate[i];
                break;
            } else {
                price += (int) Math.ceil((level[i] - level[i - 1]) / unit[i]) * rate[i];
            }
        }

        System.out.println("今月のガス代金は" + price + "円");
    }
}
