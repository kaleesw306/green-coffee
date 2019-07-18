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

public class gridnew3 extends AppCompatActivity {
    TextToSpeech textspeech;
    View view;
    TextView gridnew1text,gridnew2text;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gridlayout3);
        gridnew1text=(TextView)findViewById(R.id.grid2text);
        gridnew2text=(TextView)findViewById(R.id.grid2text1);
        gridnew2text.setText("Disarium Numbers\n" +
                "\n" +
                "A number is called a Disarium number if the sum of the powers of its digits equals the number itself. The digits are powered to their positions in the number.\n" +
                "\n" +
                "For example: \n" +
                "Input: 135 \n" +
                "Output: true \n" +
                "135 is a Disarium number because it equals to 1^1 + 3^2 + 5^3 (each digit powered to the position in the number).\n" +
                "\n" +
                "Write a program to check if the user input is a Disarium number or not.");
        gridnew1text.setText("import java.util.Scanner;\n" +
                "public class Disarium {\n" +
                "    \n" +
                "    static boolean isDisarium(int n) {\n" +
                "        var num = new Integer(n).toString();\n" +
                "        var sum = 0;\n" +
                "        for(var i=0;i<num.length();i++) {\n" +
                "            sum += Math.pow(Integer.parseInt(new Character( num.charAt(i)).toString()),i+1);\n" +
                "        }\n" +
                "        return sum == n;\n" +
                "    }\n" +
                "    static void bonus(int range) {\n" +
                "    System.out.println(\"Enter a range to see DISARIUMS in it: \"+range);\n" +
                "        for(var r=0;r<=range;r++) {\n" +
                "            if(isDisarium(r)) {\n" +
                "                System.out.print(\" \"+r);\n" +
                "            }\n" +
                "        }\n" +
                "    }\n" +
                "    public static void main(String[] args) {\n" +
                "    try {\n" +
                "        var scan = new Scanner(System.in);\n" +
                "        var cin = scan.nextInt();\n" +
                "        var r = scan.nextInt();\n" +
                "        System.out.println(\"Input: \"+cin+\"\\nIs Disarium: \"+isDisarium(cin));\n" +
                "      bonus(r);\n" +
                "      } catch(java.util.NoSuchElementException e) {\n" +
                "         System.out.println(\"Cannot find arguments(Number(int) and range(int)). Trying the default inputs...\\nInput: \"+135+\"\\nIs Disarium: \"+isDisarium(135));\n" +
                "         bonus(150);\n" +
                "      };\n" +
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
                Intent about = new Intent(gridnew3.this, aboutmeclass.class);
                startActivity(about);
                break;
            }
            case R.id.menuitemgrid4: {
                Intent help = new Intent(gridnew3.this, helpclass.class);
                startActivity(help);

                break;
            }
            case R.id.menuitemgrid5: {
                finish();
                break;
            }
            case R.id.menuitemgrid6: {
                Intent webint = new Intent(gridnew3.this, webintent.class);
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
                        textspeech.speak("Disarium Numbers\n" +
                                "\n" +
                                "A number is called a Disarium number if the sum of the powers of its digits equals the number itself. The digits are powered to their positions in the number.\n" +
                                "\n" +
                                "For example: \n" +
                                "Input: 135 \n" +
                                "Output: true \n" +
                                "135 is a Disarium number because it equals to 1^1 + 3^2 + 5^3 (each digit powered to the position in the number).\n" +
                                "\n" +
                                "Write a program to check if the user input is a Disarium number or not.", TextToSpeech.QUEUE_FLUSH, null);

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

