package videos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    User helena = new User("Helena","Piaggio", "secret", (new Date()));

    // Create a video
    Video videoOne = new Video("http://allvideos/videoOne.com","oneVideo");
    videoOne.setTag("comedy");
    videoOne.setTag("drama");
    videoOne.setTag("all");

    Video videoTwo = new Video("http://allvideos/videoTwo.com","twoVideo");
    videoTwo.setTag("comedy");
    videoTwo.setTag("musical");
    videoTwo.setTag("all");

    helena.setVideo(videoOne);
    helena.setVideo(videoTwo);

    // show my videos
    List<Video> myVideos = helena.getVideoList();

    for(Video video: myVideos){
      System.out.println(video);
    }

  }
}
