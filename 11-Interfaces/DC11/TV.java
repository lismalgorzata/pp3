public class TV implements CanOnOff, CanChangeChannel {
    private boolean isOn = false;
    private int channelNo = 1;
    private int volume = 1;

    public void on() {
        setIsOn(true);
    }

    public void off() {
        setIsOn(false);
    }

    public void displayStatus() {
        if (getIsOn()) {
            System.out.println("TV is on: " + getIsOn());
            System.out.println("Channel: " + getChannelNo());
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


}
