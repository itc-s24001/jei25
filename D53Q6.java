public class D53Q6 {
    private static String hex = "0123456789ABCDEF";

    public static void main(String[] args) {
        // (33) 引数の個数チェック - 2個でない場合は終了
        if (args.length != 2) {
            return;
        }

        if (args[0].equals("b")) { // ビットを表す16進数字が入力された
            // (34) 引数の文字数分繰り返し（16進数の各桁を処理）
            for (int i = 0; i < args[1].length(); i++) {
                int num = hex.indexOf(args[1].charAt(i)); // 16進数字→整数
                System.out.println(intToStr(num));
            }
        } else if (args[0].equals("d")) { // 2進値像が入力された
            // (34) 引数の文字数分繰り返し（2進数を4桁ずつ処理）
            for (int i = 0; i < args[1].length(); i += 4) {
                System.out.println(strToInt(args[1].substring(i, i + 4)));
            }
        }
    }

    // 整数を4ビットの2進数文字列に変換
    public static String intToStr(int x) {
        String s = "";
        for (int i = 0; i < 4; i++) {
            // (35) 最下位ビットが1かどうかをチェック
            if ((x & 1) == 1) {
                s = "1" + s;
            } else {
                s = "0" + s;
            }
            x /= 2; // 右シフト（2で割る）
        }
        return s;
    }

    // 4桁の2進数文字列を16進数文字に変換
    public static String strToInt(String s) {
        int x = 1, sum = 0;
        // 右から左へ（i=3から0へ）処理
        for (int i = 3; i >= 0; i--) {
            if (s.charAt(i) == '1') {
                sum += x; // 2のi乗を加算
            }
            // (36) 次の桁の重み（2倍）
            x *= 2;
        }
        // (37) sumをインデックスとしてhex文字列から16進数字を取得
        // substring(sum, sum+1)で1文字取得
        return hex.substring(sum, sum + 1);
    }
}
