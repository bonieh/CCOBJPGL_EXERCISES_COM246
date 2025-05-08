public class App {
    public static void main(String[] args) {
    
        HDMI oldConnector = new HDMI();

        VGA adapter = new VGAtoHDMI(oldConnector);
  
        Monitor monitor = new Monitor();
        monitor.connect(adapter);
    }
}