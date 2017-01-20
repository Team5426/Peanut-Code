package org.usfirst.frc.team5426.robot;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.tables.TableKeyNotDefinedException;

/**
 * Created by Duncan on 1/20/2017.
 */
public class RobotMap {

    public static int leftMotorChannel() {

        try {

            return ((int) SmartDashboard.getNumber("Motor Channel: Left"));

        } catch (TableKeyNotDefinedException e) {

            e.printStackTrace();
        }
    }

    public static int rightMotorChannel() {

        return ((int) SmartDashboard.getNumber("Motor Channel: Right"));
    }
}
