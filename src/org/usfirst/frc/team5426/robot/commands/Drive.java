package org.usfirst.frc.team5426.robot.commands;

import org.usfirst.frc.team5426.robot.OI;

import edu.wpi.first.wpilibj.Timer;

public class Drive extends CommandBase {

	public Drive() {

		requires(drive);
	}

	protected void initialize() {

	}

	protected void execute() {

		if (!(OI.stick.getLeftTrigger() >= 0.9) & (!(OI.stick.getRightTrigger() >= 0.9))) {
			
			drive.drive(OI.stick.getLeftAxisY(), OI.stick.getLeftAxisY());

			if (ultra.getDistance() <= 20)
				OI.stick.rumble(10, 10);

			Timer.delay(0.005);
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
