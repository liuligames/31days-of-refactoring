package com.liuli.day14breakresponsibilities.problem;

import java.util.List;

public class Video {

    private double sum = 0;

    public void payFee(double fee) {

    }

    public void rentVideo(Video video, Customer customer) {
        List<Video> videos = customer.getVideos();
        videos.add(video);
        customer.setVideos(videos);
    }

    public double calculateBalance(Customer customer) {
        sum = 0;
        List<Double> lateFees = customer.getLateFees();
        lateFees.forEach(lateFee -> sum += lateFee);
        return sum;
    }
}
