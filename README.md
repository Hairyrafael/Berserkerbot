Quando ele detecta um robô como ele se move em direção a esse robô
		// Gira em direcao ao inimigo
		angDeGiroRobo = normalRelativeAngleDegrees(e.getBearing());
		turnRight(angDeGiroRobo);
		
		// Se aproxima o maximo possivel do inimigo
		ahead(e.getDistance());

		scan();

  
Em que situação ele atira quando acha um robo
	public void onScannedRobot(ScannedRobotEvent e){
		// Atira ao encontrar um inimigo
		fire(1);


Qual o poder de fogo de acordo com a distancia do outro robô
fire(1);


Qual a cor do robô
Azul
