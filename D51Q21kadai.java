public class D51Q21kadai {
    public static void main(String[] args) {
        // ↓ 16進数：10進数で表すと「10」
        int a = 0xA;
        // ↓ 2進数：10進数で表すと「16」
        int b = 0b10000;
        // ↓ 16進数(10) + 2進数(16) = 10進数(26)
        System.out.println(a + b);
    }
}
