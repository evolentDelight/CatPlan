package cse120project.catplan;

/**
This class is used to set the name of the courses and the ID of
 course to place on a list of favorites
 */

public class Courses {

    enum Day{
        M, T, W, R, F, S
    }

    enum Type{
        Lec, Disc, Lab
    }

    enum Subj{
        ANTH, BEST, BIOE, BIO, CHEM, CHN, COGS, CRS, CSE, CORE, CRES,
        ECON, EECS, ENGR, ENG, ENVE, ES, ESS, FRE, GASP, HIST,
        IH, JPN, MATH, ME, MGMT, MSE, NSED, NSUS, PH, PHIL, PHYS, POLI,
        PSY, QSB, SOC, SPAN, WH, WRI
    }


    String CourseName;
    int CourseCRN;
    int AmountOfUnits;

    String Days;
    String Hours;

    Subj CourseSubj;
    Type CourseType;
    Day FinalDay;

    Courses(String Name, int CRN, int units, String days, String hours){
        CourseName = Name;
        CourseCRN = CRN;
        AmountOfUnits = units;
        Days = days;
        Hours = hours;

    }

    String getCourseName(){
        return CourseName;
    }

    int getCourseCRN(){
        return CourseCRN;
    }

    String getDays(){
        return Days;
    }

    String getHours(){
        return Hours;
    }

    void removeinfo(){
        CourseName = null;
        CourseCRN = (Integer) null;
        AmountOfUnits = (Integer) null;

    }
