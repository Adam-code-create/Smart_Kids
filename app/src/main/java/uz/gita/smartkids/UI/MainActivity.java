package uz.gita.smartkids.UI;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import uz.gita.smartkids.MenuActivity;
import uz.gita.smartkids.R;
import uz.gita.smartkids.UserInterface;
import uz.gita.smartkids.data.QuestionData;
import uz.gita.smartkids.dialog.FinalDialog;
import uz.gita.smartkids.quiz_contract.QuizContract;
import uz.gita.smartkids.quiz_presenter.QuizPresenter;
import uz.gita.smartkids.quiz_reprository.QuizReprository;

public class MainActivity extends AppCompatActivity implements QuizContract.View {
    private int[] variantIds = {R.id.variant1, R.id.variant2, R.id.variant3, R.id.variant4};
    private TextView var[] = new TextView[variantIds.length];
    private ArrayList<ViewGroup> viewGroups = new ArrayList<>();
    private QuizContract.Presenter presenter;
    private FinalDialog dialog;
    private SharedPreferences preferences;
    private MediaPlayer mediaPlayer;
    private boolean isPlay = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadViews();
        preferences = this.getSharedPreferences("question", Context.MODE_PRIVATE);
        int pos = preferences.getInt("questionIndex",0);
        mediaPlayer = MediaPlayer.create(MainActivity.this, R.raw.apploud);
        presenter = new QuizPresenter(this, new QuizReprository());
    }
    private void loadViews() {

        for (int i = 0; i < variantIds.length; i++) {
            ViewGroup group = findViewById(variantIds[i]);
            viewGroups.add(group);
            var[i] = (TextView) viewGroups.get(i).getChildAt(2);
            updateSelection(i, false);
            viewGroups.get(i).setTag(i);
            int finalI = i;
            viewGroups.get(i).setOnClickListener(view -> {
                viewGroups.get(finalI).getTag();
                presenter.selectVariant(finalI);
            });
        }
      ImageView home = findViewById(R.id.home);
        //home.setVisibility(View.GONE);
         home.setOnClickListener(view -> {
           presenter.homeBtn();
       });



        findViewById(R.id.next).setOnClickListener(view -> {
            presenter.nextBtn();
        });
    }

    @Override
    public void setQuestion(QuestionData data) {

        TextView questionTextView = findViewById(R.id.question_text);
        questionTextView.setText(data.getQuestion());
        for (int i = 0; i < variantIds.length; i++) {
            var[i].setText(data.getVariantByIndex(i));
        }
    }
    @Override
    public void updateSelection(int index, boolean isChecked) {
        ViewGroup group = viewGroups.get(index);
        ImageView imageView = (ImageView) group.getChildAt(0);
        int img = (isChecked) ? R.drawable.ic_check : R.drawable.ic_baseline_radio_button_unchecked_24;
        imageView.setImageResource(img);

    }

    @Override
    public void showMessage(String text) {
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void finishTest(int correctAnswer, int wrongAnswer) {
        dialog = new FinalDialog(MainActivity.this, correctAnswer, wrongAnswer);
        dialog.setListener(new UserInterface() {
            @Override
            public void clickRestart() {
                Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                startActivity(intent);
                finish();
            }

            @Override
            public void clickNextLevel() {
                int pos = getQuestionGroup();
                Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                intent.putExtra("open",pos+10);
                startActivity(intent);
                finish();
            }
        });
        dialog.setCanceledOnTouchOutside(false);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.show();
        mediaPlayer.start();

    }

    @Override
    public int getQuestionGroup() {
        return  getIntent().getIntExtra("1", 0);
    }

    @Override
    public void home() {
        Intent intent = new Intent(MainActivity.this, MenuActivity.class);
        startActivity(intent);
        finish();
    }



    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(MainActivity.this, MenuActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mediaPlayer.pause();
    }
}