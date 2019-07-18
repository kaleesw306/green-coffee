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

public class gridnew16 extends AppCompatActivity {
    TextToSpeech textspeech;
    View view;
    TextView gridnew1text,gridnew2text;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gridlayout16);
        gridnew1text=(TextView)findViewById(R.id.grid2text);
        gridnew2text=(TextView)findViewById(R.id.grid2text1);
        gridnew2text.setText(" Password Generator \n" +
                "\n" +
                "Given the password length as input, create a program that will generate a random password by using a set of characters. The length must be between 8 and 32 characters. \n" +
                "Examples: \n" +
                "Input: 8 \n" +
                "Output: aR67+oP_ \n" +
                "\n" +
                "Input: 12 \n" +
                "Output: kS5h7a*e$n@e ");
        gridnew1text.setText(" public class PasswordGenerator \n" +
                "{ \n" +
                "    public static void main(String[] args) \n" +
                "    { \n" +
                "        int length = 10; // password length \n" +
                "        System.out.println(generatePswd(length)); \n" +
                "    } \n" +
                "    static char[] generatePswd(int len) \n" +
                "    { \n" +
                "        System.out.println(\"Your Password:\");\n" +
                "        String charsCaps = \"ABCDEFGHIJKLMNOPQRSTUVWXYZ\"; \n" +
                "        String chars = \"abcdefghijklmnopqrstuvwxyz\"; \n" +
                "        String nums = \"0123456789\"; \n" +
                "        String symbols = \"!@#$%^&*_=+-/€.?<>)\"; \n" +
                "\n" +
                "        String passSymbols = charsCaps + chars + nums + symbols; \n" +
                "        Random rnd = new Random(); \n" +
                "        \n" +
                "        char[] password = new char[len]; \n" +
                "        int index = 0; \n" +
                "        for (int i = 0; i < len; i++) \n" +
                "        { \n" +
                "            password[i] = passSymbols.charAt(rnd.nextInt(passSymbols.length())); \n" +
                "            \n" +
                "        } \n" +
                "        return password; \n" +
                "    } \n" +
                "} \n" +
                "S");
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
                Intent about = new Intent(gridnew16.this, aboutmeclass.class);
                startActivity(about);
                break;
            }
            case R.id.menuitemgrid4: {
                Intent help = new Intent(gridnew16.this, helpclass.class);
                startActivity(help);

                break;
            }
            case R.id.menuitemgrid5: {
                finish();
                break;
            }
            case R.id.menuitemgrid6: {
                Intent webint = new Intent(gridnew16.this, webintent.class);
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
                        textspeech.speak(" Password Generator \n" +
                                "\n" +
                                "Given the password length as input, create a program that will generate a random password by using a set of characters. The length must be between 8 and 32 characters. \n" +
                                "Examples: \n" +
                                "Input: 8 \n" +
                                "Output: aR67+oP_ \n" +
                                "\n" +
                                "Input: 12 \n" +
                                "Output: kS5h7a*e$n@e ", TextToSpeech.QUEUE_FLUSH, null);

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

