package com.pepcus.appstudent.entity;

import com.opencsv.bean.CsvBindByName;

public class StudentUploadAttendance {

    @CsvBindByName
    private String id;
    @CsvBindByName
    private String day1;
    @CsvBindByName
    private String day2;
    @CsvBindByName
    private String day3;
    @CsvBindByName
    private String day4;
    @CsvBindByName
    private String day5;
    @CsvBindByName
    private String day6;
    @CsvBindByName
    private String day7;
    @CsvBindByName
    private String day8;
    @CsvBindByName
    private String today;

    @CsvBindByName(column = "Y/N")
    private String optIn2019;

    public String getDay8() {
        return day8;
    }

    public void setDay8(String day8) {
        this.day8 = day8;
    }

    public String getOptIn2019() {
        return optIn2019;
    }

    public void setOptIn2019(String optIn2019) {
        this.optIn2019 = optIn2019;
    }

    public StudentUploadAttendance() {
        super();
    }

    public StudentUploadAttendance(String id, String day1, String day2) {
        super();
        this.id = id;
        this.day1 = day1;
        this.day2 = day2;
    }

    public String getToday() {
        return today;
    }

    public void setToday(String today) {
        this.today = today;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDay1() {
        return day1;
    }

    public void setDay1(String day1) {
        this.day1 = day1;
    }

    public String getDay2() {
        return day2;
    }

    public void setDay2(String day2) {
        this.day2 = day2;
    }

    public String getDay3() {
        return day3;
    }

    public void setDay3(String day3) {
        this.day3 = day3;
    }

    public String getDay4() {
        return day4;
    }

    public void setDay4(String day4) {
        this.day4 = day4;
    }

    public String getDay5() {
        return day5;
    }

    public void setDay5(String day5) {
        this.day5 = day5;
    }

    public String getDay6() {
        return day6;
    }

    public void setDay6(String day6) {
        this.day6 = day6;
    }

    public String getDay7() {
        return day7;
    }

    public void setDay7(String day7) {
        this.day7 = day7;
    }

    @Override
    public String toString() {
        return "StudentUploadAttendance [id=" + id + ", day1=" + day1 + ", day2=" + day2 + ", day3=" + day3 + ", day4="
                + day4 + ", day5=" + day5 + ", day6=" + day6 + ", day7=" + day7 + "]";
    }

}
