public class Sample9_3_4 {
    public static void main(String[] args) {
        int i = 0, j = 0;
        String st = null;
        try {
            st = args[0];                                               // ①
            i = Integer.parseInt(st);                                   // ②
            j = 10 / i;                                                 // ③
        } catch (NumberFormatException e) {                             // ④
            System.out.println("データの指定に誤りがあります:" + st);     // ⑤
        } catch (ArrayIndexOutOfBoundsException e) {                    // ⑥
            System.out.println("実行時に値が指定されていません");       // ⑦
        } catch (ArithmeticException e) {                               // ⑧
            System.out.println("ゼロ除算が発生しました:" + i);           // ⑨
        } finally {
            System.out.print("整数値:" + j);
        }
    }
}
/*
 * 【プログラムの説明】
 * ①　コマンドライン引数の値を変数stにセットする
 * 　　ただし、コマンドライン引数を指定しないでプログラムを実行した場合、
 * 　　例外ArrayIndexOutOfBoundsExceptionが発生する
 * 
 * ②　Integer.parseIntメソッドを使い文字列stを数値に変換する
 * 　　ただし、整数値に変換できない値を指定した場合、
 * 　　例外NumberFormatExceptionが発生する
 * 
 * ③　10を変数iで割っている
 * 　　ただし、コマンドライン引数で指定した値が"0"(変数iが0になる)場合、
 * 　　例外ArithmeticExceptionが発生する(例外の種類はゼロ除算)
 * 
 * ④~⑨ 上記の例外をcatchし、それぞれの例外に応じたメッセージを表示する
 */