package org.usfirst.frc.team5426.robot;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class RobotMap {

    public static int leftMotorChannel() {

        if (SmartDashboard.containsKey("Motor Channel: Left")) {

            return ((int) SmartDashboard.getNumber("Motor Channel: Left"));
        }

        return -1;
    }

    public static int rightMotorChannel() {

        if (SmartDashboard.containsKey("Motor Channel: Right")) {

            return ((int) SmartDashboard.getNumber("Motor Channel: Right"));
        }

        return -1;
    }
}
