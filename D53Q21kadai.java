public class D53Q21kadai {
    public static void main(String[] args) {
        byte b = 127; // 127=01111111
        b += 1;
        System.out.println(b);

        // 10進数の63を2進数リテラル（0b）でbyte aに代入
        // 63の2進数表現: 0111111（7ビット）
        byte a = 0b0111111; // 10進数の63

        // 10進数の64を8進数リテラル（0）でbyte bに代入
        // 64の8進数表現: 100
        byte c = 0100; // 10進数の64（変数名をcに変更、bは既に使用済みのため）

        // 10進数の65を16進数リテラル（0x）でbyte dに代入
        // 65の16進数表現: 41
        byte d = 0x41; // 10進数の65

        // 結果を確認するための出力
        System.out.println("a (2進数 0b0111111) = " + a + " (10進数)");
        System.out.println("c (8進数 0100) = " + c + " (10進数)");
        System.out.println("d (16進数 0x41) = " + d + " (10進数)");
    }
}
