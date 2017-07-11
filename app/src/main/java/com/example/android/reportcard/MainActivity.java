package com.example.android.reportcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public double maths = 10.0;
    public double history = 5.5;
    public double chemistry = 6.8;
    public double physics = 9.5;
    public double literature = 8.9;
    public double latin = 7.0;
    public double finalGrade;

    public double test1;
    public double test2;
    public double test3;
    public double test4;
    public double test5;
    public double test6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ReportCard reportCard = new ReportCard(maths, history, chemistry, physics, literature, latin);

        TextView maths_text = (TextView) findViewById(R.id.maths_TextView);
        TextView history_text = (TextView) findViewById(R.id.history_TextView);
        TextView chemistry_text = (TextView) findViewById(R.id.chemistry_TextView);
        TextView physics_text = (TextView) findViewById(R.id.physics_TextView);
        TextView literature_text = (TextView) findViewById(R.id.literature_TextView);
        TextView latin_text = (TextView) findViewById(R.id.latin_TextView);
        TextView final_text = (TextView) findViewById(R.id.finalGrade_TextView);
        TextView allgrades_text = (TextView) findViewById(R.id.allGrades_TextView);

        test1 = reportCard.getmMathsGrade();
        test2 = reportCard.getmHistoryGrade();
        test3 = reportCard.getmChemistryGrade();
        test4 = reportCard.getmPhysicsGrade();
        test5 = reportCard.getmLiteratureGrade();
        test6 = reportCard.getmLatinGrade();

        reportCard.setmLatinGrade(9.1);
        test6 = reportCard.getmLatinGrade();

        finalGrade = reportCard.getmFinalGrade();

        maths_text.setText(String.valueOf(test1));
        history_text.setText(String.valueOf(test2));
        chemistry_text.setText(String.valueOf(test3));
        physics_text.setText(String.valueOf(test4));
        literature_text.setText(String.valueOf(test5));
        latin_text.setText(String.valueOf(test6));

        final_text.setText(String.valueOf(finalGrade));

        allgrades_text.setText(reportCard.toString());
    }
}
