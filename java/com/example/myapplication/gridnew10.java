package com.example.myapplication;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.Locale;

public class gridnew10 extends AppCompatActivity {
    TextToSpeech textspeech;
    View view;
    TextView gridnew1text,gridnew2text;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gridlayout10);
        gridnew1text=(TextView)findViewById(R.id.grid2text);
        gridnew2text=(TextView)findViewById(R.id.grid2text1);
        gridnew2text.setText("\"Which finds the frequency of each digit of an enterd number if i enter 11225 value is Frquency of 1 is 2 Frequency of 2 is 2 Frequency of 5 is 1 so print  unstable if input is 112233 its all single digit number is repeated so print stable\n");
   gridnew1text.setText("import java.util.Scanner;\\n\" +\n" +
           "                \"\\n\" +\n" +
           "                \"public class stab {\\n\" +\n" +
           "                \"static void checklength(int inputValue)\\n\" +\n" +
           "                \"{\\n\" +\n" +
           "                \"int count=0;\\n\" +\n" +
           "                \"  int storetempValue=inputValue;\\n\" +\n" +
           "                \"  while(inputValue!=0)\\n\" +\n" +
           "                \"  {\\n\" +\n" +
           "                \"    inputValue =inputValue/10;\\n\" +\n" +
           "                \"    count++;\\n\" +\n" +
           "                \"  }\\n\" +\n" +
           "                \"  checkValue(storetempValue,count);\\n\" +\n" +
           "                \"  \\n\" +\n" +
           "                \"}\\n\" +\n" +
           "                \"public static void checkValue(int storetempValue,int count)\\n\" +\n" +
           "                \"{\\n\" +\n" +
           "                \"\\n\" +\n" +
           "                \"int storetempValue1=storetempValue;\\n\" +\n" +
           "                \"int count1=0;\\n\" +\n" +
           "                \"int value=0;\\n\" +\n" +
           "                \"int i,j;\\n\" +\n" +
           "                \"int storetempValueget ,storetempValueget1;\\n\" +\n" +
           "                \"  for(i=0;i<count;i++)\\n\" +\n" +
           "                \"  {\\n\" +\n" +
           "                \"    storetempValueget=storetempValue%10;\\n\" +\n" +
           "                \"    for(j=0;j<count;j++)\\n\" +\n" +
           "                \"    {\\n\" +\n" +
           "                \"      storetempValueget1=storetempValue1%10;\\n\" +\n" +
           "                \"      if(storetempValueget==storetempValueget1)\\n\" +\n" +
           "                \"      {\\n\" +\n" +
           "                \"        count1++;\\n\" +\n" +
           "                \"      }\\n\" +\n" +
           "                \"      storetempValue1=storetempValue1/10;\\n\" +\n" +
           "                \"    }\\n\" +\n" +
           "                \"    if(count1>=2)\\n\" +\n" +
           "                \"    {\\n\" +\n" +
           "                \"      value++;\\n\" +\n" +
           "                \"       \\n\" +\n" +
           "                \"    }\\n\" +\n" +
           "                \"    storetempValue=storetempValue/10;\\n\" +\n" +
           "                \"    count1=0;\\n\" +\n" +
           "                \"  }\\n\" +\n" +
           "                \"  if((value==count)||(value==0))\\n\" +\n" +
           "                \"  {\\n\" +\n" +
           "                \"    System.out.println(\\\"Given Input Is Stable\\\");\\n\" +\n" +
           "                \"  }\\n\" +\n" +
           "                \"  else\\n\" +\n" +
           "                \"  {\\n\" +\n" +
           "                \"    System.out.println(\\\"Given Input Is Not Stable\\\");\\n\" +\n" +
           "                \"  }\\n\" +\n" +
           "                \"}\\n\" +\n" +
           "                \"  public static void main(String[] args) {\\n\" +\n" +
           "                \"  int inputValue;\\n\" +\n" +
           "                \"  Scanner input =new Scanner(System.in);\\n\" +\n" +
           "                \"  inputValue=input.nextInt();\\n\" +\n" +
           "                \"  checklength(inputValue);\\n\" +\n" +
           "                \"   \\n\" +\n" +
           "                \"  }\\n\" +\n" +
           "                \"}\"+\"\\n\\n\\n\\n\\n\"+\"\\nINPUT\\n\"\n" +
           "                        +\"1212,1233\\n\\n\\n\"+\"Output\\n\"+\n" +
           "                                \"1312-number is Stable\\n\\n1233-number isUnstable\\n");
        gridnew1text.setBackgroundColor(Color.parseColor("#AADFAA"));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.gridmenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int grid24item = item.getItemId();
        switch (grid24item) {
            case R.id.menuitemgrid1: {
                break;
            }

            case R.id.menuitemgrid3: {
                Intent about = new Intent(gridnew10.this, aboutmeclass.class);
                startActivity(about);
                break;
            }
            case R.id.menuitemgrid4: {
                Intent help = new Intent(gridnew10.this, helpclass.class);
                startActivity(help);

                break;
            }
            case R.id.menuitemgrid5: {
                finish();
                break;
            }
            case R.id.menuitemgrid6: {
                Intent webint = new Intent(gridnew10.this, webintent.class);
                startActivity(webint);
                break;
            }
            case R.id.menuitemgrid7: {
                LayoutInflater layout = getLayoutInflater();
                view = layout.inflate(R.layout.gridspeaklayout, null);
                Button speakbutt = (Button) view.findViewById(R.id.gridspeaklayoutbutton1);
                final PopupWindow popgrid = new PopupWindow(view, ActionBar.LayoutParams.WRAP_CONTENT, ActionBar.LayoutParams.WRAP_CONTENT);
                //linearLayout1=(LinearLayout)findViewById(R.id.lineargrid);
                popgrid.showAsDropDown(gridnew2text, 1, 1);
                popgrid.setFocusable(true);
                popgrid.setOutsideTouchable(true);
                textspeech = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int status) {
                        int speaklet = textspeech.setLanguage(Locale.ENGLISH);
                    }
                });
                speakbutt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        SeekBar pitch = (SeekBar) view.findViewById(R.id.seekbarspeek);
                        SeekBar speed = (SeekBar) view.findViewById(R.id.seekbarspeek1);
                        float ppitch = (float) pitch.getProgress() / 50;
                        if (ppitch <= 0.1) {
                            ppitch = 0.1f;
                        }
                        float sspeed = (float) (speed.getProgress()) / 50;
                        if (sspeed <= 0.1) {
                            sspeed = 0.1f;
                        }
                        textspeech.setPitch(ppitch);
                        textspeech.setSpeechRate(sspeed);
                        //  textspeech.speak("Which finds the frequency of each digit of an enterd number if i enter 11225 value is Frquency of 1 is 2 Frequency of 2 is 2 Frequency of 5 is 1 so print  unstable if input is 112233 its all single digit number is repeated so print stable " ,TextToSpeech.QUEUE_FLUSH, null);
                        textspeech.speak("Which finds the frequency of each digit of an enterd number if i enter 11225 value is Frquency of 1 is 2 Frequency of 2 is 2 Frequency of 5 is 1 so print  unstable if input is 112233 its all single digit number is repeated so print stable\n", TextToSpeech.QUEUE_FLUSH, null);

                    }
                });

                Button speakstop = (Button) view.findViewById(R.id.gridspeaklayoutbutton2);
                speakstop.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        if (textspeech.isSpeaking()) {
                            textspeech.stop();
                        }

                    }
                });

                Button cancelbutt = (Button) view.findViewById(R.id.gridspeaklayoutbutton3);
                cancelbutt.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        popgrid.dismiss();
                    }
                });
                popgrid.update();
                break;
            }

        }
        return true;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (textspeech != null) {
            textspeech.stop();
            //  textspeech.shutdown();

        }
    }
}

