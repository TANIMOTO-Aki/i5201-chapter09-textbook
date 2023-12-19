import java.text.*;                                             //①

public class Sample9_1_2 {
    public static void main(String[] args) {
        int i1 = 2360;
        int i2 = 365;
        double d1 = 381.5396;
        double d2 = -23.6;
        DecimalFormat form = new DecimalFormat();               //②
        form.applyPattern("#,###");                     //③
        System.out.println("指定した書式:" + form.toPattern()); //④
        System.out.println("整数値:" + form.format(i1));        //⑤
        System.out.println("整数値:" + form.format(i2));        //⑥
        form.applyPattern("#,###.00");                  //⑦
        System.out.println("指定した書式:" + form.toPattern()); //⑧
        System.out.println("実数値:" + form.format(d1));        //⑨
        System.out.println("実数値:" + form.format(d2));        //⑩
    }
}
/*
 * 【プログラムの説明】
 * ①java.text.*;をインポートする。java.textパッケージに含まれているDecimalFormatクラスを使用するために必要
 * ②DecimalFormatクラスのメソッドはインスタンスメソッドであるため、インスタンスを生成する
 * 　ここで生成したインスタンスの参照には、formを用いる
 * ③int型の変数i1およびi2を出力するための書式を設定する
 * ④toPatternメソッドを用いて、現在設定されている書式を画面に出力する
 * ⑤formatメソッドを用いて、③で指定した書式で数値データを文字列に変換する
 * 　form.format(i1)の戻り値"2,360"を画面に出力する
 * ⑥同様にform.format(i2)の戻り値"365"を画面に表示する
 * ⑦double型の変数d1およびd2を出力するための書式"#,###.00"を設定する
 * 　整数部4桁で、3桁ごとの位取りを行い、小数点第2位まで出力する指定
 * ⑧ ④と同様
 * ⑨ ⑦で指定した書式で文字列に変換して画面に出力する。ただし、⑦で指定した"#,###.00"の書式が
 * 　小数点以下2桁の指定なので、小数点第3位で四捨五入される
 * 　変数d1の値が381.5396なので、form.format(d1)の戻り値"381.54"を画面に出力する
 * ⑩同様にform.format(d2)の戻り値"-23.60"を画面に出力する
 */