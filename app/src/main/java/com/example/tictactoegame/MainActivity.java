package com.example.tictactoegame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView imageView0,imageView1,imageView2,imageView3,imageView4,imageView5,imageView6
            ,imageView7,imageView8;
    private TextView textView;
    private Button button;

    /**
     *          0->O
     *          1->X
     */
    private static int activeplayer=0;

    /**
     *          0->0
     *          1->X
     *          2->null
     */
    private static int[] currentvalues={2, 2, 2, 2, 2, 2, 2, 2, 2};

    private static int winningpos[][] = {{0,1,2},{3,4,5},{6,7,8},
                                         {0,3,6},{1,4,7},{2,5,8},
                                         {0,4,8},{2,4,6}};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        textView.setText("O's turn");

        imageView0.setOnClickListener(this);
        imageView1.setOnClickListener(this);
        imageView2.setOnClickListener(this);
        imageView3.setOnClickListener(this);
        imageView4.setOnClickListener(this);
        imageView5.setOnClickListener(this);
        imageView6.setOnClickListener(this);
        imageView7.setOnClickListener(this);
        imageView8.setOnClickListener(this);

        button.setOnClickListener(this);
        
    }

    private void initViews() {

        imageView0=findViewById(R.id.imageView0);
        imageView1=findViewById(R.id.imageView1);
        imageView2=findViewById(R.id.imageView2);
        imageView3=findViewById(R.id.imageView3);
        imageView4=findViewById(R.id.imageView4);
        imageView5=findViewById(R.id.imageView5);
        imageView6=findViewById(R.id.imageView6);
        imageView7=findViewById(R.id.imageView7);
        imageView8=findViewById(R.id.imageView8);

        textView=findViewById(R.id.textView);

        button=findViewById(R.id.button);
    }

    @Override
    public void onClick(View v) {


        switch (v.getId()){

            case R.id.button:
                reset();
                break;

            case R.id.imageView0:
                if(currentvalues[0]==2)
                    if(activeplayer==0) {
                        textView.setText("X's TURN");
                        imageView0.setImageResource(R.drawable.zero1);
                        currentvalues[0]=0;
                        activeplayer = 1;
                    }
                    else if(activeplayer==1){
                        textView.setText("O's TURN");
                        imageView0.setImageResource(R.drawable.cross1);
                        currentvalues[0]=1;
                        activeplayer=0;
                    }

                checkIfWon();

                break;


            case R.id.imageView1:
                if(currentvalues[1]==2)
                    if(activeplayer==0) {
                        textView.setText("X's TURN");
                        imageView1.setImageResource(R.drawable.zero1);
                        currentvalues[1]=0;
                        activeplayer = 1;
                    }
                    else if(activeplayer==1){
                        textView.setText("O's TURN");
                        imageView1.setImageResource(R.drawable.cross1);
                        currentvalues[1]=1;
                        activeplayer=0;
                    }

                checkIfWon();

                break;


            case R.id.imageView2:
                if(currentvalues[2]==2)
                    if(activeplayer==0) {
                        textView.setText("X's TURN");
                        imageView2.setImageResource(R.drawable.zero1);
                        currentvalues[2]=0;
                        activeplayer = 1;
                    }
                    else if(activeplayer==1){
                        textView.setText("O's TURN");
                        imageView2.setImageResource(R.drawable.cross1);
                        currentvalues[2]=1;
                        activeplayer=0;
                    }

                checkIfWon();

                break;


            case R.id.imageView3:
                if(currentvalues[3]==2)
                    if(activeplayer==0) {
                        textView.setText("X's TURN");
                        imageView3.setImageResource(R.drawable.zero1);
                        currentvalues[3]=0;
                        activeplayer = 1;
                    }
                    else if(activeplayer==1){
                        textView.setText("O's TURN");
                        imageView3.setImageResource(R.drawable.cross1);
                        currentvalues[3]=1;
                        activeplayer=0;
                    }

                checkIfWon();

                break;


            case R.id.imageView4:
                if(currentvalues[4]==2)
                    if(activeplayer==0) {
                        textView.setText("X's TURN");
                        imageView4.setImageResource(R.drawable.zero1);
                        currentvalues[4]=0;
                        activeplayer = 1;
                    }
                    else if(activeplayer==1){
                        textView.setText("O's TURN");
                        imageView4.setImageResource(R.drawable.cross1);
                        currentvalues[4]=1;
                        activeplayer=0;
                    }

                checkIfWon();


                break;


            case R.id.imageView5:
                if(currentvalues[5]==2)
                    if(activeplayer==0) {
                        textView.setText("X's TURN");
                        imageView5.setImageResource(R.drawable.zero1);
                        currentvalues[5]=0;
                        activeplayer = 1;
                    }
                    else if(activeplayer==1){
                        textView.setText("O's TURN");
                        imageView5.setImageResource(R.drawable.cross1);
                        currentvalues[5]=1;
                        activeplayer=0;
                    }

                checkIfWon();

                break;


            case R.id.imageView6:
                if(currentvalues[6]==2)
                    if(activeplayer==0) {
                        textView.setText("X's TURN");
                        imageView6.setImageResource(R.drawable.zero1);
                        currentvalues[6]=0;
                        activeplayer = 1;
                    }
                    else if(activeplayer==1){
                        textView.setText("O's TURN");
                        imageView6.setImageResource(R.drawable.cross1);
                        currentvalues[6]=1;
                        activeplayer=0;
                    }

                checkIfWon();

                break;


            case R.id.imageView7:
                if(currentvalues[7]==2)
                    if(activeplayer==0) {
                        textView.setText("X's TURN");
                        imageView7.setImageResource(R.drawable.zero1);
                        currentvalues[7]=0;
                        activeplayer = 1;
                    }
                    else if(activeplayer==1){
                        textView.setText("O's TURN");
                        imageView7.setImageResource(R.drawable.cross1);
                        currentvalues[7]=1;
                        activeplayer=0;
                    }

                checkIfWon();

                break;


            case R.id.imageView8:
                if(currentvalues[8]==2)
                    if(activeplayer==0) {
                        textView.setText("X's TURN");
                        imageView8.setImageResource(R.drawable.zero1);
                        currentvalues[8]=0;
                        activeplayer = 1;
                    }
                    else if(activeplayer==1){
                        textView.setText("O's TURN");
                        imageView8.setImageResource(R.drawable.cross1);
                        currentvalues[8]=1;
                        activeplayer=0;
                    }

                checkIfWon();

                break;



            default:
                break;
        }
        
    }

    private void reset() {
        activeplayer=0;
        for(int i=0;i<currentvalues.length;i++){
            currentvalues[i]=2;
        }
        imageView0.setImageResource(0);
        imageView1.setImageResource(0);
        imageView2.setImageResource(0);
        imageView3.setImageResource(0);
        imageView4.setImageResource(0);
        imageView5.setImageResource(0);
        imageView6.setImageResource(0);
        imageView7.setImageResource(0);
        imageView8.setImageResource(0);
        textView.setText("O's TURN");

    }

    private void checkIfWon() {
        for(int [] winnpos: winningpos){
            if(currentvalues[winnpos[0]]==currentvalues[winnpos[1]]
                && currentvalues[winnpos[1]]==currentvalues[winnpos[2]]
                    && currentvalues[winnpos[1]]!=2
            ){

                if(currentvalues[winnpos[1]]==0){
                    Toast.makeText(this, "O IS THE WINNER ", Toast.LENGTH_SHORT).show();
                    textView.setText("O IS THE WINNER ");
//                    reset();
                }
                else if(currentvalues[winnpos[1]]==1){
                    Toast.makeText(this, "X IS THE WINNER ", Toast.LENGTH_SHORT).show();
                    textView.setText("X IS THE WINNER ");
//                    reset();
                }

            }
        }
    }
}