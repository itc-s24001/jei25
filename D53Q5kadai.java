public class D53Q5kadai {
    private static int[] taxes = {8, 10}; // [軽減税率8%, 標準税率10%]
    private static int FOODS = 0;  // 食品等（軽減税率8%）
    private static int OTHER = 1;  // その他（標準税率10%）

    public static void main(String[] args) {
        // (28) データ数をコマンドライン引数から取得
        int dataSize = Integer.parseInt(args[0]);

        String[] names = new String[dataSize]; // 商品名
        int[] prices = new int[dataSize]; // 単価
        int[] nums = new int[dataSize]; // 数量
        char[] types = new char[dataSize]; // タイプ（食品等又はその他）

        int argsIdx = 1;
        // (29) データ数分繰り返し処理
        for (int i = 0; i < dataSize; i++) {
            names[i] = args[argsIdx]; // (30) 商品名を取得
            argsIdx++;
            prices[i] = Integer.parseInt(args[argsIdx]); // (30) 単価を取得・変換
            argsIdx++;
            nums[i] = Integer.parseInt(args[argsIdx]); // (30) 数量を取得・変換
            argsIdx++;
            types[i] = args[argsIdx].charAt(0); // (30) タイプを取得（最初の文字）
            argsIdx++;
        }

        System.out.println("商品名\t税抜\t税込\tタイプ");

        // 合計金額を計算するための変数
        int totalZeinuki = 0;  // 税抜合計
        int totalZeikomi = 0;  // 税込合計

        // (29) データ数分繰り返し処理
        for (int i = 0; i < dataSize; i++) {
            int zeinuki = prices[i] * nums[i]; // 税抜価格
            int taxType = types[i] == 'f' ? FOODS : OTHER; // 税込価格，タイプによる税率の違い
            // (31) 税込価格の計算：税抜価格 * (100 + 税率) / 100
            int zeikomi = zeinuki * (100 + taxes[taxType]) / 100;

            // 合計に加算
            totalZeinuki += zeinuki;
            totalZeikomi += zeikomi;

            System.out.print(names[i] + "\t" + zeinuki + "円\t" + zeikomi + "円\t");
            System.out.println(viewType(types[i]));
        }

        // 合計行を表示
        System.out.println("合計\t\t" + totalZeinuki + "円\t" + totalZeikomi + "円");
    }

    private static String viewType(char c) {
        // (32) タイプ文字から日本語表示への変換
        return c == 'f' ? "食品等" : "その他";
    }
}
