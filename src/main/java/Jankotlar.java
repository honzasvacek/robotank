import dev.robocode.tankroyale.botapi.*;
import dev.robocode.tankroyale.botapi.events.*;

public class Jankotlar extends Bot {
    public Jankotlar() {
        super(BotInfo.fromFile("Jankotlar.json"));
    }

    @Override
    public void run() {
        double getArenaWidth = getArenaWidth();
        double getArenaHeight = getArenaHeight();
        while (isRunning()) {
            setRescan();
        }
    }

    @Override
    public void onScannedBot(ScannedBotEvent e) {
        setFireAssist(true);
        fire(2.5);
    }

    public void onHitByBullet(HitByBulletEvent hitByBulletEvent) {

    }

    public void onHitWall(HitWallEvent botHitWallEvent) {
        turnLeft(180);
    }


    public static void main(String[] args) {
        new Jankotlar().start();
    }
}

