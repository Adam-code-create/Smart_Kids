package uz.gita.smartkids;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import uz.gita.smartkids.UI.MainActivity;

public class MenuActivity extends AppCompatActivity {
    private TextView section1;
    private TextView section2;
    private TextView section3;
    private TextView section4;
    private TextView section5;
    private TextView section6;
    private TextView section7;
    private TextView section8;
    private TextView section9;

    private ImageView lock2;
    private ImageView lock3;
    private ImageView lock4;
    private ImageView lock5;
    private ImageView lock6;
    private ImageView lock7;
    private ImageView lock8;
    private ImageView lock9;
    private SharedPreferences preferences;
    private boolean isOpen2;
    private boolean isOpen3;
    private boolean isOpen4;
    private boolean isOpen5;
    private boolean isOpen6;
    private boolean isOpen7;
    private boolean isOpen8;
    private boolean isOpen9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        loadViews();

        preferences = this.getSharedPreferences("puzzle", Context.MODE_PRIVATE);
        isOpen2 = preferences.getBoolean("isOpen2", false);
        isOpen3 = preferences.getBoolean("isOpen3", false);
        isOpen4 = preferences.getBoolean("isOpen4", false);
        isOpen5 = preferences.getBoolean("isOpen5", false);
        isOpen6 = preferences.getBoolean("isOpen6", false);
        isOpen7 = preferences.getBoolean("isOpen7", false);
        isOpen8 = preferences.getBoolean("isOpen8", false);
        isOpen9 = preferences.getBoolean("isOpen9", false);
        loadViewToShow();


    }

    private void loadViews(){
        section1 = findViewById(R.id.section1);
        section2 = findViewById(R.id.section2);
        section3 = findViewById(R.id.section3);
        section4 = findViewById(R.id.section4);
        section5 = findViewById(R.id.section5);
        section6 = findViewById(R.id.section6);
        section7 = findViewById(R.id.section7);
        section8 = findViewById(R.id.section8);
        section9 = findViewById(R.id.section9);
        lock2 = findViewById(R.id.lock2);
        lock3 = findViewById(R.id.lock3);
        lock4 = findViewById(R.id.lock4);
        lock5 = findViewById(R.id.lock5);
        lock6 = findViewById(R.id.lock6);
        lock7 = findViewById(R.id.lock7);
        lock8 = findViewById(R.id.lock8);
        lock9 = findViewById(R.id.lock9);


    }
    private void loadViewToShow(){
        goneLock();
        section1.setOnClickListener(view -> {
            Intent intent = new Intent(MenuActivity.this, MainActivity.class);
            intent.putExtra("1", 0);
            startActivity(intent);
            finish();

        });
        int open2 = getIntent().getIntExtra("open", 0);
        if (open2 == 10){
            lock2.setVisibility(View.GONE);
            section2.setText("2");
            section2.setBackgroundResource(R.drawable.menu_item_bg);
            preferences.edit().putBoolean("isOpen2", true).apply();
            section2.setOnClickListener(view -> {
                Intent intent = new Intent(MenuActivity.this, MainActivity.class);
                intent.putExtra("1", 10);
                startActivity(intent);
                finish();

            });
        } else if (isOpen2) {
            section2.setOnClickListener(view -> {
                Intent intent = new Intent(MenuActivity.this, MainActivity.class);
                intent.putExtra("1", 10);
                startActivity(intent);
                finish();
            });
        }


        int open3 = getIntent().getIntExtra("open", 0);
        if (open3 == 20){
            lock3.setVisibility(View.GONE);
            section3.setText("3");
            section3.setBackgroundResource(R.drawable.menu_item_bg);
            preferences.edit().putBoolean("isOpen3", true).apply();
            section3.setOnClickListener(view -> {
                Intent intent = new Intent(MenuActivity.this, MainActivity.class);
                intent.putExtra("1", 20);
                startActivity(intent);
                finish();
            });
        } else if (isOpen3) {
            section3.setOnClickListener(view -> {
                Intent intent = new Intent(MenuActivity.this, MainActivity.class);
                intent.putExtra("1", 20);
                startActivity(intent);
                finish();
            });
        }


        int open4 = getIntent().getIntExtra("open", 0);
        if (open4 == 30){
            lock4.setVisibility(View.GONE);
            section4.setText("4");
            section4.setBackgroundResource(R.drawable.menu_item_bg);
            preferences.edit().putBoolean("isOpen4", true).apply();
            section4.setOnClickListener(view -> {
                Intent intent = new Intent(MenuActivity.this, MainActivity.class);
                intent.putExtra("1", 30);
                startActivity(intent);
                finish();
            });
        } else if (isOpen4) {
            section4.setOnClickListener(view -> {
                Intent intent = new Intent(MenuActivity.this, MainActivity.class);
                intent.putExtra("1", 30);
                startActivity(intent);
                finish();
            });
        }



        int open5 = getIntent().getIntExtra("open", 0);
        if (open5 == 40){
            lock5.setVisibility(View.GONE);
            section5.setText("5");
            section5.setBackgroundResource(R.drawable.menu_item_bg);
            preferences.edit().putBoolean("isOpen5", true).apply();
            section5.setOnClickListener(view -> {
                Intent intent = new Intent(MenuActivity.this, MainActivity.class);
                intent.putExtra("1", 40);
                startActivity(intent);
                finish();
            });
        } else if (isOpen5) {
            section5.setOnClickListener(view -> {
                Intent intent = new Intent(MenuActivity.this, MainActivity.class);
                intent.putExtra("1", 40);
                startActivity(intent);
                finish();
            });
        }


        int open6 = getIntent().getIntExtra("open", 0);
        if (open6 == 50){
            lock6.setVisibility(View.GONE);
            section6.setText("6");
            section6.setBackgroundResource(R.drawable.menu_item_bg);
            preferences.edit().putBoolean("isOpen6", true).apply();
            section6.setOnClickListener(view -> {
                Intent intent = new Intent(MenuActivity.this, MainActivity.class);
                intent.putExtra("1", 50);
                startActivity(intent);
                finish();
            });
        } else if (isOpen6) {
            section6.setOnClickListener(view -> {
                Intent intent = new Intent(MenuActivity.this, MainActivity.class);
                intent.putExtra("1", 50);
                startActivity(intent);
                finish();
            });
        }


        int open7 = getIntent().getIntExtra("open", 0);
        if (open7 == 60){
           lock7.setVisibility(View.GONE);
            section7.setText("7");
            section7.setBackgroundResource(R.drawable.menu_item_bg);
            preferences.edit().putBoolean("isOpen7", true).apply();
            section7.setOnClickListener(view -> {
                Intent intent = new Intent(MenuActivity.this, MainActivity.class);
                intent.putExtra("1", 60);
                startActivity(intent);
                finish();
            });
        } else if (isOpen7) {
            section7.setOnClickListener(view -> {
                Intent intent = new Intent(MenuActivity.this, MainActivity.class);
                intent.putExtra("1", 60);
                startActivity(intent);
                finish();
            });
        }


        int open8 = getIntent().getIntExtra("open", 0);
        if (open8 == 70){
            lock8.setVisibility(View.GONE);
            section8.setText("8");
            section8.setBackgroundResource(R.drawable.menu_item_bg);
            preferences.edit().putBoolean("isOpen8", true).apply();
            section8.setOnClickListener(view -> {
                Intent intent = new Intent(MenuActivity.this, MainActivity.class);
                intent.putExtra("1", 70);
                startActivity(intent);
                finish();
            });
        } else if (isOpen8) {
            section8.setOnClickListener(view -> {
                Intent intent = new Intent(MenuActivity.this, MainActivity.class);
                intent.putExtra("1", 70);
                startActivity(intent);
                finish();
            });
        }


        int open9 = getIntent().getIntExtra("open", 0);
        if (open9 == 5){
            lock9.setVisibility(View.GONE);
            section9.setText("9");
            section9.setBackgroundResource(R.drawable.menu_item_bg);
            preferences.edit().putBoolean("isOpen9", true).apply();
            section9.setOnClickListener(view -> {
                Intent intent = new Intent(MenuActivity.this, MainActivity.class);
                intent.putExtra("1", 80);
                startActivity(intent);
                finish();
            });
        } else if (isOpen9) {

            section9.setOnClickListener(view -> {
                Intent intent = new Intent(MenuActivity.this, MainActivity.class);
                intent.putExtra("1", 80);
                startActivity(intent);
                finish();
            });
        }


    }

    
    private void goneLock(){
        if (isOpen2){
            lock2.setVisibility(View.GONE);
            section2.setText("2");
            section2.setBackgroundResource(R.drawable.menu_item_bg);
        }
        if (isOpen3){
            lock3.setVisibility(View.GONE);
            section3.setText("3");
            section3.setBackgroundResource(R.drawable.menu_item_bg);
        }
        if (isOpen4){
            lock4.setVisibility(View.GONE);
            section4.setText("4");
            section4.setBackgroundResource(R.drawable.menu_item_bg);
        }
        if (isOpen5){
            lock5.setVisibility(View.GONE);
            section5.setText("5");
            section5.setBackgroundResource(R.drawable.menu_item_bg);
        }
        if (isOpen6){
            lock6.setVisibility(View.GONE);
            section6.setText("6");
            section6.setBackgroundResource(R.drawable.menu_item_bg);
        }
        if (isOpen7){
            lock7.setVisibility(View.GONE);
            section7.setText("7");
            section7.setBackgroundResource(R.drawable.menu_item_bg);
        }
        if (isOpen8){
            lock8.setVisibility(View.GONE);
            section8.setText("8");
            section8.setBackgroundResource(R.drawable.menu_item_bg);
        }
        if (isOpen9){
            lock9.setVisibility(View.GONE);
            section9.setText("9");
            section9.setBackgroundResource(R.drawable.menu_item_bg);
        }
    }

}