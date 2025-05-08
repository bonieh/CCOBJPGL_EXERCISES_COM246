class Monitor {
    public void connect(VGA connector) {
        System.out.println("Monitor is expecting a VGA connection");
        connector.connectWithVGA();
        System.out.println("Connected.");
    }
}