public class Sample9_2_1 {
    public static void main(String[] args) {
        String lname;                                           // 名字
        String fname;                                           // 名前
        String gender;                                          // 性別
        int age;                                                // 年齢

        KeyIn ki = new KeyIn();                                 // ①
        
        lname = ki.readString("名字を入力:");               // ②
        fname = ki.readString("名前を入力:");               // ③

        /* 性別("F"または"M")を入力する処理 */
        while (true) {                                          // ④
            gender = ki.readString("性別を入力(M,F):");     // ⑤
            if (gender.equals("M")) {                  // ⑥
                gender = "男性";
                break;
            } else if (gender.equals("F")) {           // ⑦
                gender = "女性";
                break;
            } else {                                            // ⑧
                System.out.println("性別の入力に誤りがあります");
            }
        }

        age = Integer.parseInt(ki.readString("年齢を入力:"));   // ⑨

        System.out.print("氏名:" + lname + " " + fname +         // ⑩
                         "　性別:" + gender +
                         "　年齢:" + age + "歳");

    }
}
/*
 * 【プログラムの説明】
 * ①　前述したKeylnクラスのインスタンスを生成し、kiを使って参照できるようにする
 * ②,③KeyInクラスのreadStringメソッドを使用して、名字と名前をキーボード入力する
 * ④　このループは、性別が正しく入力されるまで再入力を行うためのものである
 * ⑤　性別をキーボード入力する
 * 　　性別に"M"、"F"以外の値が入力されると、⑧でエラーメッセージを画面に出力し、
 * 　　再度、性別の入力の処理に戻る
 * ⑥,⑦性別に"M"か"F"のいずれかが入力されたかチェックする
 * 　　入力された値が"M"の場合は、変数genderに"男性"をセットして、④のループから抜ける
 * 　　"F"の場合には、変数genderに"女性"をセットして、④のループから抜ける
 * ⑨　年齢をキーボード入力する
 * 　　readStringメソッドの戻り値の数字文字列をparseintメソッドで数値に変換して、
 * 　　int型の変数ageにセットする
 * ⑩　キーボード入力した名字、名前、性別、年齢を画面に出力する
 */