package org.usfirst.frc.team5426.robot.subsystems;

import org.usfirst.frc.team5426.robot.commands.Drive;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * Created by Duncan on 1/24/2017.
 */
public class DriveTrain extends Subsystem {
	
	private CANTalon TALON_RIGHT;
    private CANTalon TALON_LEFT;

    private RobotDrive drive;

    public DriveTrain() {
    	
    	TALON_RIGHT = new CANTalon(0);
    	TALON_LEFT = new CANTalon(1);

        drive = new RobotDrive(TALON_LEFT, TALON_RIGHT);
    }
    
    public CANTalon getRightTalon() {
    	
    	return TALON_RIGHT;
    }
    
    public CANTalon getLeftTalon() {
    	
    	return TALON_LEFT;
    }

    @Override
    protected void initDefaultCommand() {

        this.setDefaultCommand(new Drive());
    }

    public void drive(double leftYAxis, double leftXAxis) {

        drive.arcadeDrive(Math.pow(leftYAxis, 3), Math.pow(leftXAxis, 3));
    }
}
