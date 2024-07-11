package Interface;

interface TVRemote {
    void powerOn();
    void powerOff();
}

interface SmartTVRemote extends TVRemote {
    void connectToInternet();
    void openStreamingApp();
}

class TV implements SmartTVRemote {
    @Override
    public void powerOn() {
        System.out.println("TV is powering on...");
    }

    @Override
    public void powerOff() {
        System.out.println("TV is powering off...");
    }

    @Override
    public void connectToInternet() {
        System.out.println("TV is connecting to the internet...");
    }

    @Override
    public void openStreamingApp() {
        System.out.println("Opening streaming app:Netflix " );
    }
}
public class Interfaceprgm3 {

	public static void main(String[] args) {
		
		TV myTV = new TV();

        myTV.powerOn();
        myTV.connectToInternet();
        myTV.openStreamingApp();
        myTV.powerOff();
		
	}

}
