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

public class gridnew13 extends AppCompatActivity {
    TextToSpeech textspeech;
    View view;
    TextView gridnew1text,gridnew2text;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gridlayout13);
        gridnew1text=(TextView)findViewById(R.id.grid2text);
        gridnew2text=(TextView)findViewById(R.id.grid2text1);
        gridnew2text.setText("Linear Equation Solver \n" +
                "\n" +
                "A linear equation is an equation that may be put in the form a * x + b = c, where x is the variable, a, b, c are the coefficients, which are often real numbers. \n" +
                "\n" +
                "The solution of such an equation is the value that, when substituted to the unknown (the x), make the equality true. \n" +
                "\n" +
                "For example: \n" +
                "Input: \"2x - 3 = 1\" \n" +
                "Output: \"x = 2\" \n" +
                "\n" +
                "Input: \"3 = 1 + 2x\" \n" +
                "Output: \"x = 1\" \n" +
                "\n" +
                "Write a program that reads a linear equation as a string from the user input, solves and outputs the solution. ");
        gridnew1text.setText("import java.util.*;\n" +
                "import java.util.regex.*;\n" +
                "class linearEqnSolver{\n" +
                "static String var,s1,s2,s5,s6;\n" +
                "static int isError=0;\n" +
                "static double lx=0,rx=0,tx,x,ln=0,rn=0,n=0;\n" +
                "static String div0 = \"The equation has no real solutions since x is 0.\";\n" +
                "    public static void main (String args []){\n" +
                "        String eqn = new Scanner (System.in).nextLine(), s=\"(-?[0-9.]*[x]?)(([+-])([0-9.]*[x]?))?\";\n" +
                "        Pattern pattern = Pattern.compile(s+\"=\"+s, Pattern.CASE_INSENSITIVE);\n" +
                "        Matcher matcher = pattern.matcher(eqn.replaceAll(\" \",\"\"));\n" +
                "        try{ if (matcher.matches()){\n" +
                "        s1 = matcher.group(1);s2 = matcher.group(2);s5 = matcher.group(5);s6 = matcher.group(6);\n" +
                "       System.out.println(\"You entered: \"+eqn.toLowerCase());\n" +
                "        }else{System.out.println(\"\\t Format not allowed!\\n\\nPlease enter a proper equation in the form a(x)+b(x)=c(x)+d(x) where a,b,c and d are either positive or negative. E.g 2x-5=7x-8x\");return;}} catch(Exception e){\n" +
                "       System.out.println(eqn +\" : Sorry.An error occurred \\n  The ERROR is explained below: \\n\"+e);\n" +
                "       return ;\n" +
                "       }\n" +
                "       if (!(s1==null) && (s1.toLowerCase().endsWith(\"x\"))){\n" +
                "       lx+= Double.parseDouble(val(s1));\n" +
                "       }else if (!(s2==null) && !(s2==\"\")){\n" +
                "           ln += Double.parseDouble(s1.substring(0,s1.length()));\n" +
                "       }\n" +
                "       if (!(s2==null) && (s2.toLowerCase().endsWith(\"x\"))){\n" +
                "         lx+= Double.parseDouble(val(s2));\n" +
                "       }else if (!(s2==null) && !(s2==\"\")){\n" +
                "           ln += Double.parseDouble(s2.substring(0,s2.length()));\n" +
                "       }\n" +
                "       if (!(s5==null) && (s5.toLowerCase().endsWith(\"x\"))){\n" +
                "         rx+= Double.parseDouble(val(s5));\n" +
                "       }else if (!(s5==null) && !(s5==\"\")){\n" +
                "           rn += Double.parseDouble(s5.substring(0,s5.length()));\n" +
                "       }\n" +
                "       if (!(s6==null) && (s6.toLowerCase().endsWith(\"x\"))){\n" +
                "        rx+= Double.parseDouble(val(s6));\n" +
                "       }else if (!(s6==null) && !(s6==\"\")){\n" +
                "           rn += Double.parseDouble(s6.substring(0,s6.length()));\n" +
                "       }\n" +
                "       x=(lx-rx);n=(rn-ln);\n" +
                "       System.out.println(\"Simplified form of the equation: \"+x+\"x = \"+n+\"\\n\\t Then dividing by \"+x+\" on both sides to get the value of x:\\n\\t------------------\\n\\t\");\n" +
                "       System.out.println(x==0?div0:\"Value of x = \"+n/x);\n" +
                "       //System.out.println(isError==1?div0:(\"Value of x= \"+x));\n" +
                "    }\n" +
                "    static String val (String sx){\n" +
                "    double x=0,n=0;\n" +
                "        if ((sx.substring(0, sx.length()-1)).equals(\"-\"))\n" +
                "               x = Double.parseDouble(\"-1\");\n" +
                "        else if (((sx.substring(0, sx.length()-1)).equals(\"+\")) || (sx.substring(0,sx.length()-1).equals(\"\")))\n" +
                "               x = Double.parseDouble(\"1\");\n" +
                "         else \n" +
                "               x= Double.parseDouble((sx.substring(0, sx.length()-1)));\n" +
                "         return (String.valueOf(x));\n" +
                "   }\n" +
                "\n" +
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
                Intent about = new Intent(gridnew13.this, aboutmeclass.class);
                startActivity(about);
                break;
            }
            case R.id.menuitemgrid4: {
                Intent help = new Intent(gridnew13.this, helpclass.class);
                startActivity(help);

                break;
            }
            case R.id.menuitemgrid5: {
                finish();
                break;
            }
            case R.id.menuitemgrid6: {
                Intent webint = new Intent(gridnew13.this, webintent.class);
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
                        textspeech.speak("Linear Equation Solver \n" +
                                "\n" +
                                "A linear equation is an equation that may be put in the form a * x + b = c, where x is the variable, a, b, c are the coefficients, which are often real numbers. \n" +
                                "\n" +
                                "The solution of such an equation is the value that, when substituted to the unknown (the x), make the equality true. \n" +
                                "\n" +
                                "For example: \n" +
                                "Input: \"2x - 3 = 1\" \n" +
                                "Output: \"x = 2\" \n" +
                                "\n" +
                                "Input: \"3 = 1 + 2x\" \n" +
                                "Output: \"x = 1\" \n" +
                                "\n" +
                                "Write a program that reads a linear equation as a string from the user input, solves and outputs the solution. ", TextToSpeech.QUEUE_FLUSH, null);

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

