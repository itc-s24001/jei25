public class D53Q20 {
    public static void main(String[] args) {
        int i = 8;
        float f = 3.27f;

        // 修正1: int + float の結果はfloatになるため、結果を受け取る変数もfloatに変更
        // または、キャストを使用してintに変換する
        float n = i + f;  // floatで受け取る場合
        // int n = (int)(i + f);  // intにキャストする場合（小数点以下切り捨て）

        System.out.println(n);
    }
}
