public class D52Q5kadai {
    public static void main(String[] args) {
        String majors = "+----"; // 10単位の目盛り
        int LIMIT = 400;
        if (args.length == 0) return;
        int max = 0, i = 0;
        int[] data = new int[args.length];
        for (String s : args) {
            data[i] = Integer.parseInt(s);
            if (data[i] > LIMIT) return;
            if (data[i] > max) {
                max = data[i];
            }
            i++;
        }

        // 目盛り表示（10単位）
        int majormax = (max - 1) / 10 + 1;
        System.out.print("   "); // インデント
        for (i = 0; i < majormax; i++) {
            System.out.print(majors.charAt(i % majors.length()));
        }
        System.out.println("");

        // グラフ表示（10単位で'*'を増やす）
        for (i = 0; i < data.length; i++) {
            System.out.printf("%4d : ", data[i]);
            int n = data[i] / 10; // 10単位
            for (int j = 0; j < n; j++) {
                System.out.print('*');
            }
            System.out.println("");
        }
    }
}
