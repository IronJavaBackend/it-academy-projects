package videos;

import java.util.ArrayList;
import java.util.List;

public class Video {

  private String url;
  private String title;
  private List<String> tagsList = new ArrayList<String>();

  public Video(String url, String title) {
    this.url = url;
    this.title = title;
    this.tagsList = new ArrayList<String>();
  }

  public Video(String url, String title, List<String> tagsList) {
    this.url = url;
    this.title = title;
    this.tagsList = tagsList;
  }

  public String getUrl() {
    return url;
  }

  public String getTitle() {
    return title;
  }

  public List<String> getTagsList() {
    return tagsList;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setTag(String tag) {
    this.tagsList.add(tag);
  }

  @Override
  public String toString() {
    return "Video{" + "url='" + url + '\'' + ", title='" + title + '\'' + ", tagsList=" + tagsList + '}';
  }
}
