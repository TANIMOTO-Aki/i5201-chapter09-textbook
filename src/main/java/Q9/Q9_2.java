import java.text.*;

public class Q9_2 {
    public static void main(String[] args) {
        final double TAX = 0.08;                            //税率
        int price;                                          //金額
        int taxPrice;                                       //税額
        int totalPrice;                                     //税込金額
        String buf;                                         //入力用バッファ

        /* インスタンス生成 */
        KeyIn ki = new KeyIn();                             //キーボード入力クラス
        DecimalFormat form = new DecimalFormat();           //ドキュメントフォーマット

        price = Integer.parseInt(ki.readString("金額"));   //金額の設定
        taxPrice = (int)(price * TAX);                      //税額の計算
        totalPrice = price + taxPrice;                      //税込金額の計算

        /* 税率を出力 */
        form.applyPattern("##.0%");                 //書式の設定
        System.out.println("税率は" + form.format(TAX) + "です");

        /* 各金額の出力 */
        form.applyPattern("\\###,###");             //書式の設定
        buf = "       " + form.format(price);               //書式をもとに変換
        buf = buf.substring(buf.length() - 8);
        System.out.println("金額　　　　:" + buf);           //金額を出力
        buf = "       " + form.format(taxPrice);            //書式をもとに変換
        buf = buf.substring(buf.length() - 8);
        System.out.println("税額　　　　:" + buf);           //税額を出力
        buf = "       " + form.format(totalPrice);          //書式をもとに変換
        buf = buf.substring(buf.length() - 8);
        System.out.println("税込み金額　:" + buf);           //税込金額を出力
    }
}
