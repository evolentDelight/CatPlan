package com.example.matri.catplan;

/**
 * Created by Rolly-kun on 11/4/2017.
 */

public class CourseAbstract {
    String CourseName;
    int CourseNumber;
    int CRN;

    public String setCourseName(String courseName){
        return this.CourseName = courseName;
    }

    public int setCourseNumber(int courseNum){
        return this.CourseNumber = courseNum;
    }

    public int setCRN(int CourseRegistrationNum){
        return this.CRN = CourseRegistrationNum;
    }

    public String getCourseName(){
        return this.CourseName;
    }

    public int getCourseNumber(){
        return this.CourseNumber;
    }

    public int getCRN(){
        return this.CRN;
    }



}
