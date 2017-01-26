package org.usfirst.frc.team5426.robot;

import org.usfirst.frc.team5426.robot.commands.Brake;
import org.usfirst.frc.team5426.robot.commands.CommandBase;
import org.usfirst.frc.team5426.robot.commands.Drive;

import edu.wpi.first.wpilibj.GenericHID.RumbleType;
import utils.XboxJoystick;

public class OI {

    public static XboxJoystick stick;

    public OI() {
    	
    	// Example of button usage
    	//stick.button_A.whileActive(new Drive());
    	
    	// Brake control
    	if (stick.getLeftTrigger() >= 0.9 || stick.getRightTrigger() >= 0.9) {
    		
    		new Brake();
    	}
    	
    	else if (stick.getLeftTrigger() < 0.9 || stick.getRightTrigger() < 0.9 || Brake.braked) {
    		
    		Brake.braked = false;
    		
    		CommandBase.drive.getLeftTalon().enableBrakeMode(false);
    		CommandBase.drive.getRightTalon().enableBrakeMode(false);
    	}
    }

    public static void init() {

        stick = new XboxJoystick(0);
    }
}
