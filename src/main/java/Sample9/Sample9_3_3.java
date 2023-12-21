public class Sample9_3_3 {
    public static void main(String[] args) {
        int i,j;
        i = 0;
        try {
            j = 10 / i;                                 // ①
        } catch (ArithmeticException e) {               // ②
            System.out.println("例外が発生しました");   // ③
            System.out.println(e);                      // ④
            j = 0;                                      // ⑤
        } finally {
            System.out.println("整数値:" + i);          // ⑥
        }
    }
}
/*
 * 【プログラムの説明】
 * ①　10を変数iで除算してその商を変数jに代入する処理
 * 　　変数iの値が0のとき、ゼロ除算となり、ArithmeticException例外が発生する可能性がある
 * 　　例外が発生する可能性のある処理をtryブロックの{}の中に記述する
 * 
 * ②　①で発生する可能性のあるゼロ除算例外をcatchするため、ArithmeticExceptionをcatch節の()の中で指定する
 * 　　また、()内のeは例外ハンドラ引数といい、例外処理の中で使用する
 * 　　例外ハンドラ引数は、例外処理の中で使用しなくても構わないが、必ず指定する必要がある
 * 
 * ③~⑤ ArithmeticException例外が発生した時の例外処理である
 * 
 * ④　eの値を画面に出力する。例外ハンドラ引数を指定すると、catchした例外の種類が出力される
 * 
 * ⑤　①で変数jに値が代入されなかったため、0をセットしておく
 * 　　③~⑤の例外処理を実行したあとは、正常の流れに戻る。つまり、try文の次にある⑥の処理へ進む
 * 
 * ⑥　"整数値:"の文字列と変数iの内容を画面に出力する
 * 　　この処理を実行したあと、プログラムを正常終了する
 * 　　
 */