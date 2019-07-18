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

public class gridnew1 extends AppCompatActivity {
    TextToSpeech textspeech;
    TextView gridnew1text,gridnew2text;
    View view;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gridlayout1);
        gridnew1text=(TextView)findViewById(R.id.grid1text);
        gridnew2text=(TextView)findViewById(R.id.grid1text1);
        gridnew2text.setText("Create a function that accepts a string argument and returns an array of strings, which are shifted versions of the argument string.\n" +
                "\n" +
                "Sample Input \n" +
                "\"Hello\"\n" +
                "\n" +
                "Sample Output \n" +
                "[\"elloH\", \"lloHe\", \"loHel\", \"oHell\", \"Hello\"] \n" +
                "\n" +
                "As you can see from the example above, each element shifts the first character of the previous version to the end. \n" +
                "The original string should be included in the output array. The order matters; each element of the output array should be the shifted version of the previous element. \n" +
                "The output array should have the same length as the input string. \n" +
                "The function should return an empty array when a zero-length String is provided as the argument. ");
        gridnew1text.setText("import java.util.*;\n" +
                "import java.util.stream.IntStream;\n" +
                "public class ScrollString{\n" +
                "public static void main(String...ar){\n" +
                "\n" +
                "Arrays.asList(new Scanner(System.in). next()).stream().forEach(s->IntStream. rangeClosed(1,s.length()). forEach(i-> System.out.println(s.substring(i) + s. substring(0,i))));\n" +
                "    \n" +
                "}\n" +
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
                Intent about = new Intent(gridnew1.this, aboutmeclass.class);
                startActivity(about);
                break;
            }
            case R.id.menuitemgrid4: {
                Intent help = new Intent(gridnew1.this, helpclass.class);
                startActivity(help);

                break;
            }
            case R.id.menuitemgrid5: {
                finish();
                break;
            }
            case R.id.menuitemgrid6: {
                Intent webint = new Intent(gridnew1.this, webintent.class);
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
                        textspeech.speak("Create a function that accepts a string argument and returns an array of strings, which are shifted versions of the argument string.\n" +
                                "\n" +
                                "Sample Input \n" +
                                "\"Hello\"\n" +
                                "\n" +
                                "Sample Output \n" +
                                "[\"elloH\", \"lloHe\", \"loHel\", \"oHell\", \"Hello\"] \n" +
                                "\n" +
                                "As you can see from the example above, each element shifts the first character of the previous version to the end. \n" +
                                "The original string should be included in the output array. The order matters; each element of the output array should be the shifted version of the previous element. \n" +
                                "The output array should have the same length as the input string. \n" +
                                "The function should return an empty array when a zero-length String is provided as the argument. ", TextToSpeech.QUEUE_FLUSH, null);

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
