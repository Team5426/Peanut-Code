package org.usfirst.frc.team5426.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import org.usfirst.frc.team5426.robot.triggers.BallNearby;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	public static Joystick logitech = new Joystick(1);
	public static Joystick stick = new Joystick(0);
	//public static XBoxJoystick xBoxJoystick = new XBoxJoystick(1);
	//public static Joystick logitech = new Joystick(1);

    /*
    Button buttonName = new JoystickButton(joystickClass, buttonNumber);
    Refer to this picture to see which button and which axis maps to which number:
    XBOX: http://www.team358.org/files/programming/ControlSystem2015-2019/images/XBoxControlMapping.jpg
          http://www.chiefdelphi.com/forums/showpost.php?p=1003245&postcount=8
    LOGITECH: http://team358.org/files/programming/ControlSystem2009-/Extreme_3D_Pro.png

    Button buttonB = new JoystickButton(stick, 2);
    Button buttonY = new JoystickButton(stick, 4);
    Button lBumper = new JoystickButton(stick, 5);
    Button rBumper = new JoystickButton(stick, 6);
    */

	// XBox stuff
    Button buttonA = new JoystickButton(stick, 1);
    Button buttonB = new JoystickButton(stick, 2);
    Button buttonX = new JoystickButton(stick, 3);
    Button buttonY = new JoystickButton(stick, 4);
    Button rightBumper = new JoystickButton(stick, 6);
    
    // Logitech Joystick buttons
    Button logitechTrigger = new JoystickButton(logitech, 1);
    Button logitechSide = new JoystickButton(logitech, 2);
    
    BallNearby ballNearby = new BallNearby();

    public OI(){
        /*
        button.whileActive(new command());
        button.whenPressed(new command();
        ... and more http://wpilib.screenstepslive.com/s/3120/m/7952/l/97457-running-commands-on-joystick-input
        */

    	//buttonA.whileActive(new IntakeBall(1));
    	//buttonB.whileActive(new ShootBall(1));
    	//buttonX.whileActive(new LiftDown(1));
    	//buttonY.whileActive(new LiftUp(1));
    	//rightBumper.whileActive(new SetShootArm());
    	//rightBumper.toggleWhenPressed(new LockArm());
    	
    	//logitechTrigger.whileActive(new ShootBall(1));
    	//logitechSide.whileActive(new IntakeBall(1));

    	//xBoxJoystick.getButtonA().whileActive(new IntakeBall());
    	//xBoxJoystick.getButtonB().whileActive(new ShootBall());
    	
    	//xBoxJoystick.getButtonA().whileActive(new ExampleCommand());
    	
    	//SmartDashboard.putBoolean("Button A State", xBoxJoystick.getButtonA().get());
    	
    	//SmartDashboard.putData("Update Constants", new UpdateConstants());

    }

    
    // These could be deleted once the xbox class is working
    /**
     * @return Value of the left analog Y axis
     */
    public static double getLeftAxisY(){
    	return -stick.getRawAxis(1);
    }

    /**
     * @return Value of the left analog X axis
     */
    public static double getLeftAxisX(){
    	return -stick.getRawAxis(0);
    }

    /**
     * @return Value of the right analog Y axis
     */
    public static double getRightAxisY(){
    	return stick.getRawAxis(5);
    }


    /**
     * @return Value of the right analog X axis
     */
    public static double getRightAxisX(){
    	return stick.getRawAxis(4);
    }


}