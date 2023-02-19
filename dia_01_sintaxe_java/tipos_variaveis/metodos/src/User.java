public class User {
    public static void main(String[] args) throws Exception {
        AppSmartTv appSmartTv = new AppSmartTv();

        System.out.println("Televison's on? " + appSmartTv.on);
        System.out.println("Channel " + appSmartTv.channel);
        System.out.println("Volume " + appSmartTv.volume);

        appSmartTv.turnOn();

        System.out.println("Televison's on? " + appSmartTv.on);

    }
}
