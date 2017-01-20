package org.usfirst.frc.team5426.robot.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team5426.robot.subsystems.DriveTrain;

/**
 * Created by Duncan on 1/20/2017.
 */
public class Drive extends Command {

    private DriveTrain driveTrain;

    public Drive() {

        driveTrain = new DriveTrain();

        requires(driveTrain);
    }

    protected void initialize() {
    }

    protected void execute() {

        double sticky = 0, stickx = 0, stickz = 0, gyroangle = 0;

        driveTrain.getDrive().mecanumDrive_Cartesian(stickx, sticky, stickz, gyroangle);

        Timer.delay(0.05);
    }

    protected boolean isFinished() {

        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
