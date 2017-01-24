package org.usfirst.team5426.robot;

import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.IterativeRobot;
import org.usfirst.team5426.robot.commands.CommandBase;

/**
 * Created by Duncan on 1/24/2017.
 */
public class Robot extends IterativeRobot {

    private CameraServer camserver;
    private UsbCamera cam;

    @Override
    public void robotInit() {

        CommandBase.init();
        OI.init();

        camserver = CameraServer.getInstance();
        cam = new UsbCamera("cam0", 0);

        cam.setResolution(500, 500);

        camserver.startAutomaticCapture(cam);
    }

    @Override
    public void disabledInit() {

    }

    @Override
    public void autonomousInit() {

    }

    @Override
    public void teleopInit() {

    }

    @Override
    public void disabledPeriodic() {

    }

    @Override
    public void teleopPeriodic() {

    }

    @Override
    public void autonomousPeriodic() {

    }
}
