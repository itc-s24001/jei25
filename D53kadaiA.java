public class D53kadaiA {
    public static void main(String[] args) {
        // コマンドライン引数が提供されているかチェック
        if (args.length == 0) {
            System.out.println("引数がありません。整数を1つ以上指定してください。");
            return;
        }

        int sum = 0;
        try {
            // コマンドライン引数をループ処理
            for (String arg : args) {
                // 文字列を整数に変換して合計に加算
                sum += Integer.parseInt(arg);
            }
            System.out.println("合計=" + sum);
        } catch (NumberFormatException e) {
            // 変換できない文字列が引数に含まれていた場合
            System.out.println("エラー: 引数に整数以外の値が含まれています。");
        }
    }
}
