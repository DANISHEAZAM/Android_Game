package com.azam.danish.tictactoe;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    boolean play=false;
    int currentplayer=0;

    int myblackassets[]={
            R.drawable.circle,
            R.drawable.cross
    };
    int mygreenassets[]={
        R.drawable.circlegeen,
        R.drawable.crossgreen
    };
int mygame[]={4,4,4,4,4,4,4,4,4};
int counter=0;

    public  void tappingImage(View view){

        ImageView myimage = (ImageView) view;
        int currenttag=Integer.parseInt((myimage.getTag().toString()));
     if(play==true){
        if(mygame[currenttag]==4) {
            if (currentplayer == 0) {

                myimage.setImageResource(myblackassets[1]);
                mygame[currenttag]=0;
                winnimgLogic();
                drawLogic();
                currentplayer = 1;
                counter++;
                TextView textView = (TextView) findViewById(R.id.textView);
                textView.animate().alpha(0).setDuration(100);
                if(winnimgLogic()!=0&&winnimgLogic()!=1) {
                       if(drawLogic()!=4) {
                           TextView textView2 = (TextView) findViewById(R.id.textView2);


                           textView2.setText("ZERO's TURN");
                           textView2.animate().alpha(1).setDuration(500);
                       }
                }



            } else if (currentplayer == 1) {
                myimage.setImageResource(myblackassets[0]);
                mygame[currenttag]=1;
                winnimgLogic();
                drawLogic();

                currentplayer = 0;
                counter++;
                TextView textView2 = (TextView) findViewById(R.id.textView2);
                textView2.animate().alpha(0).setDuration(100);
                if(winnimgLogic()!=0&&winnimgLogic()!=1) {
                     if(drawLogic()!=4) {
                         TextView textView = (TextView) findViewById(R.id.textView);

                         textView.setText("CROSS's TURN");

                         textView.animate().alpha(1).setDuration(500);
                     }
                }
            }

        }
        else
        {
            final Toast toast=Toast.makeText(MainActivity.this,"Box already filled",Toast.LENGTH_SHORT);
            toast.show();;
            Handler handler =new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    toast.cancel();
                }
            },500);
        }

    }
    }
    public int winnimgLogic(){

            if (mygame[0] == 0 && mygame[1] == 0 && mygame[2] == 0) {
                final Toast toast=Toast.makeText(MainActivity.this,"CROSS WINS",Toast.LENGTH_SHORT);
                toast.show();
                Handler handler =new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        toast.cancel();
                    }
                },1000);
                play=false;

                ImageView img11=(ImageView)findViewById(R.id.imageView11);
                img11.setImageResource(mygreenassets[1]);
                ImageView img12=(ImageView)findViewById(R.id.imageView12);
                img12.setImageResource(mygreenassets[1]);
                ImageView img13=(ImageView)findViewById(R.id.imageView13);
                img13.setImageResource(mygreenassets[1]);
                Button mybutton=(Button)findViewById(R.id.mybutton);
                mybutton.setText("START AGAIN");
                return 0;
            }
            if (mygame[0] == 1 && mygame[1] == 1 && mygame[2] == 1) {
                final Toast toast=Toast.makeText(MainActivity.this,"ZERO WINS",Toast.LENGTH_SHORT);
                toast.show();
                Handler handler=new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        toast.cancel();
                    }
                },1000);
                play=false;

                ImageView img11=(ImageView)findViewById(R.id.imageView11);
                img11.setImageResource(mygreenassets[0]);
                ImageView img12=(ImageView)findViewById(R.id.imageView12);
                img12.setImageResource(mygreenassets[0]);
                ImageView img13=(ImageView)findViewById(R.id.imageView13);
                img13.setImageResource(mygreenassets[0]);
                Button mybutton=(Button)findViewById(R.id.mybutton);
                mybutton.setText("START AGAIN");
                return 1;
            }
        if (mygame[3] == 0 && mygame[4] == 0 && mygame[5] == 0) {
            final Toast toast=Toast.makeText(MainActivity.this,"CROSS WINS",Toast.LENGTH_SHORT);
            toast.show();;
            Handler handler =new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    toast.cancel();
                }
            },1000);
            play=false;

            ImageView img21=(ImageView)findViewById(R.id.imageView21);
            img21.setImageResource(mygreenassets[1]);
            ImageView img22=(ImageView)findViewById(R.id.imageView22);
            img22.setImageResource(mygreenassets[1]);
            ImageView img23=(ImageView)findViewById(R.id.imageView23);
            img23.setImageResource(mygreenassets[1]);
            Button mybutton=(Button)findViewById(R.id.mybutton);
            mybutton.setText("START AGAIN");
            return 0;
        }
        if (mygame[3] == 1 && mygame[4] == 1 && mygame[5] == 1) {
            final Toast toast=Toast.makeText(MainActivity.this,"ZERO WINS",Toast.LENGTH_SHORT);
            toast.show();
            Handler handler=new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    toast.cancel();
                }
            },1000);
            play=false;

            ImageView img21=(ImageView)findViewById(R.id.imageView21);
            img21.setImageResource(mygreenassets[0]);
            ImageView img22=(ImageView)findViewById(R.id.imageView22);
            img22.setImageResource(mygreenassets[0]);
            ImageView img23=(ImageView)findViewById(R.id.imageView23);
            img23.setImageResource(mygreenassets[0]);
            Button mybutton=(Button)findViewById(R.id.mybutton);
            mybutton.setText("START AGAIN");
            return 1;
        }
        if (mygame[6] == 0 && mygame[7] == 0 && mygame[8] == 0) {
            final Toast toast=Toast.makeText(MainActivity.this,"CROSS WINS",Toast.LENGTH_SHORT);
            toast.show();;
            Handler handler =new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    toast.cancel();
                }
            },1000);
            play=false;

            ImageView img31=(ImageView)findViewById(R.id.imageView31);
            img31.setImageResource(mygreenassets[1]);
            ImageView img32=(ImageView)findViewById(R.id.imageView32);
            img32.setImageResource(mygreenassets[1]);
            ImageView img33=(ImageView)findViewById(R.id.imageView33);
            img33.setImageResource(mygreenassets[1]);
            Button mybutton=(Button)findViewById(R.id.mybutton);
            mybutton.setText("START AGAIN");
            return 0;
        }
        if (mygame[6] == 1 && mygame[7] == 1 && mygame[8] == 1) {
            final Toast toast=Toast.makeText(MainActivity.this,"ZERO WINS",Toast.LENGTH_SHORT);
            toast.show();
            Handler handler=new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    toast.cancel();
                }
            },1000);
            play=false;

            ImageView img31=(ImageView)findViewById(R.id.imageView31);
            img31.setImageResource(mygreenassets[0]);
            ImageView img32=(ImageView)findViewById(R.id.imageView32);
            img32.setImageResource(mygreenassets[0]);
            ImageView img33=(ImageView)findViewById(R.id.imageView33);
            img33.setImageResource(mygreenassets[0]);
            Button mybutton=(Button)findViewById(R.id.mybutton);
            mybutton.setText("START AGAIN");
            return 1;
        }







        if (mygame[0] == 0 && mygame[3] == 0 && mygame[6] == 0) {
            final Toast toast=Toast.makeText(MainActivity.this,"CROSS WINS",Toast.LENGTH_SHORT);
            toast.show();;
            Handler handler =new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    toast.cancel();
                }
            },1000);
            play=false;

            ImageView img11=(ImageView)findViewById(R.id.imageView11);
            img11.setImageResource(mygreenassets[1]);
            ImageView img21=(ImageView)findViewById(R.id.imageView21);
            img21.setImageResource(mygreenassets[1]);
            ImageView img31=(ImageView)findViewById(R.id.imageView31);
            img31.setImageResource(mygreenassets[1]);

            return 0;
        }
        if (mygame[0] == 1 && mygame[3] == 1 && mygame[6] == 1) {
            final Toast toast=Toast.makeText(MainActivity.this,"ZERO WINS",Toast.LENGTH_SHORT);
            toast.show();
            Handler handler=new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    toast.cancel();
                }
            },1000);
            play=false;

            ImageView img11=(ImageView)findViewById(R.id.imageView11);
            img11.setImageResource(mygreenassets[0]);
            ImageView img21=(ImageView)findViewById(R.id.imageView21);
            img21.setImageResource(mygreenassets[0]);
            ImageView img31=(ImageView)findViewById(R.id.imageView31);
            img31.setImageResource(mygreenassets[0]);
            Button mybutton=(Button)findViewById(R.id.mybutton);
            mybutton.setText("START AGAIN");
            return 1;
        }
        if (mygame[1] == 0 && mygame[4] == 0 && mygame[7] == 0) {
            final Toast toast=Toast.makeText(MainActivity.this,"CROSS WINS",Toast.LENGTH_SHORT);
            toast.show();;
            Handler handler =new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    toast.cancel();
                }
            },1000);
            play=false;

            ImageView img12=(ImageView)findViewById(R.id.imageView12);
            img12.setImageResource(mygreenassets[1]);
            ImageView img22=(ImageView)findViewById(R.id.imageView22);
            img22.setImageResource(mygreenassets[1]);
            ImageView img32=(ImageView)findViewById(R.id.imageView32);
            img32.setImageResource(mygreenassets[1]);
            Button mybutton=(Button)findViewById(R.id.mybutton);
            mybutton.setText("START AGAIN");
            return 0;
        }
        if (mygame[1] == 1 && mygame[4] == 1 && mygame[7] == 1) {
            final Toast toast=Toast.makeText(MainActivity.this,"ZERO WINS",Toast.LENGTH_SHORT);
            toast.show();
            Handler handler=new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    toast.cancel();
                }
            },1000);
            play=false;

            ImageView img12=(ImageView)findViewById(R.id.imageView12);
            img12.setImageResource(mygreenassets[0]);
            ImageView img22=(ImageView)findViewById(R.id.imageView22);
            img22.setImageResource(mygreenassets[0]);
            ImageView img32=(ImageView)findViewById(R.id.imageView32);
            img32.setImageResource(mygreenassets[0]);
            Button mybutton=(Button)findViewById(R.id.mybutton);
            mybutton.setText("START AGAIN");
            return 1;
        }
        if (mygame[2] == 0 && mygame[5] == 0 && mygame[8] == 0) {
            final Toast toast=Toast.makeText(MainActivity.this,"CROSS WINS",Toast.LENGTH_SHORT);
            toast.show();;
            Handler handler =new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    toast.cancel();
                }
            },1000);
            play=false;

            ImageView img33=(ImageView)findViewById(R.id.imageView33);
            img33.setImageResource(mygreenassets[1]);
            ImageView img23=(ImageView)findViewById(R.id.imageView23);
            img23.setImageResource(mygreenassets[1]);
            ImageView img13=(ImageView)findViewById(R.id.imageView13);
            img13.setImageResource(mygreenassets[1]);
            Button mybutton=(Button)findViewById(R.id.mybutton);
            mybutton.setText("START AGAIN");
            return 0;
        }
        if (mygame[2] == 1 && mygame[5] == 1 && mygame[8] == 1) {
            final Toast toast=Toast.makeText(MainActivity.this,"ZERO WINS",Toast.LENGTH_SHORT);
            toast.show();
            Handler handler=new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    toast.cancel();
                }
            },1000);
            play=false;

            ImageView img33=(ImageView)findViewById(R.id.imageView33);
            img33.setImageResource(mygreenassets[0]);
            ImageView img23=(ImageView)findViewById(R.id.imageView23);
            img23.setImageResource(mygreenassets[0]);
            ImageView img13=(ImageView)findViewById(R.id.imageView13);
            img13.setImageResource(mygreenassets[0]);
            Button mybutton=(Button)findViewById(R.id.mybutton);
            mybutton.setText("START AGAIN");
            return 1;
        }











        if (mygame[0] == 0 && mygame[4] == 0 && mygame[8] == 0) {

            final Toast toast=Toast.makeText(MainActivity.this,"CROSS WINS",Toast.LENGTH_SHORT);
            toast.show();;
            Handler handler =new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    toast.cancel();
                }
            },1000);
            play=false;

            ImageView img11=(ImageView)findViewById(R.id.imageView11);
            img11.setImageResource(mygreenassets[1]);
            ImageView img22=(ImageView)findViewById(R.id.imageView22);
            img22.setImageResource(mygreenassets[1]);
            ImageView img33=(ImageView)findViewById(R.id.imageView33);
            img33.setImageResource(mygreenassets[1]);
            Button mybutton=(Button)findViewById(R.id.mybutton);
            mybutton.setText("START AGAIN");
            return 0;
        }
        if (mygame[0] == 1 && mygame[4] == 1 && mygame[8] == 1) {
            final Toast toast=Toast.makeText(MainActivity.this,"ZERO WINS",Toast.LENGTH_SHORT);
            toast.show();
            Handler handler=new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    toast.cancel();
                }
            },1000);
            play=false;

            ImageView img11=(ImageView)findViewById(R.id.imageView11);
            img11.setImageResource(mygreenassets[0]);
            ImageView img22=(ImageView)findViewById(R.id.imageView22);
            img22.setImageResource(mygreenassets[0]);
            ImageView img33=(ImageView)findViewById(R.id.imageView33);
            img33.setImageResource(mygreenassets[0]);
            Button mybutton=(Button)findViewById(R.id.mybutton);
            mybutton.setText("START AGAIN");
            return 1;
        }
        if (mygame[2] == 0 && mygame[4] == 0 && mygame[6] == 0) {
            final Toast toast=Toast.makeText(MainActivity.this,"CROSS WINS",Toast.LENGTH_SHORT);
            toast.show();;
            Handler handler =new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    toast.cancel();
                }
            },1000);
            play=false;

            ImageView img22=(ImageView)findViewById(R.id.imageView22);
            img22.setImageResource(mygreenassets[1]);
            ImageView img31=(ImageView)findViewById(R.id.imageView31);
            img31.setImageResource(mygreenassets[1]);
            ImageView img13=(ImageView)findViewById(R.id.imageView13);
            img13.setImageResource(mygreenassets[1]);
            Button mybutton=(Button)findViewById(R.id.mybutton);
            mybutton.setText("START AGAIN");
            return 0;
        }

        if (mygame[2] == 1 && mygame[4] == 1 && mygame[6] == 1) {
            final Toast toast=Toast.makeText(MainActivity.this,"ZERO WINS",Toast.LENGTH_SHORT);
            toast.show();
            Handler handler=new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    toast.cancel();
                }
            },1000);
            play=false;

            Button mybutton=(Button)findViewById(R.id.mybutton);
            mybutton.setText("START AGAIN");
            ImageView img22=(ImageView)findViewById(R.id.imageView22);
            img22.setImageResource(mygreenassets[0]);
            ImageView img31=(ImageView)findViewById(R.id.imageView31);
            img31.setImageResource(mygreenassets[0]);
            ImageView img13=(ImageView)findViewById(R.id.imageView13);
            img13.setImageResource(mygreenassets[0]);
            return 1;
        }



       return 3;
    }
public int drawLogic(){
        int draw=winnimgLogic();
        if(draw==3&&counter>=9){


            final Toast toast=Toast.makeText(MainActivity.this,"MATCH TIE",Toast.LENGTH_SHORT);

            toast.show();
            Handler handler=new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    toast.cancel();
                }
            },1000);
            play=false;

            Button mybutton=(Button)findViewById(R.id.mybutton);
            mybutton.setText("START AGAIN");
            return  4;
        }
        return 5;
}



    public void playAgain(View view){

        play=true;
        Button mybutton=(Button)findViewById(R.id.mybutton);
        mybutton.setText("START AGAIN");
        TextView textView=(TextView)findViewById(R.id.textView);
        textView.setText("CROSS's TURN");
        textView.animate().alpha(1).setDuration(300);

         currentplayer=0;
         counter=0;

         for (int i=0;i<mygame.length;i++){
             mygame[i]=4;
         }
        LinearLayout lineone=(LinearLayout)findViewById(R.id.lineone);
         for (int i=0;i<lineone.getChildCount();i++){
             ImageView Img =(ImageView) lineone.getChildAt(i);
             Img.setImageResource(R.drawable.normalbackground);

         }
        LinearLayout linetwo=(LinearLayout)findViewById(R.id.linetwo);
        for (int i=0;i<linetwo.getChildCount();i++){
            ImageView Img1 =(ImageView) linetwo.getChildAt(i);
            Img1.setImageResource(R.drawable.normalbackground);

        }
        LinearLayout linethree=(LinearLayout)findViewById(R.id.linethree);
        for (int i=0;i<linethree.getChildCount();i++){
            ImageView Img2 =(ImageView) linethree.getChildAt(i);
            Img2.setImageResource(R.drawable.normalbackground);

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
