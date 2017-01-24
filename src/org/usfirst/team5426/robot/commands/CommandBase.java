package org.usfirst.team5426.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.team5426.robot.subsystem.DriveTrain;
import org.usfirst.team5426.robot.OI;

/**
 * Created by Duncan on 1/24/2017.
 */
public abstract class CommandBase extends Command {

    public static DriveTrain drive;
    public static OI oi;

    public CommandBase(String name) {

        super(name);
    }

    public CommandBase() {

        super();
    }

    public static void init() {

        drive = new DriveTrain();
        oi = new OI();
    }

    public static void updateSmartBoard() {

    }
}
