public class Sample9_1_1 {
    public static void main(String[] args) {
        int i = 10;
        double d = 1.5;
        String st = "文字列:";
        System.out.println(st);                         //①
        System.out.println(i);                          //②
        System.out.println(d);                          //③
        System.out.println(st + " " + i + " " + d);     //④
        System.out.println();                           //⑤
        System.out.print(st);                           //⑥
        System.out.print(" " + i);                      //⑦
        System.out.print(" " + d);                      //⑧
        System.out.println();                           //⑨
    }
}
/*
 * プログラムの説明
 * ①String型の変数stの値をそのまま画面に出力し、改行する
 * ②int型の変数iの値を文字列に変換して画面に出力し、改行する
 * ③double型の変数dの値を文字列に変換して画面に出力し、改行する
 * ④stの値、" "、iの値、" "、dの値を続けて出力し、最後に改行する。" "は空白文字（スペース）
 * ①~④printlnメソッドは、引数で指定した変数の値を文字列に変換して画面に出力し改行する
 * ⑤引数を指定しないでprintlnメソッドを実行すると改行だけ行う
 * ⑥~⑧printメソッドは、引数で指定した変数の値を文字列に変換して画面に出力する。ただし、出力後に
 *  改行しない。つまり、次の出力は前に出力された文字列に続いて行われる
 * ⑨　⑤と同様に改行だけ行う
 */