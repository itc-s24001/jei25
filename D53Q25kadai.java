public class D53Q25kadai {
    public static void main(String[] args) {
        // 修正1: char配列を文字列リテラルと同じ内容にする
        // 元のコードでは{'A', 'B', 'C'}だったが、"ABC"と同じにするため修正
        char[] ch = {'A', 'B', 'C'};

        // 修正2: 文字列リテラルではなく、char配列から新しいStringオブジェクトを作成
        // これにより、s1とs2は同じ文字列内容を持つが異なるオブジェクトになる
        String s1 = new String(ch);  // char配列からStringオブジェクトを作成
        String s2 = new String(ch);  // 同じchar配列から別のStringオブジェクトを作成

        // 修正3: == 比較をequals比較に変更
        // ==は参照の比較、equalsは内容の比較
        // s1とs2は異なるオブジェクトなので==ではfalseになってしまう
        // 内容が同じなのでequalsではtrueになる
        boolean b1 = s1.equals(s2);  // 内容の比較でtrue
        boolean b2 = s1.equals(s2);  // 内容の比較でtrue

        System.out.println(b1 + " " + b2);
    }
}
