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
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toolbar;

import java.util.Locale;

public class gridnew0 extends AppCompatActivity {
    TextView grid0textview1, grid0textview2;
    TextToSpeech textspeech;
    View view;
   // Toolbar tool;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gridlayout0);
        grid0textview1 = (TextView) findViewById(R.id.grid0text);
        grid0textview2 = (TextView) findViewById(R.id.grid0text1);
      //  tool.setBackgroundColor(Color.parseColor("#80000000"));
        grid0textview2.setText("Give a variable number of words, create a program to output the word with the maximum score, based on the following scoring system: \n" +
                "The score of a word is calculated based on its character values, according to this table: \n" +
                "e, a, i, o, n, r, t, l, s, u are equal 1 point \n" +
                "d, g\t2 points \n" +
                "b, c, m, p\t3 points \n" +
                "f, h, v, w, y 4 points \n" +
                "k 5 points \n" +
                "j, x 8 points \n" +
                "q, z 10 points \n" +
                "\n" +
                "The max length of a word is 10 letters. \n" +
                "\n" +
                "For example: \n" +
                "input { \"This\",  \"is\", \"a\", \"cool\" , \"Challenge\" } \n" +
                "output : Challenge");
        grid0textview1.setText("import java.util.Scanner;\n" +
                "public class Program\n" +
                "{\n" +
                "    public static void main(String[] args) {\n" +
                "        String word;\n" +
                "        int max = 0;\n" +
                "        Scanner input = new Scanner(System.in);\n" +
                "        word = input.nextLine();\n" +
                "        String[] list = word.split(\" \");\n" +
                "        int[] score = new int[list.length];\n" +
                "        for(int i = 0; i < list.length; i++){\n" +
                "            if(list[i].length() > 10){\n" +
                "                System.out.print(\"The length of a word can't exceed 10!\");\n" +
                "                return;\n" +
                "            }\n" +
                "            char[] c = list[i].toCharArray();\n" +
                "            for(int j = 0; j < c.length; j++){\n" +
                "                switch(Character.toLowerCase(c[j])){\n" +
                "                    case'e':case'a':case'i':case'o':\n" +
                "                    case'n':case'r':case't':case'l':\n" +
                "                    case's':case'u':\n" +
                "                    score[i]++;                  \n" +
                "                    break;\n" +
                "                    case'd':case'g':\n" +
                "                    score[i] += 2;\n" +
                "                    break;\n" +
                "                    case'b':case'c':case'm':case'p':\n" +
                "                    score[i] += 3;\n" +
                "                    break;\n" +
                "                    case'f':case'h':case'v':case'w':\n" +
                "                    case'y':\n" +
                "                    score[i] += 4;\n" +
                "                    break;\n" +
                "                    case'k':\n" +
                "                    score[i] += 5;\n" +
                "                    break;\n" +
                "                    case'j':case'x':\n" +
                "                    score[i] += 8;\n" +
                "                    break;\n" +
                "                    case'q':case'z':\n" +
                "                    score[i] += 10;\n" +
                "                    break;\n" +
                "                    default:\n" +
                "                    System.out.print(\n" +
                "                    \"The input is invalid!\");\n" +
                "                    return;\n" +
                "                }\n" +
                "            }\n" +
                "        }\n" +
                "        for(int i = 0; i < score.length - 1; i++){\n" +
                "            if(score[i+1] > score[i]){\n" +
                "                max = i + 1;\n" +
                "            }\n" +
                "        }\n" +
                "        System.out.print(\"The champion is: \"+list\n" +
                "        [max]+\", \"+\"with a score of \"+score[max]);\n" +
                "    }\n" +
                "}\n");

   grid0textview1.setBackgroundColor(Color.parseColor("#AADFAA"));
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
                Intent about = new Intent(gridnew0.this, aboutmeclass.class);
                startActivity(about);
                break;
            }
            case R.id.menuitemgrid4: {
                Intent help = new Intent(gridnew0.this, helpclass.class);
                startActivity(help);

                break;
            }
            case R.id.menuitemgrid5: {
                finish();
                break;
            }
            case R.id.menuitemgrid6: {
                Intent webint = new Intent(gridnew0.this, webintent.class);
                startActivity(webint);
                break;
            }
            case R.id.menuitemgrid7: {
                LayoutInflater layout = getLayoutInflater();
                view = layout.inflate(R.layout.gridspeaklayout, null);
                Button speakbutt = (Button) view.findViewById(R.id.gridspeaklayoutbutton1);
                final PopupWindow popgrid = new PopupWindow(view, ActionBar.LayoutParams.WRAP_CONTENT, ActionBar.LayoutParams.WRAP_CONTENT);
                //linearLayout1=(LinearLayout)findViewById(R.id.lineargrid);
                popgrid.showAsDropDown(grid0textview2, 1, 1);
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
                        textspeech.speak("Give a variable number of words, create a program to output the word with the maximum score, based on the following scoring system: \n" +
                                "The score of a word is calculated based on its character values, according to this table: \n" +
                                "e, a, i, o, n, r, t, l, s, u are equal 1 point \n" +
                                "d, g\t2 points \n" +
                                "b, c, m, p\t3 points \n" +
                                "f, h, v, w, y 4 points \n" +
                                "k 5 points \n" +
                                "j, x 8 points \n" +
                                "q, z 10 points \n" +
                                "\n" +
                                "The max length of a word is 10 letters. \n" +
                                "\n" +
                                "For example: \n" +
                                "input { \"This\",  \"is\", \"a\", \"cool\" , \"Challenge\" } \n" +
                                "output : Challenge", TextToSpeech.QUEUE_FLUSH, null);

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


