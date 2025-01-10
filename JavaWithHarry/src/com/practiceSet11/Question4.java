package com.practiceSet11;
interface TvRemote {
    void on();
    void mute();
    void increaseVolume();
    void decreaseVolume();
}
interface SmartTvRemote {
    void netflix();
    void youtubeMusic();
}
class SmartTv implements TvRemote,SmartTvRemote {

    @Override
    public void on() {
        System.out.println("On the Tv");
    }

    @Override
    public void mute() {
        System.out.println("Mute the volume");
    }

    @Override
    public void increaseVolume() {
        System.out.println("Increase the volume");
    }

    @Override
    public void decreaseVolume() {
        System.out.println("decrease the volume");
    }

    @Override
    public void netflix() {
        System.out.println("Open the netflix");
    }

    @Override
    public void youtubeMusic() {
        System.out.println("open the youtubeMusic");
    }
}
public class Question4 {
    public static void main(String[] args) {
        TvRemote obj = new SmartTv();
        obj.decreaseVolume();
        obj.increaseVolume();
        obj.on();
        obj.mute();
    }
}
