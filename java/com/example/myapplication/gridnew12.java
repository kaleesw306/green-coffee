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

public class gridnew12  extends AppCompatActivity {
    TextToSpeech textspeech;
    View view;
    TextView gridnew1text,gridnew2text;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gridlayout12);
        gridnew1text=(TextView)findViewById(R.id.grid2text);
        gridnew2text=(TextView)findViewById(R.id.grid2text1);
        gridnew2text.setText("An Owl Matrix is a symmetric matrix that could be \"folded\" vertically and horizontally in the middle and would generate four equal pieces. \n" +
                "\n" +
                "For Example: \n" +
                "Input: \n" +
                "x  x  x  x \n" +
                "x  x  x  x \n" +
                "x  x  x  x \n" +
                "x  x  x  x \n" +
                "Output: true \n" +
                "\n" +
                "Input: \n" +
                "a  b  b  a \n" +
                "c  c  c  c \n" +
                "c  c  c  c \n" +
                "a  b  b  a \n" +
                "Output: true ");
        gridnew1text.setText("mport java.util.Scanner;\n" +
                "public class Program\n" +
                "{\n" +
                "    public static void main(String[] args) {\n" +
                "       int [][]x = new int[4][4];\n" +
                "       Scanner sc=new Scanner(System.in);\n" +
                "       for(int e=0;e<4;e++)\n" +
                "       {\n" +
                "           for(int f=0;f<4;f++)\n" +
                "           {\n" +
                "              \n" +
                "              x[e][f]=sc.nextInt();\n" +
                "               \n" +
                "           }\n" +
                "       //For better output, input all letters seperating by enter key\n" +
                "       } \n" +
                "       \n" +
                "       if((x[0][0]==x[0][3])&&(x[3][0]==x[3][3])&&(x[1][0]==x[1][3])&&(x[2][0]==x[2][3])&&(x[0][1]==x[0][2])&&(x[3][1]==x[3][2])&&(x[1][1]==x[1][2])&&(x[2][1]==x[2][2]))\n" +
                "       {\n" +
                "           System.out.println(\"true\");\n" +
                "       }\n" +
                "\n" +
                "\n" +
                "    }\n" +
                "}");
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
        //ak;
           // }
            case R.id.menuitemgrid3: {
                Intent about = new Intent(gridnew12.this, aboutmeclass.class);
                startActivity(about);
                break;
            }
            case R.id.menuitemgrid4: {
                Intent help = new Intent(gridnew12.this, helpclass.class);
                startActivity(help);

                break;
            }
            case R.id.menuitemgrid5: {
                finish();
                break;
            }
            case R.id.menuitemgrid6: {
                Intent webint = new Intent(gridnew12.this, webintent.class);
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
                        textspeech.speak("An Owl Matrix is a symmetric matrix that could be \"folded\" vertically and horizontally in the middle and would generate four equal pieces. \n" +
                                "\n" +
                                "For Example: \n" +
                                "Input: \n" +
                                "x  x  x  x \n" +
                                "x  x  x  x \n" +
                                "x  x  x  x \n" +
                                "x  x  x  x \n" +
                                "Output: true \n" +
                                "\n" +
                                "Input: \n" +
                                "a  b  b  a \n" +
                                "c  c  c  c \n" +
                                "c  c  c  c \n" +
                                "a  b  b  a \n" +
                                "Output: true ", TextToSpeech.QUEUE_FLUSH, null);

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

