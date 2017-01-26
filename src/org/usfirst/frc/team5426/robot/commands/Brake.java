package org.usfirst.frc.team5426.robot.commands;

public class Brake extends CommandBase {

	public static boolean braked;

	public Brake() {

		requires(drive);

		braked = false;
	}

	protected void initialize() {
		
	}

	protected void execute() {

		if (!braked) {
			
			drive.getLeftTalon().enableBrakeMode(true);
			drive.getRightTalon().enableBrakeMode(true);
			
			braked = true;
		}
	}

	protected boolean isFinished() {

		return false;
	}

	protected void end() {

	}

	protected void interrupted() {

	}

}
