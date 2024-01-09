import java.text.*;

public class Practice9_2 {
    public static void main(String[] args) {
        final int MAX_NUMBER = 10;              //最大人数
        int[] age = new int[MAX_NUMBER];        //年齢テーブル
        int[] sal = new int[MAX_NUMBER];        //給与テーブル
        int cnt;                                //人数カウンタ
        int ageTotal = 0;                       //年齢合計
        int salTotal = 0;                       //給与合計
        int ageAvg, salAvg;                     //平均年齢と給与
        String buf;                             //入力バッファ

        KeyIn ki = new KeyIn();                 //キーボード入力クラス
        DecimalFormat form = new DecimalFormat();   //書式設定クラス

        /* 最大10人分の年齢・給与をキーボード入力する処理 */
        for (cnt = 0; cnt < MAX_NUMBER; cnt++) {
            age[cnt] = Integer.parseInt(ki.readString((cnt + 1) + "人目の年齢:"));
            if (age[cnt] == 999) break;            //ストッパ入力で終了
            sal[cnt] = Integer.parseInt(ki.readString((cnt + 1) + "人目の給与:"));
            ageTotal += age[cnt];               //年齢合計
            salTotal += sal[cnt];               //給与合計
        }

        if (cnt > 0) {                 //入力データ件数の判定
            /* 人数分のデータを書式編集し画面に出力する処理 */
            form.applyPattern("\\###,###");
            System.out.println("番号 年齢     給与");      //タイトルを画面出力
            for (int i = 0; i < cnt; i++) {                 //人数分のループ
                buf = "   " + Integer.toString(i + 1);      //スペース3個と連結
                buf = buf.substring(buf.length() - 4);
                System.out.print(buf);

                buf = "    " + Integer.toString(age[i]);    //スペース4個と連結
                buf = buf.substring(buf.length() - 5);
                System.out.print(buf);

                buf = "          " + form.format(sal[i]);  //スペース10個と連結
                buf = buf.substring(buf.length() - 11);
                System.out.println(buf);
            }
            /* 平均算出の処理 */
            ageAvg = ageTotal / cnt;            //平均年齢の算出
            salAvg = salTotal / cnt;            //平均給与の算出
            /* 平均年齢・平均給与を書式編集し画面に出力する処理 */
            System.out.println("-----------------------");
            System.out.print("平均");
            form.applyPattern("###");
            buf = "    " + form.format(ageAvg);        //スペース4個と連結
            buf = buf.substring(buf.length() - 5);
            System.out.print(buf);
            form.applyPattern("\\###,###");
            buf = "          " + form.format(salAvg);  //スペース10個と連結
            buf = buf.substring(buf.length() - 11);
            System.out.print(buf);
        } else {
            System.out.println("-----------------------");
            System.out.println("入力データがありません");
        }
    }
}
