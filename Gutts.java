package berserkerbot;
import robocode.*;
import static robocode.util.Utils.normalRelativeAngleDegrees;

/**
 * Gutts - a class by (Rafael)
 */

public class Gutts extends Robot {
	double angDeGiroScan;
	double angDeGiroRobo;

	public void run() {
		// Mantem gun parada ao girar o robo
		setAdjustGunForRobotTurn(true);
		angDeGiroScan = 10;

		// Scan inimigos sem parar
		while (true) {
			turnGunRight(angDeGiroScan);
		}
	}

	public void onScannedRobot(ScannedRobotEvent e){
		// Atira ao encontrar um inimigo
		fire(1);
		
		// Gira em direcao ao inimigo
		angDeGiroRobo = normalRelativeAngleDegrees(e.getBearing());
		turnRight(angDeGiroRobo);
		
		// Se aproxima o maximo possivel do inimigo
		ahead(e.getDistance());

		scan();
	}
}