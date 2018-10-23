package com.mmj.www.mypet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox chkAgree;
    RadioGroup rGroup1;
    RadioButton rdoDog, rdoCat, rdoRabbit, rdohorse;
    Button btnOk;
    ImageView imagePet;
    TextView text1, text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1 = (TextView) findViewById(R.id.Text1);
        text2 = (TextView) findViewById(R.id.Text2);
        chkAgree = (CheckBox) findViewById(R.id.chkAgree);
        this.rGroup1 = (RadioGroup) findViewById(R.id.rGroup1);
        this.rdoDog = (RadioButton) findViewById(R.id.rdoDog);
        this.rdoCat = (RadioButton) findViewById(R.id.rdoCat);
        this.rdohorse = (RadioButton) findViewById(R.id.rdohorse);
        this.rdoRabbit = (RadioButton) findViewById(R.id.rdoRabbit);
        this.btnOk = (Button) findViewById(R.id.btnOk);
        this.imagePet = (ImageView) findViewById(R.id.imagePet);

        chkAgree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (chkAgree.isChecked()) {
                    text2.setVisibility(View.VISIBLE);
                    rGroup1.setVisibility(View.VISIBLE);
                    btnOk.setVisibility(View.VISIBLE);
                    imagePet.setVisibility(View.VISIBLE);
                }
                else {
                    text2.setVisibility(View.INVISIBLE);
                    rGroup1.setVisibility(View.INVISIBLE);
                    btnOk.setVisibility(View.INVISIBLE);
                    imagePet.setVisibility(View.INVISIBLE);
                }
            }
        });
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (rGroup1.getCheckedRadioButtonId()){
                    case R.id.rdoDog:
                        imagePet.setImageResource(R.drawable.dog);break;
                    case R.id.rdoCat:
                        imagePet.setImageResource(R.drawable.cat);break;
                    case R.id.rdohorse:
                        imagePet.setImageResource(R.drawable.horse);break;
                    case R.id.rdoRabbit:
                        imagePet.setImageResource(R.drawable.rabbit);break;
                    default:
                        Toast.makeText(getApplicationContext(),"동물을 선택하세요", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
