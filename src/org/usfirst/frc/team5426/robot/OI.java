package org.usfirst.frc.team5426.robot;

import edu.wpi.first.wpilibj.Joystick;

/**
 * Created by Duncan on 1/20/2017.
 */
public class OI {

    public static Joystick stick;

    public static void init() {

        stick = new Joystick(0);
    }

    public OI() {

        
    }
}
