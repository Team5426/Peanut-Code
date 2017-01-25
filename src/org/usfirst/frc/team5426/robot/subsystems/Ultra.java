package org.usfirst.frc.team5426.robot.subsystems;

import edu.wpi.first.wpilibj.Ultrasonic;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Ultra extends Subsystem {
	
	private Ultrasonic ultrasonic;
	
	public Ultra(int pc, int ec) {
		
		ultrasonic = new Ultrasonic(pc, ec);
	}

	@Override
	protected void initDefaultCommand() {
		
	}
	
	public double getDistance() {
		
		return ultrasonic.getRangeInches();
	}
	
	public Ultrasonic getUltrasonic() {
		
		return ultrasonic;
	}
}
