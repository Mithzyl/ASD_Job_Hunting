package com.group8;

import Job.Review;
import JobSeeker.JobSeeker;
import Payment.Invoice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class App 
{
    public static void main(String[] args) {

        System.out.println("Welcome to job hunting service!");
        List<JobSeeker> jobSeekers = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            JobSeeker jobSeeker = new JobSeeker(true,40,true, Arrays.asList("software developer"),40);
            jobSeekers.add(jobSeeker);
        }
    }}
