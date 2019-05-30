package com.liuli.day14breakresponsibilities.solution;

import java.util.List;

public class Video {

    public void rentVideo(Video video, Customer customer) {
        List<Video> videos = customer.getVideos();
        videos.add(video);
        customer.setVideos(videos);
    }

}
