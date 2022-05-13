package kr.ac.yeonsung.ysna.androidproject_0513_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout linearRed, linearPurple, linearMint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        linearRed = findViewById(R.id.linear_red);
        linearPurple = findViewById(R.id.linear_purple);
        linearMint = findViewById(R.id.linear_mint);
        Button btnRed = findViewById(R.id.btn_red);
        Button btnPurple = findViewById(R.id.btn_purple);
        Button btnMint = findViewById(R.id.btn_mint);

        btnRed.setOnClickListener(btnListener);
        btnPurple.setOnClickListener(btnListener);
        btnMint.setOnClickListener(btnListener);
    }
    View.OnClickListener btnListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            linearRed.setVisibility(View.INVISIBLE);
            linearPurple.setVisibility(View.INVISIBLE);
            linearMint.setVisibility(View.INVISIBLE);
            switch (view.getId()) {
                case R.id.btn_red:
                    linearRed.setVisibility(View.VISIBLE);
                    break;
                case R.id.btn_purple:
                    linearPurple.setVisibility(View.VISIBLE);
                    break;
                case R.id.btn_mint:
                    linearMint.setVisibility(View.VISIBLE);
                    break;
            }
        }
    };
}