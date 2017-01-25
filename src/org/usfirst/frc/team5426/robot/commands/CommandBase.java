package org.usfirst.frc.team5426.robot.commands;

import edu.wpi.first.wpilibj.Ultrasonic;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team5426.robot.OI;
import org.usfirst.frc.team5426.robot.subsystems.DriveTrain;
import org.usfirst.frc.team5426.robot.subsystems.Ultra;

/**
 * Created by Duncan on 1/24/2017.
 */
public abstract class CommandBase extends Command {

    public static DriveTrain drive;
    public static OI oi;
    public static Ultra ultra;

    public CommandBase(String name) {

        super(name);
    }

    public CommandBase() {

        super();
    }

    public static void init() {

        drive = new DriveTrain();
        oi = new OI();
        ultra = new Ultra(1, 1);
    }

    public static void updateSmartBoard() {
    	
    	SmartDashboard.putNumber("Distance (IN)", ultra.getDistance());
    }
}
