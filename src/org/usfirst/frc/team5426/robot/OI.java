package org.usfirst.frc.team5426.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.GenericHID.RumbleType;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class OI {

    private static Joystick stick;

    private static Button buttonA;
    private static Button buttonB;
    private static Button buttonX;
    private static Button buttonY;

    private static Button rightBumper;
    private static Button leftBumper;

    public OI() {


    }

    public static void init() {

        stick = new Joystick(0);

        buttonA = new JoystickButton(stick, 1);
        buttonB = new JoystickButton(stick, 2);
        buttonX = new JoystickButton(stick, 3);
        buttonY = new JoystickButton(stick, 4);

        rightBumper = new JoystickButton(stick, 5);
        leftBumper = new JoystickButton(stick, 6);
    }

    public static double getLeftAxisY() {

        return -stick.getRawAxis(1);
    }

    public static double getLeftAxisX() {

        return -stick.getRawAxis(0);
    }

    public static double getRightAxisY(){

        return stick.getRawAxis(5);
    }


    public static double getRightAxisX() {

        return stick.getRawAxis(4);
    }
    
    public static void rumble(float l, float r) {
    	
		stick.setRumble(RumbleType.kLeftRumble, l);
		stick.setRumble(RumbleType.kRightRumble, r);
	}
}
