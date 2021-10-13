package uz.gita.smartkids.dialog;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.widget.AppCompatButton;

import uz.gita.smartkids.R;
import uz.gita.smartkids.UserInterface;

public class FinalDialog extends AlertDialog {
    private UserInterface listener;
    private int correctAnswer;
    private int wrongAnswer;

    public FinalDialog(Context context, int score, int wrongScore) {
        super(context);
        this.correctAnswer = score;
        this.wrongAnswer = wrongScore;
        View view= LayoutInflater.from(context).inflate(R.layout.result_dialog,null);
        setView(view);
    }
    public void setListener(UserInterface listener) {
        this.listener = listener;
    }

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppCompatButton restart = findViewById(R.id.again);
        AppCompatButton nextLevel = findViewById(R.id.nextLevel);
        TextView correctAns = findViewById(R.id.testResult);
        TextView topText = findViewById(R.id.topText);
        TextView wrongAns = findViewById(R.id.wrongResult);




        if (correctAnswer >= 8) {
            nextLevel.setVisibility(View.VISIBLE);
            restart.setVisibility(View.INVISIBLE);
            topText.setText("Congratulations");
        } else {
            nextLevel.setVisibility(View.INVISIBLE);
            restart.setVisibility(View.VISIBLE);
            topText.setText("Try again");
        }
        correctAns.setText(String.valueOf(correctAnswer));
        wrongAns.setText(String.valueOf(wrongAnswer));



        restart.setOnClickListener(view ->{
            listener.clickRestart();
        });

        nextLevel.setOnClickListener(view -> {
            listener.clickNextLevel();
        });





    }
}
