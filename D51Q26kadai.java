public class D51Q26kadai {
    public static void main(String[] args) {
        int n = 1;
        String s = "";
        switch (n) {
            // case は break を入れないと次の case の処理に流れていしまう
            // ↑ このことを fall-through という。
            case 1:
                s += "one";
                break;
            case 2:
                s += "two";
                break;
            default:
                s += "?";
        }
        System.out.println(s);
    }
}
