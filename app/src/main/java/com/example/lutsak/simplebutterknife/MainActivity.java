package com.example.lutsak.simplebutterknife;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    //Bind a field to the view for the specified ID.
    @BindView(R.id.textView)
    TextView textViewTitle;

    @BindView(R.id.button)
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Target activity for view binding
        ButterKnife.bind(this);
    }

    //No more need onClickListener
    @OnClick(R.id.button)
    void changeText(){
        textViewTitle.setText(R.string.change_text);
    }
}
