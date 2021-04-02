package com.example.flames;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FirstActivity extends AppCompatActivity {
    String s11,s12;
    TextView t1;
    ImageView image1;
    MediaPlayer mp;


    @Override
    public void onBackPressed()
    {
        mp.stop();
        super.onBackPressed();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first);


        t1=findViewById(R.id.t1);
        image1=findViewById(R.id.image1);

        s11=getIntent().getExtras().getString("s1");
        s12=getIntent().getExtras().getString("s2");



        int i,j,count1=0,count2=0,count,k,n,c,x=0,x2=0;
        String s1;
        String s2;

        String s3="FLAMES";
        String result1,result2;
        char result11,result22;

        // s1=FirstName.getText().toString();
        //s2=SecondName.getText().toString();

        //result11=s1.toUpperCase().charAt(0);
        result11=s11.toUpperCase().charAt(0);
        result22=s12.toUpperCase().charAt(0);
        result1=result11+s11.substring(1);
        result2=result22+s12.substring(1);

        StringBuilder sb1 = new StringBuilder(s11);
        StringBuilder sb2 = new StringBuilder(s12);

        int  m=s11.length();
        n=s12.length();

        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                if(sb1.charAt(i)==sb2.charAt(j))
                {
                    sb1.replace(i,i+1,"0");
                    sb2.replace(j,j+1,"0");
                }
            }
        }

        s1 = sb1.toString();
        s2 = sb2.toString();
        for(i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)!='0')
            {
                System.out.print(" "+s1.charAt(i));
                count1++;

            }
        }


        // System.out.println("First String: "+count1);

        for(i=0;i<s2.length();i++)
        {
            if(s2.charAt(i)!='0')
            {
                System.out.print(" "+s2.charAt(i));
                count2++;
            }
        }

        //System.out.println("First String: "+count2);

        count=count1+count2;
        System.out.println(count);




        String flames = "flames";
        StringBuilder sb3 = new StringBuilder(flames);

        char flameResult = 0;

        while(sb3.length()!=1)
        {
            int y = count%sb3.length();
            String temp;

            if(y!=0)
            {
                temp = sb3.substring(y)+sb3.substring(0, y-1);

            }
            else
            {
                temp = sb3.substring(0, sb3.length()-1);
            }
            sb3 = new StringBuilder(temp);
            flameResult = sb3.charAt(0);

        }
        System.out.println(flameResult);


        switch(flameResult)
        {
            case 'f':
                t1.setText("Friend: You are the Friend to "+result2 );
                image1.setImageResource(R.drawable.friend);
                mp=MediaPlayer.create(FirstActivity.this,R.raw.friend);
                mp.start();
                break;

            case 'l':
                t1.setText("Love: "+result2+" Loves You");
                image1.setImageResource(R.drawable.love);
                mp=MediaPlayer.create(FirstActivity.this,R.raw.love);
                mp.start();
                break;

            case 'a':
                t1.setText("Affection: "+result2+" have Affection On You");
                image1.setImageResource(R.drawable.affect);
                mp=MediaPlayer.create(FirstActivity.this,R.raw.affection);
                mp.start();
                break;


            case 'm':
                t1.setText("Marriage: "+result2+" May be Your Life Partner");
                image1.setImageResource(R.drawable.marriage);
                mp=MediaPlayer.create(FirstActivity.this,R.raw.marriage);
                mp.start();
                break;


            case 'e':
                t1.setText("Enemy: "+result1+" is Enemy to "+result2);
                image1.setImageResource(R.drawable.enemy);
                mp=MediaPlayer.create(FirstActivity.this,R.raw.enemy);
                mp.start();
                break;


            case 's':
                t1.setText("Sibling: "+result1+" is Sibling to "+result2);
                image1.setImageResource(R.drawable.sibling);
                mp=MediaPlayer.create(FirstActivity.this,R.raw.sibling);
                mp.start();
                break;

        }
    }
    }