# CourseAdviser Assignment (Spinner and Button Demo)
courseadviserapp-rybackpo created by Classroom for GitHub

This assignment illustrates the usage of a Spinner widget and a simple Button.

## Problem:

Design and implement an Android application that gives suggestions to a 1st / 2nd year regular student about the available courses for him/her to take.

## Data Structure:
```Java
List<String> courselist = new ArrayList<String>();

        if(selectedterm.equals("1st Term")){
            courselist.add("PERSEF1");
            courselist.add("LASARE1");
            courselist.add("FITWELL");
            courselist.add("ENGALG1");
            courselist.add("ENGTRIG");
            courselist.add("ENGLCOM");
            courselist.add("FILKOMU");
            courselist.add("SOCTEC1");
        }
        else if(selectedterm.equals("2nd Term")){
            courselist.add("NSTP-R1/C1");
            courselist.add("FTSPORT");
            courselist.add("ANAGEOM");
            courselist.add("SOLIMEN");
            courselist.add("DIFFCAL");
            courselist.add("ENGLRES");
            courselist.add("FILDLAR");
            courselist.add("TREDONE");
            courselist.add("GRAPONE");
        }
        else if(selectedterm.equals("3rd Term")){
            courselist.add("NSTP-R2/C2");
            courselist.add("FTDANCE");
            courselist.add("INTECAL");
            courselist.add("ENGALG2");
            courselist.add("SPEECOM");
            courselist.add("CHEMONE");
            courselist.add("LBYCH11");
            courselist.add("LBYMEEA");
            courselist.add("ENGPHY1");
            courselist.add("LBYPH11");
        }
        else if(selectedterm.equals("4th Term")){
            courselist.add("ENGIANA");
            courselist.add("ENGPHY2");
            courselist.add("LBYPH12");
            courselist.add("ENVIRON");
            courselist.add("ENGSAFE");
            courselist.add("LBYEC71");
            courselist.add("KASPIL1");
            courselist.add("STATICS");
            courselist.add("FTTEAMS");
            courselist.add("LASARE2");
        }
        else if(selectedterm.equals("5th Term")){
            courselist.add("TREDTWO");
            courselist.add("PRBSTAT");
            courselist.add("ENTHERM");
            courselist.add("BASICEE");
            courselist.add("LBYEC1A");
            courselist.add("DISMATH");
            courselist.add("DYNAMIC");
            courselist.add("LBYCP3D");
            courselist.add("LBYEC72");
        }
        else if(selectedterm.equals("6th Term")){
            courselist.add("COMMATH");
            courselist.add("LBYCP27");
            courselist.add("ADVDEE1");
            courselist.add("LBYCP1A");
            courselist.add("ELEMECE");
            courselist.add("LBYEC1B");
            courselist.add("ECONENG");
            courselist.add("DATASAL");
            courselist.add("LBYCP12");
        }
        return courselist;
```

## Sample Solution:

https://github.com/DeLaSalleUniversity-Manila/courseadviserapp-rybackpo

## Keypoints:

In the MainActivity.java:

```Java
public void onClickFindCourse(View view){
        //Get a reference to the Spinner
        Spinner termlist = (Spinner) findViewById(R.id.spinner_terms);

        //Get a reference to the TextView
         TextView viewcourses = (TextView) findViewById(R.id.displaycourses);

        //Get the selected item in the Spinner
        String termselected = String.valueOf(termlist.getSelectedItem());

        //Get list of courses in the other activity
        List<String> ListofCourses = courselist.getCourses(termselected);

        //StringBuilder to format the list
        StringBuilder FormatCourse = new StringBuilder();

        for (String course: ListofCourses)
            FormatCourse.append(course).append('\n');
        
        //Display the courses in the text
        viewcourses.setText(FormatCourse);

    }
```

In the 'strings.xml' for Array

```xml
<string-array name="Terms">
        <item>1st Term</item>
        <item>2nd Term</item>
        <item>3rd Term</item>
        <item>4th Term</item>
        <item>5th Term</item>
        <item>6th Term</item>
    </string-array>
```

In the layout xml file for Spinner widget

```xml
<Spinner
        android:id="@+id/spinner_terms"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:entries="@array/Terms"
        android:layout_below="@id/textView"
        android:layout_marginTop="15dp"
        android:layout_centerHorizontal="true" />
```

In the layout xml file for Button widget

```xml
<Button
        android:id="@+id/buttondisplaycourses"
        android:onClick="FindDisplayCourses"
        android:text="@string/course_taken"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_below="@id/spinner_terms"
        android:layout_marginTop="15dp"
        android:layout_centerHorizontal="true" />
```

## Screenshots:

![alt tag](https://github.com/DeLaSalleUniversity-Manila/CourseAdviser/blob/master/device-2015-09-26-215349.png)

![alt tag](https://github.com/DeLaSalleUniversity-Manila/CourseAdviser/blob/master/device-2015-09-26-215432.png)

![alt tag](https://github.com/DeLaSalleUniversity-Manila/CourseAdviser/blob/master/device-2015-09-26-215506.png)
