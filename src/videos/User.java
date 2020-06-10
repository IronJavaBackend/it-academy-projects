package videos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class User {

  private String name;
  private String surname;
  private String password;
  private Date registrationDate;
  private List<Video> videoList = new ArrayList<Video>();

  public User(String name, String surname, String password, Date registrationDate) {
    this.name = name;
    this.surname = surname;
    this.password = password;
    this.registrationDate = registrationDate;
  }

  public String getName() {
    return name;
  }

  public String getSurname() {
    return surname;
  }

  public String getPassword() {
    return password;
  }

  public Date getRegistrationDate() {
    return registrationDate;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public void setRegistrationDate(Date registrationDate) {
    this.registrationDate = registrationDate;
  }

  public List<Video> getVideoList() {
    return videoList;
  }

  public void setVideo(Video theVideo) {
    this.videoList.add(theVideo);
  }

  @Override
  public String toString() {
    return "User{" +
            "\nname='" + name + '\'' +
            "\nsurname='" + surname + '\'' +
            "\npassword='" + password + '\'' +
            "\nregistrationDate=" + registrationDate +
            "\nvideoList=" + videoList +
            '}';
  }
}
