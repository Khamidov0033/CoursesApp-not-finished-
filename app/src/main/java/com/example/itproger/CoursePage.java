package com.example.itproger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class CoursePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_page);
        LinearLayout linearBg = findViewById(R.id.linearBg);
        ImageView imageCoursePage = findViewById(R.id.coursePageImage);
        TextView titleText = findViewById(R.id.jobTitleCoursePahe);
        TextView lessonBeginCoursePage = findViewById(R.id.lessonsBeginCoursePage);
        TextView lessonLevelCoursePage = findViewById(R.id.lessonsLevelCoursePage);
        TextView descriptionCoursePage = findViewById(R.id.lessonDescriptionCoursePage);
        Button addToCartImageButton = findViewById(R.id.imageButtonCoursePage);

        imageCoursePage.setImageResource(getIntent().getIntExtra("imageId",0));
        lessonLevelCoursePage.setText(getIntent().getStringExtra("lessonLevel"));
        titleText.setText(getIntent().getStringExtra("jobTitle"));
        linearBg.setBackgroundColor(getIntent().getIntExtra("bgColor",0));
        lessonBeginCoursePage.setText(getIntent().getStringExtra("lessonBegin"));

    }
}