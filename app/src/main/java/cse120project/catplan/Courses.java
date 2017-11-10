package cse120project.catplan;

/**
This class is used to set the name of the courses and the ID of
 course to place on a list of favorites
 */

protected class Courses {

    enum Day{
        M, T, W, R, F, S
    }

    enum Type{
        Lec, Disc, Lab
    }

    enum Subj{
        ANTH, BEST, BIOE, BIO, CHEM, CHN, COGS, CRS, CSE, CORE, CRES,
        ESS, ECON, EECS, ENGR, ENG, ENVE, ES, ESS, FRE, GASP, HIST,
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

    Courses(){

    }

    void static setCourseName(string name){
        CourseName = name;
    }

    void static setCourseCRN(int CRN){
        CourseID = CRN;
    }

    void static setCourseUnits(int units){
        AmountofUnits = units;
    }

    void static setDays(string days){
        Days = days;
    }

    void static setHours(string hours){
        Hours = hours;
    }

    String static getCourseName(){
        return CourseName;
    }

    int static getCourseCRN(){
        return CourseCRN;
    }

    String static getDays(){
        return Days;
    }

    String static getHours(){
        return Hours;
    }

    void static removeinfo(){
        CourseName = null;
        CourseCRN = null;
        AmountOFUnits = null;

    }

}
