package com.example.gridviewtest;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private final int WC = ViewGroup.LayoutParams.WRAP_CONTENT;
    private final int MP = ViewGroup.LayoutParams.MATCH_PARENT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        // ヘッダー部分を作成する
        LinearLayout headerLayout = new LinearLayout(this);
        headerLayout.setOrientation(LinearLayout.VERTICAL);
        headerLayout.setLayoutParams(new LinearLayout.LayoutParams(MP, WC));
        setContentView(headerLayout);

        //ヘッダーに表示する文字、背景色等を設定する
        TextView textView = new TextView(this);
        //文言
        String str = "12月";
        textView.setText(str);
        //背景色
        textView.setBackgroundColor(Color.parseColor("#4169e1"));
        //位置
        textView.setGravity(Gravity.CENTER);
        //サイズ
        textView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 30);
        headerLayout.addView(textView,
                new LinearLayout.LayoutParams(MP, WC));



        //カレンダー部分を作成していく
        LinearLayout base_layout = new LinearLayout(this);
        base_layout.setOrientation(LinearLayout.VERTICAL);
        base_layout.setLayoutParams(new LinearLayout.LayoutParams(MP,MP));
        headerLayout.addView(base_layout);

        //レイアウトのマージン(高さ)を設定する
        LinearLayout.LayoutParams params = (LinearLayout.LayoutParams) base_layout.getLayoutParams();
        params.setMargins(0, 350, 0, 0);
        base_layout.setLayoutParams(params);
        base_layout.setLayoutParams(params);




       /* TextView tx = new TextView(this);
        tx.setText("てすとぉ！");
        tx.setBackgroundColor(Color.RED);
        base_layout.addView(tx,new LinearLayout.LayoutParams(MP, WC));
*/

        //レイアウトを入れ子にする
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.HORIZONTAL);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(MP,MP, 1));

        base_layout.addView(linearLayout);

        //上段の曜日を表示
        TextView sunday = new TextView(this);
        sunday.setText("日");
        sunday.setGravity(Gravity.CENTER);
        sunday.setBackgroundResource(R.drawable.text_layout);



        TextView monday = new TextView(this);
        monday.setText("月");
        monday.setGravity(Gravity.CENTER);
        monday.setBackgroundResource(R.drawable.text_layout);
        TextView tuesday = new TextView(this);

        tuesday.setText("火");
        TextView wednesday = new TextView(this);
        tuesday.setGravity(Gravity.CENTER);
        tuesday.setBackgroundResource(R.drawable.text_layout);

        wednesday.setText("水");
        TextView thursday = new TextView(this);
        wednesday.setGravity(Gravity.CENTER);
        wednesday.setBackgroundResource(R.drawable.text_layout);

        thursday.setText("木");
        TextView friday = new TextView(this);
        thursday.setGravity(Gravity.CENTER);
        thursday.setBackgroundResource(R.drawable.text_layout);

        friday.setText("金");
        TextView saturday = new TextView(this);
        friday.setGravity(Gravity.CENTER);
        friday.setBackgroundResource(R.drawable.text_layout);

        saturday.setText("土");
        saturday.setGravity(Gravity.CENTER);
        saturday.setBackgroundResource(R.drawable.text_layout);

        //xmlファイルで言うところのlayout_weight?
        LinearLayout.LayoutParams param1 = new LinearLayout.LayoutParams(MP,MP);
        param1.weight = 1.0f;

        //なんか知らんけど弟2引き数にこいつ入れたらlayout_weight = 1と同じ効果になるっぽい
        linearLayout.addView(sunday,param1);
        linearLayout.addView(monday,param1);
        linearLayout.addView(tuesday,param1);
        linearLayout.addView(wednesday,param1);
        linearLayout.addView(thursday,param1);
        linearLayout.addView(friday,param1);
        linearLayout.addView(saturday,param1);










    }
}
