public class D51Q6kadai {
    public static void main(String[] args) {
        // 自販機インスタンス作成
        VendingMachine2 vm = new VendingMachine2();

        // コマンドシナリオを配列にまとめる
        String[] scenario = {
                "i 100",   // 100円投入
                "i 50",    // 50円投入
                "s 1",     // 商品コード1購入
                "i 500",   // 500円投入
                "s 2",     // 商品コード2購入
                "r"        // お釣り返却
        };

        // 配列のコマンドを順に処理
        for (String command : scenario) {
            vm.execCom(command);
        }
    }
}

// ドリンククラス（Drink → Drink2 に変更）
class Drink2 {
    String name;
    int price;

    Drink2(String name, int price) {
        this.name = name;
        this.price = price;
    }
}

// 自販機クラス（VendingMachine → VendingMachine2 に変更）
class VendingMachine2 {
    private int credit = 0;
    private Drink2[] drinks;

    VendingMachine2() {
        drinks = new Drink2[3];
        drinks[0] = new Drink2("コーラ", 120);
        drinks[1] = new Drink2("水", 100);
        drinks[2] = new Drink2("コーヒー", 150);
    }

    // コマンド実行
    public void execCom(String com) {
        String[] parts = com.split(" ");
        String action = parts[0];

        switch (action) {
            case "i": // 投入
                int money = Integer.parseInt(parts[1]);
                credit += money;
                System.out.println(money + "円投入。残高: " + credit + "円");
                break;

            case "s": // 購入
                int index = Integer.parseInt(parts[1]) - 1;
                if (index >= 0 && index < drinks.length) {
                    Drink2 d = drinks[index];
                    if (credit >= d.price) {
                        credit -= d.price;
                        System.out.println(d.name + "を購入。残高: " + credit + "円");
                    } else {
                        System.out.println("残高不足: " + credit + "円");
                    }
                } else {
                    System.out.println("商品コードが無効です");
                }
                break;

            case "r": // 返金
                System.out.println("お釣り: " + credit + "円");
                credit = 0;
                break;

            default:
                System.out.println("不明なコマンド: " + com);
        }
    }
}
