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

public class gridnew2 extends AppCompatActivity {
    TextToSpeech textspeech;
    View view;
    TextView gridnew1text,gridnew2text;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gridlayout2);
        gridnew1text=(TextView)findViewById(R.id.grid2text);
        gridnew2text=(TextView)findViewById(R.id.grid2text1);
        gridnew2text.setText("Array Partitioning\n" +
                "\n" +
                "Divide a given array of numbers into two subarrays such that the absolute difference between their sums is the smallest possible. For example, the array [2, 5, 4, 7, 15, 20] can be divided into subarrays [15, 7, 4] and [20, 5, 2]. The difference between the sums of those arrays is 1, and it is the smallest. \n" +
                "For example: \n" +
                "Input: \n" +
                "6 \n" +
                "4, 15, 20, 2, 7, 5\n" +
                "\n" +
                "Output: \n" +
                "[15, 7, 4] \n" +
                "[20, 5, 2] \n" +
                "1 \n" +
                "(The sum of the first subarray is 26, the sum of the second subarray is 27, the difference is 1.) ");
        gridnew1text.setText("public class Program\n" +
                "{\n" +
                "private static int inc=0,add=0,i=0,sum;\n" +
                "private static int col,col1,incol;  \n" +
                "public static final String arr=\"4 15 20 2 7 5\";\n" +
                "private static String first=\"\",second=\"\",finale=\"\";  \n" +
                "private static String arr1[]=arr.split(\" \");  \n" +
                "private static int arr2[]=new int[arr1.length],arr3[];\n" +
                "\n" +
                "    public static void main(String[] args){\n" +
                "       arr3=returnArr();\n" +
                "       sum=returnSum(arr3);\n" +
                "       java.util.Arrays.sort(arr3);\n" +
                "       incol=arr3.length;\n" +
                "      String ans= giveAns();\n" +
                "      System.out.println(ans);\n" +
                "    }\n" +
                "     public static int returnSum(int arr[])\n" +
                "     {\n" +
                "        if(inc!=arr.length){add+=arr[inc++];returnSum(arr);}              \n" +
                "         return add;\n" +
                "     }\n" +
                "     public static int[] returnArr()\n" +
                "     {\n" +
                "if(i!=arr1.length){arr2[i]=Integer.parseInt(arr1[i]);i++;returnArr();}\n" +
                "           return arr2;\n" +
                "     }\n" +
                "       public static String giveAns()\n" +
                "       {\n" +
                "finale+=(col<col1?(first+=\" \"+((col+=arr3[--incol])>0?arr3[incol]:\"\")):(second+=\" \"+((col1+=arr3[--incol])>0?arr3[incol]:\"\")));\n" +
                "\n" +
                "   if(incol!=0) giveAns();\n" +
                "            \n" +
                "return\"[\"+first+\"]\\n[\"+second+\"]\\n\"+(col<col1?col1-col:col-col1);\n" +
                "       }\n" +
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
                Intent about = new Intent(gridnew2.this, aboutmeclass.class);
                startActivity(about);
                break;
            }
            case R.id.menuitemgrid4: {
                Intent help = new Intent(gridnew2.this, helpclass.class);
                startActivity(help);

                break;
            }
            case R.id.menuitemgrid5: {
                finish();
                break;
            }
            case R.id.menuitemgrid6: {
                Intent webint = new Intent(gridnew2.this, webintent.class);
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
                        textspeech.speak("Array Partitioning\\n\" +\n" +
                                "                \"\\n\" +\n" +
                                "                \"Divide a given array of numbers into two subarrays such that the absolute difference between their sums is the smallest possible. For example, the array [2, 5, 4, 7, 15, 20] can be divided into subarrays [15, 7, 4] and [20, 5, 2]. The difference between the sums of those arrays is 1, and it is the smallest. \\n\" +\n" +
                                "                \"For example: \\n\" +\n" +
                                "                \"Input: \\n\" +\n" +
                                "                \"6 \\n\" +\n" +
                                "                \"4, 15, 20, 2, 7, 5\\n\" +\n" +
                                "                \"\\n\" +\n" +
                                "                \"Output: \\n\" +\n" +
                                "                \"[15, 7, 4] \\n\" +\n" +
                                "                \"[20, 5, 2] \\n\" +\n" +
                                "                \"1 \\n\" +\n" +
                                "                \"(The sum of the first subarray is 26, the sum of the second subarray is 27, the difference is 1.)", TextToSpeech.QUEUE_FLUSH, null);

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

