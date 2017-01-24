package org.usfirst.team5426.robot.subsystem;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.team5426.robot.commands.Drive;

/**
 * Created by Duncan on 1/24/2017.
 */
public class DriveTrain extends Subsystem {

    private Talon LEFT;
    private Talon RIGHT;

    private RobotDrive drive;

    public DriveTrain() {

        LEFT = new Talon(0);
        RIGHT = new Talon(1);

        drive = new RobotDrive(LEFT, RIGHT);
    }

    @Override
    protected void initDefaultCommand() {

        this.setDefaultCommand(new Drive());
    }

    public void drive(double leftYAxis, double leftXAxis) {

        drive.arcadeDrive(Math.pow(leftYAxis, 3), Math.pow(leftXAxis, 3));
    }
}
