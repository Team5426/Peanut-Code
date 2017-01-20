
package org.usfirst.frc.team5426.robot;

import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.IterativeRobot;

/**
 * Created by Duncan on 1/20/2017.
 */
public class Robot extends IterativeRobot {

	public CameraServer camserver;
	public UsbCamera cam;

	public void robotInit() {

		camserver = CameraServer.getInstance();
		cam = new UsbCamera("cam0", 0);

		cam.setResolution(600, 600);

		camserver.addCamera(cam);

		camserver.startAutomaticCapture();

		OI.init();
	}

	public void autonomousInit() {

	}

	public void teleopInit() {

	}

	public void teleopPeriodic() {


	}

	public void autonomousPeriodic() {


	}
}
