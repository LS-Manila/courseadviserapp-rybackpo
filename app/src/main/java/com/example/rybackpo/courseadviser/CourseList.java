package com.example.rybackpo.courseadviser;

import java.util.ArrayList;
import java.util.List;

public class CourseList{

    List<String> getCourses(String selectedterm){

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
    }
}
