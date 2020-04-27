import java.util.ArrayList;
//Subject.java
interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}


//Channel.java
class Channel implements Subject {
    private ArrayList<Observer> observers = new ArrayList<Observer>();
    private String channelName;
    private String status;

    public Channel(String channelName, String status) {
        //observers = new ArrayList<Observer>();
        this.channelName = channelName;
        this.status = status;
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {

    }

    public void notifyObserver() {
        for(Observer obs: observers) {
            obs.update(this.status);
        }
    }
    public String getChannelName() {
        return this.channelName;
    }
    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }
    public String getStatus() {
        return this.status;
    }
    public void setStatus(String status) {
        this.status = status;
        notifyObserver();
    }

}


//Observer.java
interface Observer {
    public void update(String status);
}

//Follower.java
class Follower implements Observer {
    private String followerName;

    public void setFollowerName(String followerName) {
        this.followerName = followerName;
    }
    public String getFollowerName() {
        return this.followerName;
    }
    public void update(String status) {
        //update followers on live Channel content
    }
    public void play() {
        //play content
    }
}

public class Main {
}


