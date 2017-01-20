package org.usfirst.frc.team5426.robot.subsystems;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team5426.robot.RobotMap;

public class DriveTrain extends Subsystem {

    private RobotDrive drive;

    private Talon BACK_LEFT;
    private Talon FRONT_LEFT;

    public DriveTrain() {

        drive = new RobotDrive(RobotMap.leftMotorChannel(), RobotMap.rightMotorChannel());
    }

    @Override
    protected void initDefaultCommand() {


    }
    
    public RobotDrive getDrive() {
    	
    	return drive;
    }
}
