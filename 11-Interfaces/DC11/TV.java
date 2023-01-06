import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TV implements CanOnOff, CanChangeChannel {
    private boolean isOn = false;
    private int channelNo = 1;
    private int volume = 1;
    private String programs [] = new String[99];

    public void on() {
        setIsOn(true);
    }

    public void off() {
        setIsOn(false);
    }

    public void displayStatus() {
        if (getIsOn()) {
            System.out.println("TV is on: " + getIsOn());
            System.out.println("Channel: " + getChannelNo() + " | " + getChannelName(getChannelNo()));
            System.out.println("Volume: " + getVolume());
        } else {
            System.out.println("TV off");
        }

    }

    public boolean getIsOn() {
        return isOn;
    }

    public void setIsOn(boolean isOn) {
        this.isOn = isOn;
    }

    public int getChannelNo() {
        return channelNo;
    }

    public void setChannelNo(int channelNo) {
        this.channelNo = channelNo;
    }

    public void channelUp() {
        if (getIsOn()) {
           this.channelNo ++;
        }
    }

    public void channelDown() {
        if (getIsOn()) {
            this.channelNo --;
         }
    }

    public void setChannel(int channelNo){
        if (getIsOn()) {
            if (channelNo >= 1 && channelNo <= 99) {
                this.channelNo = channelNo;
            }
        }

    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void volumeUp() {
        if (getIsOn()) {
            if (volume >=1 && volume <=10) {
                volume ++ ;
            }
        }
    }

    public void volumeDown() {
        if (getIsOn()) {
            if (volume >=1 && volume <=10) {
                volume -- ;
            }
        }
    }



    public void displayPrograms() {
        programs[0] = "TVP";
        programs[1] = "TV1";
        programs[2] = "TV2";
        programs[3] = "TV3";
        programs[4] = "TV4";
        programs[5] = "TV5";
        programs[6] = "TV6";
        programs[7] = "TV7";
        programs[8] = "TV8";
        programs[9] = "TV9";
        programs[10] = "TV10";

        if(getIsOn()) {
            System.out.println("Programs: ");
                for (String program : programs) {
                    if (program != null) {
                        System.out.print(program + " ");
                    }
                }
            System.out.println();
        }
    }

    public String getChannelName(int n) {
        return programs[n];
    }
}
