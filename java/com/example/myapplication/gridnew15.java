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

public class gridnew15 extends AppCompatActivity {
    TextToSpeech textspeech;
    View view;
    TextView gridnew1text,gridnew2text;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gridlayout15);
        gridnew1text=(TextView)findViewById(R.id.grid2text);
        gridnew2text=(TextView)findViewById(R.id.grid2text1);
        gridnew2text.setText("Semiprime Numbers \n" +
                "\n" +
                "A semiprime number is a natural number that is the product of exactly two (not necessarily distinct) primes. \n" +
                "\n" +
                "For example: \n" +
                "Input: 57 \n" +
                "Output: true (57 is a semiprime number because it is the product of two primes, 57 = 3 * 19) \n" +
                "\n" +
                "Input: 121 \n" +
                "Output: true (121 is a semiprime number because it is the product of two primes, 121 = 11 * 11) \n" +
                "\n" +
                "Input: 186 \n" +
                "Output: false (186 is not a semiprime number because it is the product of three primes: 186 = 2 * 3 * 31) \n" +
                "\n" +
                "Write a program to check if the user input is a semiprime number or not. ");
        gridnew1text.setText("import java.util.List; \n" +
                "import java.util.Scanner; \n" +
                "import java.util.stream.Collectors; \n" +
                "import java.util.stream.IntStream; \n" +
                "\n" +
                "public class SemiPrime { \n" +
                "\n" +
                "    public static void main(String[] args) { \n" +
                "        Scanner sc = new Scanner(System.in); \n" +
                "        int value = sc.nextInt(); \n" +
                "        List<Integer> ints = IntStream.rangeClosed(2, value) \n" +
                "                .boxed() \n" +
                "                .filter(SemiPrime::isSemiPrime).collect(Collectors.toList()); \n" +
                "        System.out.println(ints); \n" +
                "    } \n" +
                "\n" +
                "    static boolean isSemiPrime(int value) { \n" +
                "        int divider = biggestPrimeDivider(value); \n" +
                "        if (divider == -1) \n" +
                "            return false; \n" +
                "        int v = value / divider; \n" +
                "        return isPrime(v); \n" +
                "    } \n" +
                "\n" +
                "\n" +
                "    static int biggestPrimeDivider(int n) { \n" +
                "        int sqrt = n/2; \n" +
                "        for (int i = sqrt; i >= 2; i--) { \n" +
                "            if (n % i == 0 && isPrime(i)) { \n" +
                "                return i; \n" +
                "            } \n" +
                "        } \n" +
                "        return -1; \n" +
                "    } \n" +
                "\n" +
                "    static boolean isPrime(int n) { \n" +
                "        for (int i = 2; i <= Math.sqrt(n); i++) { \n" +
                "            if (n % i == 0) \n" +
                "                return false; \n" +
                "        } \n" +
                "        return true; \n" +
                "    } \n" +
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
                Intent about = new Intent(gridnew15.this, aboutmeclass.class);
                startActivity(about);
                break;
            }
            case R.id.menuitemgrid4: {
                Intent help = new Intent(gridnew15.this, helpclass.class);
                startActivity(help);

                break;
            }
            case R.id.menuitemgrid5: {
                finish();
                break;
            }
            case R.id.menuitemgrid6: {
                Intent webint = new Intent(gridnew15.this, webintent.class);
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
                        textspeech.speak("Semiprime Numbers \n" +
                                "\n" +
                                "A semiprime number is a natural number that is the product of exactly two (not necessarily distinct) primes. \n" +
                                "\n" +
                                "For example: \n" +
                                "Input: 57 \n" +
                                "Output: true (57 is a semiprime number because it is the product of two primes, 57 = 3 * 19) \n" +
                                "\n" +
                                "Input: 121 \n" +
                                "Output: true (121 is a semiprime number because it is the product of two primes, 121 = 11 * 11) \n" +
                                "\n" +
                                "Input: 186 \n" +
                                "Output: false (186 is not a semiprime number because it is the product of three primes: 186 = 2 * 3 * 31) \n" +
                                "\n" +
                                "Write a program to check if the user input is a semiprime number or not. ", TextToSpeech.QUEUE_FLUSH, null);

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

