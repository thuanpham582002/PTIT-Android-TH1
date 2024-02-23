package com.example.javath1.model;

import java.util.ArrayList;
import java.util.List;

public class Job {
    private Gender gender;
    private String name;

    private String date;

    public Job(Gender gender, String name, String date) {
        this.gender = gender;
        this.name = name;
        this.date = date;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    static List<Job> mockJobs() {
        List<Job> jobs = new ArrayList<>();
        jobs.add(new Job(
                Gender.Female,
                "Dish washing",
                "2021-01-01"
        ));
        jobs.add(new Job(
                Gender.Male,
                "Sweeping",
                "2021-01-02")
        );
        jobs.add(new Job(
                Gender.Male,
                "Mopping",
                "2021-01-03")
        );
        jobs.add(new Job(
                Gender.Female,
                "Cooking",
                "2021-01-04")
        );
        return jobs;
    }
}