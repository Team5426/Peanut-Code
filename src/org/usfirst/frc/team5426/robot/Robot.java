
package org.usfirst.frc.team5426.robot;

import edu.wpi.cscore.UsbCamera;
import edu.wpi.cscore.VideoSource;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc.team5426.robot.commands.CommandBase;

public class Robot extends IterativeRobot {

	public CameraServer camserver;
	public UsbCamera cam;

	public void robotInit() {

		camserver = CameraServer.getInstance();
		cam = new UsbCamera("cam0", 0);

		cam.setResolution(600, 600);

		camserver.addCamera(cam);

		camserver.startAutomaticCapture();
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
