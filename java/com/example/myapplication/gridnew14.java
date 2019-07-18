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

public class gridnew14 extends AppCompatActivity {
    TextToSpeech textspeech;
    View view;
    TextView gridnew1text,gridnew2text;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gridlayout14);
        gridnew1text=(TextView)findViewById(R.id.grid2text);
        gridnew2text=(TextView)findViewById(R.id.grid2text1);
        gridnew2text.setText("Totatives \n" +
                "\n" +
                "In number theory, Euler's totient function (phi function) counts the positive integers up to a given integer n that are relatively prime to n. Two integers are said to be relatively prime if the only positive integer (factor) that divides both of them is 1. \n" +
                "\n" +
                "The numbers less than or equal to and relatively prime to a given number n are called totatives. \n" +
                "\n" +
                "For example: \n" +
                "Input: 9 \n" +
                "Output: 6 \n" +
                "(The totatives of n = 9 are six numbers 1, 2, 4, 5, 7 and 8, so phi(9) = 6 because 3, 6 and 9 are not relatively prime with 9) \n" +
                "\n" +
                "Note that, phi(1)=1 because 1 is considered to be relatively prime to every positive number. \n" +
                "\n" +
                "Write a program to take positive integer n as an input and print the number of totatives in the numbers less than or equal to n. ");
        gridnew1text.setText("mport java.util.Scanner;\n" +
                "\n" +
                "public class Program\n" +
                "{\n" +
                "    public static void main(String[] args) {\n" +
                "        \n" +
                "        Scanner scanner = new Scanner(System.in);\n" +
                "       \n" +
                "        int input = scanner.nextInt();\n" +
                "        int number1 = input;\n" +
                "        int number2 = 0;\n" +
                "        int totatives = 0;\n" +
                "        int mod = 0;\n" +
                "        \n" +
                "        if(input == 0){\n" +
                "            \n" +
                "            System.out.println(\"phi(0) = n/a\");\n" +
                "            System.exit(0);\n" +
                "        }\n" +
                "        \n" +
                "        if(input == 1){\n" +
                "            \n" +
                "            System.out.println(\"phi(1) = 1\");\n" +
                "            System.exit(0);\n" +
                "        }\n" +
                "        \n" +
                "        for(int i = 1; i < input; i++){\n" +
                "       \n" +
                "        //greatest common divisor (euclidian algorithm)\n" +
                "        \n" +
                "            number1 = input;\n" +
                "            number2 = i;\n" +
                "            mod = number1 % number2;\n" +
                "            \n" +
                "            while(mod != 0){\n" +
                "            \n" +
                "                number1 = number2;\n" +
                "                number2 = mod;\n" +
                "                mod = number1 % number2; \n" +
                "            \n" +
                "            }\n" +
                "            \n" +
                "            //greatest common divisor = 1\n" +
                "            //--> totative found\n" +
                "            \n" +
                "            if(number2 == 1){\n" +
                "                \n" +
                "                totatives++;\n" +
                "            }\n" +
                "            \n" +
                "        }\n" +
                "        \n" +
                "        System.out.println(\"phi(\" + input + \") = \" + totatives);\n" +
                "        \n" +
                "        scanner.close();\n" +
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

            case R.id.menuitemgrid3: {
                Intent about = new Intent(gridnew14.this, aboutmeclass.class);
                startActivity(about);
                break;
            }
            case R.id.menuitemgrid4: {
                Intent help = new Intent(gridnew14.this, helpclass.class);
                startActivity(help);

                break;
            }
            case R.id.menuitemgrid5: {
                finish();
                break;
            }
            case R.id.menuitemgrid6: {
                Intent webint = new Intent(gridnew14.this, webintent.class);
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
                        textspeech.speak("Totatives \n" +
                                "\n" +
                                "In number theory, Euler's totient function (phi function) counts the positive integers up to a given integer n that are relatively prime to n. Two integers are said to be relatively prime if the only positive integer (factor) that divides both of them is 1. \n" +
                                "\n" +
                                "The numbers less than or equal to and relatively prime to a given number n are called totatives. \n" +
                                "\n" +
                                "For example: \n" +
                                "Input: 9 \n" +
                                "Output: 6 \n" +
                                "(The totatives of n = 9 are six numbers 1, 2, 4, 5, 7 and 8, so phi(9) = 6 because 3, 6 and 9 are not relatively prime with 9) \n" +
                                "\n" +
                                "Note that, phi(1)=1 because 1 is considered to be relatively prime to every positive number. \n" +
                                "\n" +
                                "Write a program to take positive integer n as an input and print the number of totatives in the numbers less than or equal to n. ", TextToSpeech.QUEUE_FLUSH, null);

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

