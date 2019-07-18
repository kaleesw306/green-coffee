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

public class gridnew11 extends AppCompatActivity {
    TextToSpeech textspeech;
    View view;
    TextView gridnew1text,gridnew2text;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gridlayout11);
        gridnew1text=(TextView)findViewById(R.id.grid2text);
        gridnew2text=(TextView)findViewById(R.id.grid2text1);
        gridnew2text.setText("Abundant Numbers\n" +
                "\n" +
                "If the sum of factors of a number is greater than twice that number, it is considered to be abundant.\n" +
                "\n" +
                "For example: \n" +
                "12 is an abundant number. \n" +
                "Factors of 12 are 1, 2, 3, 4, 6, 12 \n" +
                "Sum is 1 + 2 + 3 + 4 + 6 + 12 = 28 > 2 * 12\n" +
                "\n" +
                "Tasks: \n" +
                "(Easy) Write a program to verify whether a given number is abundant or not. \n" +
                "(Medium) Write a program to find all the abundant numbers in a range. \n" +
                "(Hard) Given a number, write a program to display its factors, their sum and then verify whether it's abundant or not. ");
        gridnew1text.setText("import java.util.Scanner; public class Programme { public static void main(String[] args) { Scanner obj=new Scanner(System.in); int a=obj.nextInt(); int b=1; int c=0; for(int i=1;i<=a;i++){ if(a%b==0){ c=c+b; } b++; } int d=a*2; if(c>d) System.out.println(\"its Abundant Number= \"+a); else System.out.println(\"not Abundant Number= \"+a); } }");
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
                Intent about = new Intent(gridnew11.this, aboutmeclass.class);
                startActivity(about);
                break;
            }
            case R.id.menuitemgrid4: {
                Intent help = new Intent(gridnew11.this, helpclass.class);
                startActivity(help);

                break;
            }
            case R.id.menuitemgrid5: {
                finish();
                break;
            }
            case R.id.menuitemgrid6: {
                Intent webint = new Intent(gridnew11.this, webintent.class);
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
                        textspeech.speak("Abundant Numbers\n" +
                                "\n" +
                                "If the sum of factors of a number is greater than twice that number, it is considered to be abundant.\n" +
                                "\n" +
                                "For example: \n" +
                                "12 is an abundant number. \n" +
                                "Factors of 12 are 1, 2, 3, 4, 6, 12 \n" +
                                "Sum is 1 + 2 + 3 + 4 + 6 + 12 = 28 > 2 * 12\n" +
                                "\n" +
                                "Tasks: \n" +
                                "(Easy) Write a program to verify whether a given number is abundant or not. \n" +
                                "(Medium) Write a program to find all the abundant numbers in a range. \n" +
                                "(Hard) Given a number, write a program to display its factors, their sum and then verify whether it's abundant or not. ", TextToSpeech.QUEUE_FLUSH, null);

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


