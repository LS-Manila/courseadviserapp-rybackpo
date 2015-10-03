package com.example.rybackpo.courseadviser;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private CourseList courselist = new CourseList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void FindDisplayCourses(View view){
        Spinner termlist = (Spinner) findViewById(R.id.spinner_terms);

        TextView viewcourses = (TextView) findViewById(R.id.displaycourses);

        String termselected = String.valueOf(termlist.getSelectedItem());

        List<String> ListofCourses = courselist.getCourses(termselected);

        StringBuilder FormatCourse = new StringBuilder();

        for (String course: ListofCourses)
            FormatCourse.append(course).append('\n');

        viewcourses.setText(FormatCourse);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
