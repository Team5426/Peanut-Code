package org.usfirst.team5426.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import org.usfirst.team5426.robot.OI;

public class Drive extends CommandBase {

    public Drive() {

        requires(drive);
    }

    protected void initialize() {

    }

    protected void execute() {

        drive.drive(OI.getLeftAxisY(), OI.getLeftAxisX());

        Timer.delay(0.005);
    }

    protected boolean isFinished() {

        return false;
    }

    protected void end() {

    }

    protected void interrupted() {

    }
}
