package hbcu.stay.ready.directoryweb.domain;

public class DirectoryMsg {
    private String firstName;
    private String nickName;
    private Integer age;
    private String favoriteTvShow;
    private String favoriteBand;

    public DirectoryMsg(String firstName, String nickName, Integer age, String favoriteTvShow, String favoriteBand){
        this.firstName = firstName;
        this.nickName = nickName;
        this.age = age;
        this.favoriteTvShow = favoriteTvShow;
        this.favoriteBand = favoriteBand;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getFavoriteTvShow() {
        return favoriteTvShow;
    }

    public void setFavoriteTvShow(String favoriteTvShow) {
        this.favoriteTvShow = favoriteTvShow;
    }

    public String getFavoriteBand() {
        return favoriteBand;
    }

    public void setFavoriteBand(String favoriteBand) {
        this.favoriteBand = favoriteBand;
    }
}
