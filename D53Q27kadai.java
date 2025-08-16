// 列挙型Udon2の定義（既存のUdonと重複を避けるため）
enum Udon2 {
    // 既存の定数
    KAKE("かけ", 290),
    KITSUNE("きつね", -380),
    CURRY("カレー", 490),

    // 新たに追加する定数
    TEMPURA("天ぷら", 520),        // 天ぷらうどん
    NABEYAKI("鍋焼き", 650),       // 鍋焼きうどん
    ZARU("ざる", 420),            // ざるうどん
    MEAT("肉", 580);              // 肉うどん

    // フィールド
    private String japaneseName;
    private int price;

    // コンストラクタ
    Udon2(String japaneseName, int price) {
        this.japaneseName = japaneseName;
        if (price >= 0) {
            this.price = price;
        } else {
            // 負の値の場合は絶対値を取る（元のコードの仕様に合わせる）
            this.price = -1 * price;
        }
    }

    // toStringメソッド
    public String toString() {
        return japaneseName + " : " + price + "円";
    }
}

public class D53Q27kadai {
    public static void main(String[] args) {
        // 元のコードの出力
        System.out.println(Udon2.KITSUNE);

        System.out.println("--- 新たに追加した商品 ---");

        // 新たに追加した定数の出力
        System.out.println(Udon2.TEMPURA);   // 天ぷらうどん
        System.out.println(Udon2.NABEYAKI);  // 鍋焼きうどん
        System.out.println(Udon2.ZARU);      // ざるうどん
        System.out.println(Udon2.MEAT);      // 肉うどん

        System.out.println("--- 全商品一覧 ---");

        // 全ての列挙定数を出力
        for (Udon2 udon : Udon2.values()) {
            System.out.println(udon);
        }

        System.out.println("--- 商品数：" + Udon2.values().length + "種類 ---");
    }
}
